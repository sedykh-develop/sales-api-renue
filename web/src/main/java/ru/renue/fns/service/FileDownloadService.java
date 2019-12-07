package ru.renue.fns.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.InputStream;

@Service
public class FileDownloadService {

    private final RestTemplate restTemplate = new RestTemplate();

    public InputStream downloadFile(final String url) {
        return restTemplate.getForEntity(url, InputStream.class).getBody();
    }
}
