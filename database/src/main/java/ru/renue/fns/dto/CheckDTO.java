package ru.renue.fns.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CheckDTO {
    private final String jsonData;

    private final Long telegramUserId;

    private final String fn;

    private final String fd;

    private final String fs;
}
