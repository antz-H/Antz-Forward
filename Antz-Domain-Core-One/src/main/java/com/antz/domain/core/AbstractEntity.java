package com.antz.domain.core;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author antz
 * @description
 * @date 2019/11/11
 */
public abstract class AbstractEntity<ID extends Identity> implements Serializable {

    private static final long serialVersionUID = 1L;
    private ID id;

    public ID id() {
        return id;
    }

    public AbstractEntity() {
    }

    public AbstractEntity(ID id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractEntity<?> that = (AbstractEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
