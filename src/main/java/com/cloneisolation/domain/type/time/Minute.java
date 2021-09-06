package com.cloneisolation.domain.type.time;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.time.DateTimeException;

public class Minute {
    @Min(value = 0, message = "分は自然数を許可しています") int value;

    @Deprecated
    Minute() {}

    public Minute(int value) {
        this.value = value;
    }

    public static Minute from(String time) {
        try {
            Integer value = time.isEmpty()
                            ? 0
                            : Integer.parseInt(time);
            if (value < 0) throw new DateTimeException("分が負の値になっています.");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("分が負の値になっています.");
        }
        throw new NumberFormatException("分が負の値になっています.");
    }

    private Minute add(int other) {
        return new Minute(value + other);
    }

    public Minute add(Minute other) {
        return add(other.value);
    }

    public Minute sub(Minute other) {
        return add(0 - other.value);
    }

    public boolean lessThan(Minute other) {
        return this.value < other.value;
    }

    public boolean moreThan(Minute other) {
        return this.value > other.value;
    }

    public BigDecimal ofBigDecimal() {
        return BigDecimal.valueOf(value);
    }

    @Override
    public String toString() {
        return "Minute{" + "value=" + value + '}';
    }

    int toInt() {
        return value;
    }
}
