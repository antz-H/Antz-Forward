package com.antz.infra.persistence.mongo;

import com.antz.domain.context.supplierhotel.SupplierHotel;
import com.antz.domain.context.supplierhotel.SupplierHotelId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author antz-H
 * @description
 * @date 2020/3/8 0008 16:17
 **/
public interface SupplierHotelMongoRepository extends MongoRepository<SupplierHotel, SupplierHotelId> {

}
