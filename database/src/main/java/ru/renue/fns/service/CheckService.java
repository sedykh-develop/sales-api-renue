package ru.renue.fns.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.renue.fns.dto.CheckDTO;
import ru.renue.fns.entity.Check;
import ru.renue.fns.repository.CheckRepository;

import java.sql.SQLException;

@Service
public class CheckService {

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private CheckRepository checkRepository;

    @Transactional
    public void save(final CheckDTO checkDTO) throws SQLException, JsonProcessingException {
        Check check = new Check();
        check.setId(new Check.CompositeId(checkDTO.getFn(), checkDTO.getFd(), checkDTO.getFs()));
        check.setJsonData(checkDTO.getJsonData());
        check.setState("");
        check.setTelegramUserId(checkDTO.getTelegramUserId());
        checkRepository.save(check);
    }
}
