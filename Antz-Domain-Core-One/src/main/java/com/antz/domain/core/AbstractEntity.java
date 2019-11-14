package com.antz.domain.core;

/**
 * @author antz
 * @description
 * @date 2019/11/11
 */
public abstract class AbstractEntity<ID extends Identity> {

    public abstract ID id();

}
