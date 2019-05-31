package com.superweb.example.controller;

import com.superweb.example.model.Customer;
import com.superweb.example.service.CustomerService;
import com.superweb.framework.annotation.Action;
import com.superweb.framework.annotation.Controller;
import com.superweb.framework.annotation.Inject;
import com.superweb.framework.bean.Param;
import com.superweb.framework.bean.View;

import java.util.List;

/**
 * the class is a controller that it hndler client's request
 * @author Dong Chan
 * @date 2019/5/30
 * @time 10:30 PM
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;


    @Action("get:/customer")
    public View index(Param param){
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList",customerList);
    }
}
