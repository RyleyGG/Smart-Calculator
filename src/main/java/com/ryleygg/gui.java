package com.ryleygg;

import java.util.Optional;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


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

        Button instructionOptionSelector = new Button(instructionList[0]);
        instructionOptionSelector.setOnMouseReleased(e ->
        {
            Alert instructionAlert = new Alert(AlertType.CONFIRMATION);
            instructionAlert.setTitle("Select Request");
            instructionAlert.setHeaderText("Select your request below");
            ButtonType solveChoice = new ButtonType("Solve");
            ButtonType factorChoice = new ButtonType("Factor");
            ButtonType integrateChoice = new ButtonType("Integrate");
            ButtonType differentiateChoice = new ButtonType("Differentiate");
            instructionAlert.getButtonTypes().setAll(solveChoice,factorChoice,integrateChoice,differentiateChoice);

            Optional<ButtonType> result = instructionAlert.showAndWait();
            if (result.get() == solveChoice)
            {
                System.out.println("Solve");
                instructionOptionSelector.setText("Solve");
            }
            if (result.get() == factorChoice)
            {
                System.out.println("Factor");
                instructionOptionSelector.setText("Factor");
            }
            if (result.get() == integrateChoice)
            {
                System.out.println("Integrate");
                instructionOptionSelector.setText("Integrate");
            }
            if (result.get() == differentiateChoice)
            {
                System.out.println("Differentiate");
                instructionOptionSelector.setText("Differentiate");
            }
        });
        TextField userInputField = new TextField();
        Button enterInputButton = new Button("GO");


        rootPane.setAlignment(Pos.CENTER);
        userInteractables.setAlignment(Pos.CENTER);
        userInteractables.spacingProperty().bind(scene.widthProperty().multiply(0.01));
        userInteractables.getChildren().addAll(instructionOptionSelector, userInputField, enterInputButton);
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