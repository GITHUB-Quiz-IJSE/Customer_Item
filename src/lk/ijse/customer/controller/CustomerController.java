package lk.ijse.customer.controller;

import lk.ijse.customer.Model.Customer;
import lk.ijse.customer.db.DBConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : Nipuna Jayawardana <nipunajayawardana0702@gmail.com>
 * @since : 8/7/2021
 **/
public class CustomerController {
    public static boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement pst = con.prepareStatement("insert into customer values(?,?,?,?,?)");
        pst.setString(1,customer.getName());
        pst.setString(2,customer.getAddress());
        pst.setString(3,customer.getAge());
        pst.setString(3,customer.getSalary());
        pst.setString(3,customer.getTel());

        return pst.executeUpdate()>0;

    }
}
