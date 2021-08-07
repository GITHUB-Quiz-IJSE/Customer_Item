package lk.ijse.customer.Model;

import java.util.Date;

/**
 * @author : Nipuna Jayawardana <nipunajayawardana0702@gmail.com>
 * @since : 8/7/2021
 **/
public class Customer {
    int CID;
    String name;
    String address;
    String Tel;
    int tel;

    public Customer() {
    }

    public Customer(int CID, String name, String address, String tel, int tel1) {
        this.CID = CID;
        this.name = name;
        this.address = address;
        Tel = tel;
        this.tel = tel1;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CID=" + CID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Tel='" + Tel + '\'' +
                ", tel=" + tel +
                '}';
    }
}
