package lk.ijse.customer.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.ijse.customer.Model.Customer;
import lk.ijse.customer.Model.Item;
import lk.ijse.customer.controller.CustomerController;

import java.sql.SQLException;

/**
 * @author : Nipuna Jayawardana <nipunajayawardana0702@gmail.com>
 * @since : 8/7/2021
 **/
public class ItemController {


    @FXML
    private TextField txtItemId;

    @FXML
    private TextField txtItemName;

    @FXML
    private TextField txtItemQty;

    @FXML
    private TextField txtItemUnitP;


    @FXML
    private TextField txtItemDate;

    @FXML
    void btnAddItem(java.awt.event.ActionEvent event) {}

    public void btnClicked(ActionEvent actionEvent) {

        String Id = txtItemId.getText().trim();
        String Name = txtItemName.getText().trim();
        String Qty= txtItemQty.getText().trim();
        String Price = txtItemUnitP.getText().trim();
        String Date = txtItemDate.getText().trim();

       Item item = new Item(Id,Name,Qty,Price,Date);


        try {
            boolean isAdded= lk.ijse.customer.controller.ItemController.addItem(item);
            if (isAdded){
                System.out.println("ok");
            }else {
                System.out.println("wrong");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
