package com.antz.domain.core;

import lombok.Getter;

import java.util.Objects;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 * It is the superClass of Entity or AggregateRoot in DDD
 **/
@Getter
public abstract class AbstractStateDomainEntity<T extends ID> extends AbstractDomainEntity<T> {

    private static final long serialVersionUID = 4556643937305246477L;
    private State state;


    public AbstractStateDomainEntity(T bizID, State state) {
        super(bizID);
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        AbstractStateDomainEntity<?> that = (AbstractStateDomainEntity<?>) o;
        // there must be consider state ,because sometimes use logic to delete a piece of data .
        return state == that.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), state);
    }
}
