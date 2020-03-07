package com.antz.infra.factory;

import com.antz.domain.context.supplierhotel.SupplierHotel;
import com.antz.domain.context.supplierhotel.SupplierHotelId;
import com.antz.domain.context.supplierhotel.SupplierHotelRepository;
import com.antz.infra.persistence.mongo.SupplierHotelMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Administrator
 * @description
 * @date 2020/3/8 0008 21:05
 **/
@Repository
public class SupplierHotelFactoryRepository implements SupplierHotelRepository {

    @Autowired
    private SupplierHotelMongoRepository supplierHotelMongoRepository;

    @Override
    public Optional<SupplierHotel> SupplierHotelOf(SupplierHotelId supplierHotelId) {
        return supplierHotelMongoRepository.findBySupplierHotelId(supplierHotelId);
    }

    @Override
    public SupplierHotel save(SupplierHotel supplierHotel) {
        return supplierHotelMongoRepository.save(supplierHotel);
    }
}
