package com.antz.domain.core;

import java.io.Serializable;

/**
 * @author antz
 * @description
 * @date 2019/11/11
 */
public interface Identity<T> extends Serializable {

    T value();

}
