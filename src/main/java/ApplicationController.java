/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ApplicationController {
    private int modeList, modeTask; //0 = normal, 1 = edit, 2 = delete

    // Where ill define my GUI controls defined in FXML and used by the controller's code
    //@FXML
    //private type name;

    //Populate data into tree chart
    //If edit mode on - open pop up and prompt for new String
    //If delete mode on - open pop up and ask for confirmation
    @FXML
    private void listSelected(ActionEvent event) {

    }

    //Mark completed/uncompleted (& update progress bar)
    //If edit mode on - open pop up and prompt for new String
    //If delete mode on - open pop up and ask for confirmation
    @FXML
    private void taskSelected(ActionEvent event) {

    }

    //opens window for finding a file and adds that list data to lists
    //updates status bar to an error message if one is found
    @FXML
    private void openLists(ActionEvent event) {}

    //opens download pop up and then downloads file
    @FXML
    private void downloadLists(ActionEvent event) {}


    //opens pop up for string, creates a new list
    //prints error message if list name less than 3 chars
    @FXML
    private void newList(ActionEvent event) {}

    //opens pop up for task information, adds task to current list
    @FXML
    private void newTask(ActionEvent event) {}

    //repopulates the chart with all data
    @FXML
    private void showAll(ActionEvent event) {}

    //repopulates the chart with completed data/tasks with status "true"
    @FXML
    private void showCompleted(ActionEvent event) {}

    //repopulates the chart with uncompleted data/tasks with status "false"
    @FXML
    private void showUncompleted(ActionEvent event) {}

    //updates status bar label
    @FXML
    private void deleteListMode(ActionEvent event) {}

    //updates status bar label
    @FXML
    private void deleteTaskMode(ActionEvent event) {}

    //updates status bar label
    @FXML
    private void editTaskMode(ActionEvent event) {}

    //updates status bar label
    @FXML
    private void editListMode(ActionEvent event) {}

}
