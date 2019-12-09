package ru.renue.fns.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.renue.fns.repository.CheckRepository;

@Service
public class CheckService {

    @Autowired
    private CheckRepository checkRepository;
}
