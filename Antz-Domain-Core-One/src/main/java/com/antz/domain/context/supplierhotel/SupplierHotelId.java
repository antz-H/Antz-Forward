package com.antz.domain.context.supplierhotel;

import com.antz.domain.context.supplier.SupplierId;
import com.antz.domain.core.AssertionConcern;
import com.antz.domain.core.Identity;

import javax.persistence.Embeddable;

/**
 * @author antz-H
 * @description
 * @date 2020/3/15 17:01
 **/
@Embeddable
public final class SupplierHotelId extends AssertionConcern implements Identity<String> {

    private static final String DEFAULT_JOINER = "_";

    private static final long serialVersionUID = 8476089312966086474L;
    private SupplierId supplierId;
    private String code;

    private SupplierHotelId(SupplierId supplierId, String code) {
        this.assertArgumentNotEmpty(code, "SupplierId must not be empty!");
        this.assertArgumentNotEmpty(code, "SupplierHotel Code must not be empty!");
        this.supplierId = supplierId;
        this.code = code;
    }

    public static SupplierHotelId of(SupplierId supplierId, String code) {
        return new SupplierHotelId(supplierId, code);
    }

    @Override
    public String value() {
        return supplierId.value() + DEFAULT_JOINER + code;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
