package lk.ijse.customer.Model;

import java.util.Date;

/**
 * @author : Nipuna Jayawardana <nipunajayawardana0702@gmail.com>
 * @since : 8/7/2021
 **/
public class Customer {
    String name ;
    String address ;
    String age ;
    String salary ;
    String tel;

    public Customer(String name) {

    }

    public Customer(String name, String address, String age, String salary, String tel) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.tel = tel;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
