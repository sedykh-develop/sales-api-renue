package ru.renue.fns.controller;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.renue.fns.QrDecodeService;
import ru.renue.fns.SalesDTO;
import ru.renue.fns.service.FileDownloadService;
import ru.renue.fns.wsdl.client.dto.kkt.GetTicketResponse;
import ru.renue.fns.wsdl.client.dto.kkt.api.AuthenticationException;
import ru.renue.fns.wsdl.client.dto.kkt.api.MessageNotFoundException;
import ru.renue.fns.wsdl.client.service.SalesService;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController("v1")
@Slf4j
public class SalesController {

    @Autowired
    private SalesService salesService;

    @Autowired
    private QrDecodeService qrDecodeService;

    @Autowired
    private FileDownloadService fileDownloadService;

    @GetMapping("get/sales")
    public String getSales(@RequestParam("fn") String fn, @RequestParam("fdn") String fdn,
                           @RequestParam("fd") String fd, @RequestParam("sum") String sum,
                           @RequestParam("date") String date) throws InterruptedException, AuthenticationException, MessageNotFoundException, JAXBException {
        GetTicketResponse response = salesService.execute(date, sum, fd, fn, fdn);
        log.info("Receive response {}", response.getResult().getMessage());
        return response.getResult().getTicket();
    }


    @GetMapping("get/salesInfo")
    public String getSales(@RequestParam("url") String fileUrl) throws FormatException, ChecksumException, NotFoundException, IOException, InterruptedException, AuthenticationException, MessageNotFoundException, JAXBException {
        SalesDTO salesDTO = qrDecodeService.decode(fileDownloadService.downloadFile(fileUrl));
        GetTicketResponse response = salesService.execute(salesDTO.getDate(), salesDTO.getSum(), salesDTO.getFd(), salesDTO.getFn(), salesDTO.getFs(), salesDTO.getOperationType());
        log.info("Receive response {}", response.getResult().getMessage());
        return response.getResult().getTicket();
    }
}
