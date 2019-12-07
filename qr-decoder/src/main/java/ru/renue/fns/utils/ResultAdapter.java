package ru.renue.fns.utils;

import com.google.zxing.Result;
import lombok.NonNull;
import ru.renue.fns.SalesDTO;
import ru.renue.fns.exception.QrReaderRuntimeException;

import java.util.Objects;

import static ru.renue.fns.constant.SalesConstant.*;

public final class ResultAdapter {

    private ResultAdapter() {
    }

    public static SalesDTO convert(@NonNull final Result result) {
        Objects.requireNonNull(result);

        if (result.getText().isEmpty()) {
            throw new QrReaderRuntimeException(String.format("Result is null %s", result));
        }

        SalesDTO.SalesDTOBuilder salesDtoBuilder = SalesDTO.builder();
        for (String resultPair : result.getText().split(PAIR_DELIMITER)) {
            String[] keyValuePair = resultPair.split(KEY_VALUE_DELIMITER);
            add(keyValuePair[0], keyValuePair[1], salesDtoBuilder);
        }

        return salesDtoBuilder.build();
    }

    private static void add(String key, String value, SalesDTO.SalesDTOBuilder salesDtoBuilder) {
        switch (key) {
            case FD : {
                salesDtoBuilder.fd(value);
                break;
            }
            case FN : {
                salesDtoBuilder.fn(value);
                break;
            }
            case FS : {
                salesDtoBuilder.fs(value);
                break;
            }
            case SUM : {
                salesDtoBuilder.sum(getNormalizeSum(value));
                break;
            }
            case OPERATION_TYPE : {
                salesDtoBuilder.operationType(value);
                break;
            }
            case DATE : {
                salesDtoBuilder.date(getNormalizeDate(value));
                break;
            }
        }
    }

    private static String getNormalizeSum(String value) {
        if (value.indexOf('.') > 0) {
            return value.replace(".", "");
        }

        return value;
    }

    //2019-11-03T19:49:00
    //t=20181031T1128&s=10675.20&fn=8710000100995948&i=975&fp=2718329199&n=1
    private static String getNormalizeDate(String value) {
        String year = value.substring(0, 4);
        String month = value.substring(4, 6);
        String day = value.substring(6, 8);
        String hour = value.substring(9, 11);
        String minute = value.substring(11);

        return String.format("%s-%s-%sT%s:%s:00", year, month, day, hour, minute);
    }
}
