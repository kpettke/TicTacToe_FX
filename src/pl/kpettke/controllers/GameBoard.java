package pl.kpettke.controllers;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import pl.kpettke.Main;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GameBoard extends Main {


    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn21;
    public Button btn22;
    public Button btn23;
    public Button btn31;
    public Button btn32;
    public Button btn33;



    public GridPane grid;



    public Label result;

    boolean whoTurn = true;
    boolean win = false;

    public void onMouseClick(MouseEvent mouseEvent) {

        Button button = (Button) mouseEvent.getSource();
        System.out.println(button.idProperty().getValue());



        int[][] list = new int[3][3];



            if (whoTurn == true) {
                drowX(button);
                whoTurn = false;
                checkGameX();
                
                System.out.println(button.getText());
            }
            else {
                drow0(button);
                whoTurn = true;
              }

    }

    public void drowX(Button button){

        result.setText("Kolej O");
        button.setText("X");
        button.setDisable(true);
    }

    public void drow0(Button button){

        result.setText("Kolej X");
        button.setText("O");
        button.setDisable(true);

    }

    public void checkGameX(){

        if ( (btn11.getText()  == "X" ) && (btn12.getText()  == "X") && (btn13.getText()  == "X" ) && btn11 != null) {
            result.setText("Wygrałeś X");
            grid.setDisable(true);
        }
        if ( (btn21.getText()  == "X" ) && (btn22.getText()  == "X") && (btn23.getText()  == "X" )){
                result.setText("Wygrałeś X");
                grid.setDisable(true);
        }
        if ( (btn31.getText()  == "X" ) && (btn32.getText()  == "X") && (btn33.getText()  == "X" )){
            result.setText("Wygrałeś X");
            grid.setDisable(true);
        }

    }

}


