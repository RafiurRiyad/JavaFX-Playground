package com.example.demo1;

import com.example.demo1.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TableController {
    @FXML private TableView<Person> table;
    @FXML private TableColumn<Person, String> nameColumn;
    @FXML private TableColumn<Person, Integer> ageColumn;
    @FXML private TextField nameField;
    @FXML private TextField ageField;

    private final ObservableList<Person> data = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(cell -> cell.getValue().nameProperty());
        ageColumn.setCellValueFactory(cell -> cell.getValue().ageProperty().asObject());
        table.setItems(data);
    }

    @FXML
    public void addPerson() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        data.add(new Person(name, age));
        nameField.clear();
        ageField.clear();
    }
}
