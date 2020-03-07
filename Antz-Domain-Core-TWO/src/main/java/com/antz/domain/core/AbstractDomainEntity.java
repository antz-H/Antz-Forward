package com.antz.domain.core;

import lombok.Getter;

import javax.persistence.Embedded;
import java.util.Objects;

/**
 * @author Administrator
 * @description
 * @date 2020/3/8 0008 0:01
 **/
@Getter
public abstract class AbstractDomainEntity<T extends ID> extends AbstractEntity {
    private static final long serialVersionUID = -8858038006765255582L;
    /**
     * maybe delete ,the best
     */
    @Embedded
    private T bizID;

    public AbstractDomainEntity(T bizID) {
        this.bizID = bizID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractDomainEntity<?> that = (AbstractDomainEntity<?>) o;
        return Objects.equals(bizID, that.bizID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bizID);
    }

    @Override
    public String toString() {
        return bizID.toString();
    }
}
