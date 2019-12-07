package ru.renue.fns;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface QrDecodeService {

    SalesDTO decode(File image) throws IOException, FormatException, ChecksumException, NotFoundException;

    SalesDTO decode(InputStream imageInputStream) throws IOException, FormatException, ChecksumException, NotFoundException;
}
