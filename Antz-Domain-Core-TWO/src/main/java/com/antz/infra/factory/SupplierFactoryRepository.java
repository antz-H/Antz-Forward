package com.antz.infra.factory;

import com.antz.domain.context.supplier.Supplier;
import com.antz.domain.context.supplier.SupplierId;
import com.antz.domain.context.supplier.SupplierRepository;
import com.antz.infra.persistence.mongo.SupplierMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Administrator
 * @description
 * @date 2020/3/8 0008 16:15
 **/
@Repository
public class SupplierFactoryRepository implements SupplierRepository {

    @Autowired
    private SupplierMongoRepository supplierMongoRepository;

    @Override
    public Optional<Supplier> SupplierOf(SupplierId supplierId) {
        return supplierMongoRepository.findBySupplierId(supplierId);
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierMongoRepository.save(supplier);
    }
}
