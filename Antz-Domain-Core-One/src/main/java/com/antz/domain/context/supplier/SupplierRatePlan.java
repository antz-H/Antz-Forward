package com.antz.domain.context.supplier;

import com.antz.domain.core.AbstractEntity;

/**
 * @author antz-H
 * @description
 * @date 2020/3/15  17:30
 **/
public class SupplierRatePlan extends AbstractEntity<RatePlanId> {
    private static final long serialVersionUID = 1935190636414532146L;

    public static SupplierRatePlan of(String ratePlanCode) {
        return new SupplierRatePlan(ratePlanCode);
    }

    private SupplierRatePlan(String ratePlanCode) {
        super(RatePlanId.of(ratePlanCode));
    }
}
