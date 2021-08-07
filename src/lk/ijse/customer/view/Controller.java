package lk.ijse.customer.view;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.ijse.customer.Model.Customer;
import lk.ijse.customer.controller.CustomerController;

import java.awt.event.ActionEvent;
import java.io.Console;
import java.sql.SQLException;
import java.time.LocalDate;

public class Controller {

        @FXML
        private TextField txtCustName;

        @FXML
        private TextField txtCustAddress;

        @FXML
        private TextField txtCustAge;

        @FXML
        private TextField txtCustSalary;

        @FXML
        private Button btnAddCustomer;

        @FXML
        private Label lblCustName;

        @FXML
        private Label lblCustAddress;

        @FXML
        private Label lblCustSalary;

        @FXML
        private Label lblCustAge;

        @FXML
        private TextField txtCustTel;

        @FXML
        private Label lblCustTel;


        @FXML
        void btnClicked(ActionEvent event) {


                String name = txtCustName.getText().trim();
                String address = txtCustAddress.getText().trim();
                String age = txtCustAge.getText().trim();
                String salary = txtCustSalary.getText().trim();
                String tel = txtCustTel.getText().trim();

                Customer customer = new Customer(name,address,age,salary,tel);


                try {
                        boolean isAdded= CustomerController.addCustomer(customer);
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
