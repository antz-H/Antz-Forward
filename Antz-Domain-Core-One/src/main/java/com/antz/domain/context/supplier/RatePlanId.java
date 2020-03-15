package com.antz.domain.context.supplier;

import com.antz.domain.core.Identity;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * @author antz-H
 * @description
 * @date 2020/3/15 17:31
 **/
@Embeddable
public final class RatePlanId implements Identity<String> {

    // Because SupplierRatePlan has already belonged Supplier ,so do not need SupplierId .
    //private SupplierId supplierId ;

    private String code;

    public static RatePlanId of(String ratePlanCode) {
        return new RatePlanId(ratePlanCode);
    }

    private RatePlanId(String code) {
        this.code = code;
    }

    @Override
    public String value() {
        return code;
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
