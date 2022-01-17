package by.itacademy.javaenterprise.goralchuk.services;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@Data
@Service
public class FileUploadService {
    public static final String SAVE_LOCATION = "/resources/";

    public boolean saveFile(MultipartFile multipartFile) {
        boolean result = false;
        String fileName = multipartFile.getOriginalFilename();
        File pathFile = new File(SAVE_LOCATION);
        if (!pathFile.exists()) {
            pathFile.mkdir();
        }
        pathFile = new File(SAVE_LOCATION + fileName);
        try {
            multipartFile.transferTo(pathFile);
            result = true;
        } catch (IOException e) {
            log.error("Error {}", e.getMessage(), e);
        }
        return result;
    }
}
