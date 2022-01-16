package by.itacademy.javaenterprise.goralchuk.controller;

import by.itacademy.javaenterprise.goralchuk.services.PageInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RequestMapping("/")
@Controller
public class PageController {
    @Autowired
    private PageInfoService pageInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcomePage(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("nameApp",pageInfoService.getAppName());
        modelAndView.addObject("baseText",pageInfoService.getAppMessage());
        return modelAndView;
    }
}
