package ru.renue.fns.service;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import org.junit.Test;
import ru.renue.fns.SalesDTO;
import ru.renue.fns.utils.ResultAdapter;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class QrDecodeServiceImplTest {

    @Test
    public void decodeWithDto() throws FormatException, ChecksumException, NotFoundException, IOException {

        QrDecodeServiceImpl qrDecodeService = new QrDecodeServiceImpl();
        File file = new File("src\\test\\resources\\photo_2019-12-07_17-49-30.jpg");
        SalesDTO dto = qrDecodeService.decode(file);
        SalesDTO expected = SalesDTO.builder().date("2019-12-01T21:39:00").fd("46945").fs("3195601703")
                .fn("9280440300249440").sum("9900").operationType("1").build();
        assertEquals(expected.getDate(), dto.getDate());
        assertEquals(expected.getFd(), dto.getFd());
        assertEquals(expected.getFs(), dto.getFs());
        assertEquals(expected.getFn(), dto.getFn());
        assertEquals(expected.getSum(), dto.getSum());
        assertEquals(expected.getOperationType(), dto.getOperationType());
    }
}