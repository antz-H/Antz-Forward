package com.antz.domain.context.supplier;

import java.util.Optional;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 **/
public interface SupplierRepository {

    /**
     * factory method
     *
     * @param supplierId
     * @return
     */
    Optional<Supplier> SupplierOf(SupplierId supplierId);

    /**
     * create or update Supplier
     *
     * @param supplier
     * @return
     */
    Supplier save(Supplier supplier);

}
