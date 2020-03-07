package com.antz.application;

import com.antz.domain.context.supplier.Supplier;
import com.antz.domain.context.supplier.SupplierId;
import com.antz.domain.context.supplier.SupplierRepository;
import com.antz.domain.context.supplierhotel.SupplierHotel;
import com.antz.domain.context.supplierhotel.SupplierHotelId;
import com.antz.domain.context.supplierhotel.SupplierHotelRepository;
import com.antz.domain.core.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author antz-H
 * @description
 * @date 2020/3/8
 **/
@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private SupplierHotelRepository supplierHotelRepository;

    public void createSupplier(String code, String name) {
        Supplier supplier = Supplier.of(code, State.ACTIVATE, name);
        supplierRepository.save(supplier);
    }

    public void createSupplierHotel(String code, String hotelCode, String name) {

        Optional<Supplier> supplierOptional = supplierRepository.SupplierOf(SupplierId.of(code));

        supplierOptional.ifPresent(supplier -> {
            SupplierHotel supplierHotel = supplier.newHotel(hotelCode, name, State.ACTIVATE);
            supplierHotelRepository.save(supplierHotel);
        });
    }

    public SupplierHotel findSupplierHotel(String supplierCode, String hotelCode) {
        Supplier supplier = supplierRepository.SupplierOf(SupplierId.of(supplierCode)).orElseThrow(() -> new RuntimeException());
        return supplierHotelRepository.SupplierHotelOf(SupplierHotelId.of(supplier.getSupplierId(), hotelCode)).orElseThrow(() -> new RuntimeException());
    }

}
