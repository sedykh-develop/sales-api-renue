package ru.renue.fns;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DecodeQrDTO {
    private final String date;
    private final String fs;
    private final String fd;
    private final String fn;
    private final String n;
    private final String sum;
    private final String operationType;
}
