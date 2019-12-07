package ru.renue.fns.service;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import ru.renue.fns.QrDecodeService;
import ru.renue.fns.SalesDTO;
import ru.renue.fns.utils.ResultAdapter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class QrDecodeServiceImpl implements QrDecodeService {

    private final QRCodeReader qrCodeReader = new QRCodeReader();

    @Override
    public SalesDTO decode(File image) throws IOException, FormatException, ChecksumException, NotFoundException {
        return decode(ImageIO.read(image));
    }

    @Override
    public SalesDTO decode(InputStream imageInputStream) throws IOException, FormatException, ChecksumException, NotFoundException {
        return decode(ImageIO.read(imageInputStream));
    }

    private SalesDTO decode(final BufferedImage bufferedImage) throws FormatException, ChecksumException, NotFoundException {
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        return ResultAdapter.convert(qrCodeReader.decode(bitmap));
    }
}
