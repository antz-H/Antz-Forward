package com.antz.domain.context.supplierhotel;

import com.antz.domain.context.supplier.SupplierId;
import com.antz.domain.core.AbstractEntity;
import com.antz.domain.core.AggregateRoot;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author antz-H
 * @description
 * @date 2020/3/15 17:47
 **/
@Document(collection = "supplier_hotel")
@Getter
public class SupplierHotel extends AbstractEntity<SupplierHotelId> implements AggregateRoot<SupplierHotel> {
    private static final long serialVersionUID = 2902029502623390036L;

    private String name;


    private SupplierHotel() {
    }

    public static SupplierHotel of(SupplierId supplierId, String hotelCode, String name) {
        return new SupplierHotel(supplierId, hotelCode, name);
    }

    private SupplierHotel(SupplierId supplierId, String hotelCode, String name) {
        super(SupplierHotelId.of(supplierId, hotelCode));
        this.name = name;
    }

    @Override
    public SupplierHotel root() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
