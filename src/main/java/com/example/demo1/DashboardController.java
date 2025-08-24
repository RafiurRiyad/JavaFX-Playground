package com.example.demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class DashboardController {

    @FXML private TextField nameField;
    @FXML private TextField priceField;
    @FXML private ComboBox<String> categoryBox;
    @FXML private ComboBox<String> filterBox;
    @FXML private Label formMessage;

    @FXML private TableView<Product> productTable;
    @FXML private TableColumn<Product, String> nameColumn;
    @FXML private TableColumn<Product, Double> priceColumn;
    @FXML private TableColumn<Product, String> categoryColumn;

    private final ObservableList<Product> masterData = FXCollections.observableArrayList();
    private final ObservableList<String> categories = FXCollections.observableArrayList("Electronics", "Books", "Clothes");

    @FXML
    public void initialize() {
        // Setup table bindings
        nameColumn.setCellValueFactory(cell -> cell.getValue().nameProperty());
        priceColumn.setCellValueFactory(cell -> cell.getValue().priceProperty().asObject());
        categoryColumn.setCellValueFactory(cell -> cell.getValue().categoryProperty());

        productTable.setItems(masterData);

        // Setup category dropdowns
        categoryBox.setItems(categories);
        filterBox.setItems(FXCollections.observableArrayList("All"));
        filterBox.getItems().addAll(categories);
        filterBox.getSelectionModel().select("All");

        // Listen for filter changes
        filterBox.valueProperty().addListener((obs, oldVal, newVal) -> applyFilter());
    }

    @FXML
    public void addProduct() {
        String name = nameField.getText().trim();
        String priceText = priceField.getText().trim();
        String category = categoryBox.getValue();

        if (name.isEmpty() || priceText.isEmpty() || category == null) {
            formMessage.setText("Please fill all fields!");
            formMessage.setTextFill(javafx.scene.paint.Color.RED);
            return;
        }

        try {
            double price = Double.parseDouble(priceText);
            Product product = new Product(name, price, category);
            masterData.add(product);

            // Reset form
            nameField.clear();
            priceField.clear();
            categoryBox.getSelectionModel().clearSelection();
            formMessage.setText("Product added successfully!");
            formMessage.setTextFill(javafx.scene.paint.Color.GREEN);

            applyFilter();
        } catch (NumberFormatException e) {
            formMessage.setText("Price must be a number!");
            formMessage.setTextFill(javafx.scene.paint.Color.RED);
        }
    }

    private void applyFilter() {
        String selected = filterBox.getValue();
        if (selected == null || selected.equals("All")) {
            productTable.setItems(masterData);
        } else {
            ObservableList<Product> filtered = FXCollections.observableArrayList();
            for (Product p : masterData) {
                if (p.getCategory().equals(selected)) {
                    filtered.add(p);
                }
            }
            productTable.setItems(filtered);
        }
    }
}
