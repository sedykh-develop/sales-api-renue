package ru.renue.fns.wsdl.client.dto;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class ExpireTokenDelay implements Delayed {

    private final long expireTIme;

    public ExpireTokenDelay(long expireTIme) {
        this.expireTIme = expireTIme;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return  unit.convert(expireTIme - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long d = (getDelay(TimeUnit.NANOSECONDS) -
                o.getDelay(TimeUnit.NANOSECONDS));
        return (d == 0) ? 0 : ((d < 0) ? -1 : 1);
    }
}
