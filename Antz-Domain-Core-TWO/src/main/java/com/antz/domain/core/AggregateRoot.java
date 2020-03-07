package com.antz.domain.core;

/**
 * @author Antz-H
 * @description
 * @date 2020/3/7
 **/
public abstract class AggregateRoot<T extends ID> extends AbstractStateDomainEntity<T> {
    private static final long serialVersionUID = 6354755646298990897L;

    public AggregateRoot(T bizID, State state) {
        super(bizID, state);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
