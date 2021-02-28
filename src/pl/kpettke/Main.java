package pl.kpettke;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import pl.kpettke.controllers.GameBoard;

public class Main extends Application {

    public static Button[][] btns = new Button[3][3];

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resources/gameBoard.fxml"));
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);




    }
}
