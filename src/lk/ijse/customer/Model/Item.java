package lk.ijse.customer.Model;

/**
 * @author : Nipuna Jayawardana <nipunajayawardana0702@gmail.com>
 * @since : 8/7/2021
 **/
public class Item {
    String Id ;
    String Name ;
    String Qty;
    String Price ;
    String Date;


    public Item() {
    }

    public Item(String id, String name, String qty, String price, String date) {
        Id = id;
        Name = name;
        Qty = qty;
        Price = price;
        Date = date;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Qty='" + Qty + '\'' +
                ", Price='" + Price + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
