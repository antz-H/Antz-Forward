package com.antz.domain.context.supplierhotel;

import java.util.Optional;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 **/
public interface SupplierHotelRepository {

    /**
     * factory method
     *
     * @param supplierHotelId
     * @return
     */
    Optional<SupplierHotel> SupplierHotelOf(SupplierHotelId supplierHotelId);

    /**
     * create or update SupplierHotel
     *
     * @param supplierHotel
     * @return
     */
    SupplierHotel save(SupplierHotel supplierHotel);

}
