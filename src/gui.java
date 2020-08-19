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
        BorderPane rootPane = new BorderPane();
        Scene scene = new Scene(rootPane,720,480);
    }

    public static void main(String args[])
    {
        launch(args);
    }
}