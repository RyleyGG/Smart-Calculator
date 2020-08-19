package com.ryleygg;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.text.*;


public class gui extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        VBox rootPane = new VBox();
        Pane inputRepresentation = new Pane();
        HBox userInteractables = new HBox();
        Scene scene = new Scene(rootPane,720,480);
        
        //List of instructions user can enter
        //Choice will determine how user enters their information
        String[] instructionList =  new String[4];
        instructionList[0] = "Solve";
        instructionList[1] = "Factor";
        instructionList[2] = "Integrate";
        instructionList[3] = "Differentiate";

        ComboBox instructionOptions = new ComboBox(FXCollections.observableArrayList(instructionList));
        instructionOptions.setOnMouseReleased(e ->
        {
            System.out.println("Yo");
        });
        TextField userInputField = new TextField();
        Button enterInputButton = new Button("GO");

        userInteractables.getChildren().addAll(instructionOptions, userInputField, enterInputButton);
        rootPane.getChildren().addAll(inputRepresentation, userInteractables);

        primaryStage.setScene(scene);
        primaryStage.setTitle("RyleyGG's Smart Calculator");
        primaryStage.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }
}