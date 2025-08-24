package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Label message;

    @FXML
    protected void handleLogin() {
        if ("admin".equals(username.getText()) && "1234".equals(password.getText())) {
            message.setText("Login successful!");
        } else {
            message.setText("Invalid credentials!");
        }
    }
}
