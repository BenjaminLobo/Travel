package com.example.travel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;


public class transportationController {
    ObservableList<String> carList = FXCollections.observableArrayList("Ola","Uber","Lyft");

    @FXML
    private ChoiceBox car;

    @FXML
    private void initialize(){
        car.setValue("Ola");
        car.setItems(carList);
    }

}

