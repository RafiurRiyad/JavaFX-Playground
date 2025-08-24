package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void up(ActionEvent e) {
        System.out.println("up");
        myCircle.setCenterY(y-=10);
    }

    public void down(ActionEvent e) {
        System.out.println("down");
        myCircle.setCenterY(y+=10);
    }

    public void right(ActionEvent e) {
        System.out.println("right");
        myCircle.setCenterX(x+=10);
    }

    public void left(ActionEvent e) {
        System.out.println("left");
        myCircle.setCenterX(x-=10);
    }
}