package com.antz.domain.context.supplierhotel;

import com.antz.domain.context.supplier.SupplierId;
import com.antz.domain.core.AggregateRoot;
import com.antz.domain.core.State;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 **/
@Document(collection = "supplier_hotel")
@Getter
public class SupplierHotel extends AggregateRoot<SupplierHotelId> {

    private static final long serialVersionUID = -5086515483651528506L;

    private SupplierHotelId supplierHotelId;

    private String name;


    public static SupplierHotel of(SupplierId supplierId, String code, State state, String name) {
        return new SupplierHotel(SupplierHotelId.of(supplierId, code), state, name);
    }

    private SupplierHotel(SupplierHotelId supplierHotelId, State state, String name) {
        super(supplierHotelId, state);
        this.supplierHotelId = supplierHotelId;
        this.name = name;
    }

    public String code() {
        return this.getBizID().getCode();
    }
}
