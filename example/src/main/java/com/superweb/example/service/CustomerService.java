package com.superweb.example.service;

import com.superweb.example.model.Customer;
import com.superweb.framework.annotation.Service;
import com.superweb.framework.helper.DatabaseHelper;

import java.util.List;

/**
 * the class is a service that provide client's data
 * @author Dong Chan
 * @date 2019/5/30
 * @time 11:09 PM
 */
@Service
public class CustomerService {

    /**
     * the method get customer list
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);
    }
}
