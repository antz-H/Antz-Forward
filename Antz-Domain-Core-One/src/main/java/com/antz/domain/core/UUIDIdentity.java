package com.antz.domain.core;



import org.hibernate.annotations.Immutable;

import java.util.UUID;

/**
 * @author antz
 * @description
 * @date 2019/11/11
 */
@Immutable
public class UUIDIdentity implements RandomIdentity<String>, Identity<String> {

    private static final long serialVersionUID = -6165866408181454201L;
    private String value;

    public UUIDIdentity() {
        this.value = next();
    }

    @Override
    public String next() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String value() {
        return value;
    }

}
