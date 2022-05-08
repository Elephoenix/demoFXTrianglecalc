package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Label welcomeText;
    @FXML
    private Label bad;
    @FXML
    TextField firstStorona;
    @FXML
    TextField secondStorona;
    @FXML
    TextField thirdStorona;
    @FXML
    protected void onHelloButtonClick() {
        Triangle first=new Triangle(Double.parseDouble(firstStorona.getText()) ,Double.parseDouble(secondStorona.getText()),Double.parseDouble(thirdStorona.getText()));
        if (first.examinationTriangle()) {
            bad.setText("Треугольник создан!");
        }
        else
            bad.setText("Введите корректное значение");
    }
}