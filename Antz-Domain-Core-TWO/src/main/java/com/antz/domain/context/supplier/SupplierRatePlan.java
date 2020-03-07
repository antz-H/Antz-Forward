package com.antz.domain.context.supplier;

import com.antz.domain.core.AbstractStateDomainEntity;
import com.antz.domain.core.State;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/8
 **/
public class SupplierRatePlan extends AbstractStateDomainEntity<RatePlanId> {

    private static final long serialVersionUID = -8156013988639047011L;

    public static SupplierRatePlan of(String code, State state) {
        return new SupplierRatePlan(code, state);
    }

    private SupplierRatePlan(String code, State state) {
        super(RatePlanId.of(code), state);
    }

}
