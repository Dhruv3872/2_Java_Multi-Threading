package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        /*GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        Label instruction = new Label("Hi..\nClick on the \"Download All\" button to see the demonstration.\n" +
                " Don't worry. It will not download anything on your computer.");
        instruction.setFont(Font.font("Calibri Light", FontWeight.BOLD, 25  ));
        root.getChildren().add(instruction);*/
        primaryStage.setTitle("Java_Multi-threading_demonstration_UI");
        primaryStage.setScene(new Scene(root, 700, 255));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
