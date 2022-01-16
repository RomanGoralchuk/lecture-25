package by.itacademy.javaenterprise.goralchuk.services;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Slf4j
@Data
@Service
@PropertySource("classpath:application.properties")
public class PageInfoService {
    @Value("${application.name}")
    private String appName;
    @Value("${application.message}")
    private String appMessage;
}
