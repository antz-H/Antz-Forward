package com.antz.application;

import com.antz.domain.context.supplierhotel.SupplierHotel;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SupplierServiceTest {

    @Autowired
    private SupplierService supplierService;
    public static final String CODE = "HILTON" + System.currentTimeMillis();
    public static final String NAME = "HILTON";

    @Test
    public void testCreateSupplier() {
        supplierService.createSupplier(CODE, NAME);
    }


    @Test
    public void testCreateSupplierHotel() {
        testCreateSupplier();
        String hotelCode = "ANTZ";
        String name = "ANTZ";
        supplierService.createSupplierHotel(CODE, hotelCode, name);
        SupplierHotel supplierHotel = supplierService.findSupplierHotel(CODE, hotelCode);
        Assertions.assertThat(supplierHotel).isNotNull();
    }
}
