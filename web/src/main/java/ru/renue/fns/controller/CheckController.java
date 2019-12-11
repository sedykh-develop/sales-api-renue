package ru.renue.fns.controller;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.renue.fns.QrDecodeService;
import ru.renue.fns.DecodeQrDTO;
import ru.renue.fns.dto.CheckDTO;
import ru.renue.fns.service.CheckService;
import ru.renue.fns.service.FileDownloadService;
import ru.renue.fns.wsdl.client.dto.kkt.GetTicketResponse;
import ru.renue.fns.wsdl.client.dto.kkt.api.AuthenticationException;
import ru.renue.fns.wsdl.client.dto.kkt.api.MessageNotFoundException;
import ru.renue.fns.wsdl.client.service.SalesService;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.sql.SQLException;

@RestController("v1")
@Slf4j
public class CheckController {

    @Autowired
    private SalesService salesService;

    @Autowired
    private QrDecodeService qrDecodeService;

    @Autowired
    private CheckService checkService;

    @GetMapping("get/check")
    public String getSales(@RequestParam("fn") String fn, @RequestParam("fdn") String fdn,
                           @RequestParam("fd") String fd, @RequestParam("sum") String sum,
                           @RequestParam("date") String date) throws InterruptedException, AuthenticationException, MessageNotFoundException, JAXBException {
        GetTicketResponse response = salesService.execute(date, sum, fd, fn, fdn);
        log.info("Receive response {}", response.getResult().getMessage());
        return response.getResult().getTicket();
    }

    @PostMapping("send/checkImage")
    public String sendSalesImage(@RequestParam("file") MultipartFile file, @RequestParam("userId") String userId) throws IOException, InterruptedException, AuthenticationException, MessageNotFoundException, JAXBException, FormatException, ChecksumException, NotFoundException, SQLException {
        DecodeQrDTO decodeQrDTO = qrDecodeService.decode(file.getInputStream());
        GetTicketResponse response = salesService.execute(decodeQrDTO.getDate(), decodeQrDTO.getSum(), decodeQrDTO.getFd(), decodeQrDTO.getFn(), decodeQrDTO.getFs(), decodeQrDTO.getOperationType());
        if (response.getResult().getMessage() != null) {
            log.info("Receive response {}", response.getResult().getMessage());
            return response.getResult().getMessage();
        }

        checkService.save(CheckDTO.builder().fd(decodeQrDTO.getFd()).fn(decodeQrDTO.getFn()).fs(decodeQrDTO.getFs())
                .jsonData(response.getResult().getTicket()).telegramUserId(Long.parseLong(userId)).build());
        return response.getResult().getTicket();
    }
}
