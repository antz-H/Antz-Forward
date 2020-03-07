package com.antz.domain.core;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 */
public abstract class ID implements Serializable {

    private static final long serialVersionUID = -6936162521699449455L;
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ID id1 = (ID) o;
        return Objects.equals(id, id1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
