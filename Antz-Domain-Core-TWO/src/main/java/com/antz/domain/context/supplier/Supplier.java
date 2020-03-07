package com.antz.domain.context.supplier;

import com.antz.domain.context.supplierhotel.SupplierHotel;
import com.antz.domain.core.AggregateRoot;
import com.antz.domain.core.State;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embedded;
import java.util.List;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 **/
@Document(collection = "supplier")
@Getter
public class Supplier extends AggregateRoot<SupplierId> {
    private static final long serialVersionUID = -953186664706164743L;
    @Embedded
    private SupplierId supplierId;

    private String name;

    private List<SupplierRatePlan> supplierRatePlans;

    public static Supplier of(String code, State state, String name) {
        return new Supplier(SupplierId.of(code), state, name);
    }

    private Supplier(SupplierId supplierId, State state, String name) {
        super(supplierId, state);
        this.supplierId = supplierId;
        this.name = name;
    }

    public String code() {
        return this.getBizID().getCode();
    }

    public SupplierHotel newHotel(String code, String name, State state) {
        return SupplierHotel.of(this.getBizID(), code, state, name);
    }

    public SupplierRatePlan newRatePlan(String code, State state) {
        return SupplierRatePlan.of(code, state);
    }
}
