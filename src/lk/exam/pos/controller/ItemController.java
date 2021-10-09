package lk.exam.POS.controller;

import lk.exam.POS.model.Item;
import lk.exam.POS.utils.CrudUtil;

import java.sql.SQLException;

/**
 * @auther Praneeth Geethanjana <geethanjana10@gmail.com>
 * @Since 10/9/2021
 */
public class ItemController {
    public boolean saveItem(Item item) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO Item VALUES (?,?,?,?)",item.getItemcode(),item.getDescription(),item.getUnitprice(),item.getQtyonhand());

    }
}
