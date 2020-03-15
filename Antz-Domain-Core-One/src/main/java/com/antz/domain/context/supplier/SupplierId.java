package com.antz.domain.context.supplier;

import com.antz.domain.core.AssertionConcern;
import com.antz.domain.core.Identity;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * @author antz
 * @discription
 * @date 2019/11/14 22:20
 */
@Embeddable /*表示一个嵌入类，在另一个实体类中充当属性*/
public final class SupplierId extends AssertionConcern implements Identity<String> {

    private static final long serialVersionUID = -5677075329136057588L;

    private String code;

    private SupplierId(String code) {
        this.assertArgumentNotEmpty(code, "Supplier Code must not be empty!");
        this.code = code;
    }

    public static SupplierId of(String supplierCode) {
        return new SupplierId(supplierCode);
    }

    @Override
    public String value() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupplierId that = (SupplierId) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
