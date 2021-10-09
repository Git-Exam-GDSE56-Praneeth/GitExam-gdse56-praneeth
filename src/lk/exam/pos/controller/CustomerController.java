package lk.exam.POS.controller;

import lk.exam.POS.model.Customer;
import lk.exam.POS.utils.CrudUtil;

import java.sql.SQLException;

/**
 * @auther Praneeth Geethanjana <geethanjana10@gmail.com>
 * @Since 10/9/2021
 */
public class CustomerController {

    public boolean saveCustomer(Customer c) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO Customer VALUES (?,?,?,?)",c.getId(),c.getName(),c.getAddress(),c.getSalary());

    }
}
