package com.antz.domain.context.supplierhotel;

import com.antz.domain.context.supplier.SupplierId;
import com.antz.domain.core.ID;
import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Objects;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 **/
@Getter
@Embeddable
public final class SupplierHotelId extends ID {

    private static final long serialVersionUID = 2587860304257763631L;
    @Embedded
    private final SupplierId supplierId;

    private final String code;

    private SupplierHotelId(SupplierId supplierId, String code) {
        this.supplierId = supplierId;
        this.code = code;
    }

    public static SupplierHotelId of(SupplierId supplierId, String code) {
        return new SupplierHotelId(supplierId, code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupplierHotelId that = (SupplierHotelId) o;
        return Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, code);
    }
}
