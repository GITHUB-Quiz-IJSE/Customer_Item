package lk.ijse.customer.controller;

import lk.ijse.customer.Model.Customer;
import lk.ijse.customer.Model.Item;
import lk.ijse.customer.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : Nipuna Jayawardana <nipunajayawardana0702@gmail.com>
 * @since : 8/7/2021
 **/
public class ItemController {
        public static boolean addItem(Item item) throws SQLException, ClassNotFoundException {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement("insert into item values(?,?,?,?,?)");
            pst.setString(1,item.getId());
            pst.setString(2,item.getName());
            pst.setString(3,item.getQty());
            pst.setString(3,item.getPrice());
            pst.setString(3,item.getDate());

            return pst.executeUpdate()>0;

        }
}
