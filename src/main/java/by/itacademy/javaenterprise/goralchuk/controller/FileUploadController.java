package by.itacademy.javaenterprise.goralchuk.controller;

import by.itacademy.javaenterprise.goralchuk.services.FileUploadService;
import by.itacademy.javaenterprise.goralchuk.services.PageInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class FileUploadController {
    @Autowired
    private PageInfoService pageInfoService;
    @Autowired
    private FileUploadService fileUploadService;

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public ModelAndView uploadPage(){
        ModelAndView modelAndView = new ModelAndView("upload");
        modelAndView.addObject("nameApp",pageInfoService.getAppName());
        return modelAndView;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView uploadFile(@RequestParam("file") MultipartFile multipartFile, HttpSession session){
        ModelAndView modelAndView = new ModelAndView("show");
        String uploadDir = session.getServletContext().getRealPath("/") + "/resources/";

        if(fileUploadService.saveFile(uploadDir, multipartFile)){
            Map<String, Object> modelMap = new HashMap<>();
            modelMap.put("fileName", multipartFile.getOriginalFilename());
            modelMap.put("fileSize", multipartFile.getSize());
            try {
                modelMap.put("filePath", multipartFile.getResource().getURI());
            } catch (IOException e) {
                log.error("Error url {}", e.getMessage(), e);
            }
            modelAndView.addAllObjects(modelMap);
            return modelAndView;
        }
        return new ModelAndView("error");
    }
}
