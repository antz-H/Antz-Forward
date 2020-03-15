package com.antz.domain.context.supplier;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SupplierTest {


    public static final String CODE_001 = "code001";
    public static final String CODE_002 = "code002";

    @Test
    public void test_not_Equals() {
        SupplierId code_001 = SupplierId.of(CODE_001);
        SupplierId code_002 = SupplierId.of(CODE_002);
        Assertions.assertThat(code_001).isNotEqualTo(code_002);
    }

    @Test
    public void test_Equals() {
        SupplierId code_001 = SupplierId.of(CODE_001);
        SupplierId code_002 = SupplierId.of(CODE_001);
        Assertions.assertThat(code_001).isEqualTo(code_002);
    }


}
