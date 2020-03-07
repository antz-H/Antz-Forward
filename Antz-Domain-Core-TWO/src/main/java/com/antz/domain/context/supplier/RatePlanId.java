package com.antz.domain.context.supplier;

import com.antz.domain.core.ID;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/8
 **/
@Embeddable
public class RatePlanId extends ID {

    private final String code;

    public static RatePlanId of(String code) {
        return new RatePlanId(code);
    }

    private RatePlanId(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RatePlanId that = (RatePlanId) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
