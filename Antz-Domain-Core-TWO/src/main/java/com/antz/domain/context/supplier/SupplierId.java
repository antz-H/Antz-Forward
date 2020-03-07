package com.antz.domain.context.supplier;

import com.antz.domain.core.ID;
import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 **/
@Getter
@Embeddable
public final class SupplierId extends ID {
    private static final long serialVersionUID = 8457724979104197854L;
    private final String code;

    private SupplierId(String code) {
        this.code = code;
    }

    public static SupplierId of(String code) {
        return new SupplierId(code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupplierId that = (SupplierId) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return code;
    }
}
