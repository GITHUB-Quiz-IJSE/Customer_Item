package lk.ijse.customer.view;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

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

        }


}
