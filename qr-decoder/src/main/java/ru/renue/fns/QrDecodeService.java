package ru.renue.fns;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface QrDecodeService {

    DecodeQrDTO decode(File image) throws IOException, FormatException, ChecksumException, NotFoundException;

    DecodeQrDTO decode(InputStream imageInputStream) throws IOException, FormatException, ChecksumException, NotFoundException;
}
