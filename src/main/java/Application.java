/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;


public class Application extends javafx.application.Application {
    ArrayList<List> lists; //stores the user's lists

    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Application.fxml")));

        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Notes"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage
    }

    //Will an array list of Lists as well
    public static void main(String[] args) {
        launch(args);
    }

    //adds a list to Lists arraylist
    void addList(){}

    //deletes a list from Lists arraylist
    void deleteList(){}
}
