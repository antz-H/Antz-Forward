package com.antz.domain.context.supplier;

import com.antz.domain.context.supplierhotel.SupplierHotel;
import com.antz.domain.core.AbstractEntity;
import com.antz.domain.core.AggregateRoot;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author antz-H
 * @description
 * @date 2020/3/15 17:13
 **/
@Document(collection = "supplier")
@Getter
public class Supplier extends AbstractEntity<SupplierId> implements AggregateRoot<Supplier> {

    private String name;

    public static Supplier of(String supplierCode, String name) {
        return new Supplier(supplierCode, name);
    }

    /**
     *  why need a non-Constructor? you can  refer this class
     * org.springframework.data.mapping.PersistentEntity#getPersistenceConstructor()
     * if : there  use Business Model and Data Model are different, then there don not need not-Constructor
     */
    private Supplier() {
    }

    private Supplier(String supplierCode, String name) {
        super(SupplierId.of(supplierCode));
        this.name = name;
    }

    public SupplierHotel newHotel(String code, String name) {
        return SupplierHotel.of(this.id(), code, name);
    }

    public SupplierRatePlan newRatePlan(String code) {
        return SupplierRatePlan.of(code);
    }

    @Override
    public Supplier root() {
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
