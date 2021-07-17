package com.antz.api.design.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author antz-H
 * @description
 * @date 2019/12/22
 **/
@RestController
public interface SupplierAPI {

    @GetMapping()
    public void list();
}
