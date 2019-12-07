package ru.renue.fns.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.renue.fns.QrDecodeService;
import ru.renue.fns.service.QrDecodeServiceImpl;

@Configuration
public class RootConfig {

    @Bean
    public QrDecodeService qrDecodeService() {
        return new QrDecodeServiceImpl();
    }
}
