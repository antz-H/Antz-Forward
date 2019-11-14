package com.antz.domain.context;

import com.antz.domain.core.RuleRandomIdentity;

import javax.persistence.Embeddable;

/**
 * @discription
 * @author antz
 * @date 2019/11/14 22:20
 */
@Embeddable /*表示一个嵌入类，在另一个实体类中充当属性*/
public final class SupplierId extends RuleRandomIdentity {

    private static final long serialVersionUID = -5677075329136057588L;

    private String supplierId;

    public SupplierId() {
    }

    public SupplierId(int seed) {
        super(seed);
    }

    public SupplierId(String prefix, int seed) {
        super(prefix, seed);
    }

    public SupplierId(String prefix, int seed, String joiner) {
        super(prefix, seed, joiner);
    }
}
