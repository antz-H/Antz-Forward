package com.antz.domain.core;

/**
 * @author antz
 * @description
 * @date 2019/11/11
 */
public interface AggregateRoot<R extends AbstractEntity> {

    R root();

}
