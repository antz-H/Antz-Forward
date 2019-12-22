package com.antz.api.design.api;

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
