package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.lang.Math;

public class Main extends Application {
    TextField tfNum1;
    TextField tfNum2;
    Button btnAddition;
    Button btnSubtraction;
    Button btnMultiply;
    Button btnDivide;
    Button btnPower;
    Button btnSumSquareRoot;
    Button btnSumAbsValue;
    Button btnSumFloorValue;
    Button btnSumCeilValue;
    Button btnFactorial;
    Button btnClear;
    Label lb1Answer;

    @Override
    public void start(Stage primaryStage) {
        try {
            //Initializations
            tfNum1 = new TextField();
            tfNum2 = new TextField();
            btnAddition = new Button("+");
            btnSubtraction = new Button("-");
            btnMultiply = new Button("*");
            btnDivide = new Button("/");
            btnPower = new Button("^");
            btnSumSquareRoot = new Button("#");
            btnSumAbsValue = new Button("|");
            btnSumFloorValue = new Button("_");
            btnSumCeilValue = new Button("-");
            btnFactorial = new Button("!");
            btnClear = new Button("Clear");
            lb1Answer = new Label("?");

            //Layout using a GridPane
            GridPane root = new GridPane();
            root.setAlignment(Pos.CENTER);
            root.setHgap(10);
            root.setVgap(10);

            root.add(btnDivide, 0, 0);
            root.add(btnMultiply, 1, 0);
            root.add(btnAddition, 0, 1);
            root.add(btnSubtraction, 1, 1);
            root.add(btnPower, 2,0);
            root.add(btnSumSquareRoot,3,0);
            root.add(btnSumAbsValue,2,1);
            root.add(btnSumCeilValue,3,1);
            root.add(btnSumFloorValue,3,2);
            root.add(btnFactorial,3,3);
            root.add(btnClear, 0, 4, 2, 1);

            root.add(tfNum1, 0, 2);
            root.add(tfNum2, 1, 2);
            root.add(lb1Answer, 0, 3, 2, 1);
            setWidths();
            attachCode();

            Scene scene = new Scene(root, 300, 250);
            primaryStage.setTitle("Calculator FX 1.0");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setWidths() {
        tfNum1.setPrefWidth(70);
        tfNum2.setPrefWidth(70);
        btnDivide.setPrefWidth(70);
        btnSumAbsValue.setPrefWidth((70));
        btnSumSquareRoot.setPrefWidth(70);
        btnMultiply.setPrefWidth(70);
        btnAddition.setPrefWidth(70);
        btnSubtraction.setPrefWidth(70);
        btnPower.setPrefWidth(70);
        btnSumCeilValue.setPrefWidth(30);
        btnSumFloorValue.setPrefWidth(30);
        btnFactorial.setPrefWidth(50);
        btnClear.setPrefWidth(150);
        lb1Answer.setPrefWidth(150);
        lb1Answer.setAlignment(Pos.CENTER);
    }


    //associate a function with a button
    public void attachCode() {
        btnAddition.setOnAction(e -> btncode(e));
        btnSubtraction.setOnAction(e -> btncode(e));
        btnMultiply.setOnAction(e -> btncode(e));
        btnSumSquareRoot.setOnAction(e -> btncode(e));
        btnDivide.setOnAction(e -> btncode(e));
        btnPower.setOnAction(e -> btncode(e) );
        btnSumCeilValue.setOnAction(e -> btncode(e));
        btnSumFloorValue.setOnAction(e -> btncode(e));
        btnSumAbsValue.setOnAction(e -> btncode(e));
        btnFactorial.setOnAction(e -> btncode(e));
        btnClear.setOnAction(e -> btncode(e));
    }


    public void btncode(ActionEvent e) {
        double num1, num2, answer = 0;
        char symbol = ' ';
        //read the numbers from the text box
        num1 = Double.parseDouble(tfNum1.getText());
        num2 = Double.parseDouble(tfNum2.getText());
        if(e.getSource() == btnAddition) {
            symbol = '+';
            answer = num1 + num2;
        }
        else if(e.getSource() == btnSubtraction) {
            symbol = '-';
            answer = num1 - num2;
        }
        else if(e.getSource() == btnMultiply) {
            symbol = '*';
            answer = num1*num2;
        }
        else if(e.getSource() == btnDivide) {
            symbol = '/';
            answer = num1/num2;

        }
        else if(e.getSource() == btnPower) {
            symbol = '^';
            answer = (int)Math.pow(num1,num2);
        }
        else if(e.getSource() == btnSumSquareRoot) {
            symbol = '#';
            answer = (num1+num2)*(num1+num2);
        }
        else if(e.getSource() == btnSumAbsValue) {
            symbol = '|';
            if (num1 < 0 || num2 < 0) {
                double temp = num1 + num2;
                if(temp<=0) {
                    answer = temp * -1;
                }
                else answer = num1 + num2;
            }
            else if (num2 < 0 & num1 < 0) {
                double temp = num1 + num2;
                if (temp <= 0) {
                    answer = temp*-1;
                }
                else answer = num1+num2;
            }
            else answer = num1 + num2;
        }
        else if(e.getSource() == btnSumFloorValue) {
            symbol = '_';
            answer = Math.floor(num1+num2);
        }
        else if(e.getSource() == btnSumCeilValue) {
            symbol = '-';
            answer = Math.ceil(num1+num2);
        }
        else if(e.getSource() == btnFactorial) {
            if(num1 ==0) {
                answer = 1.0;
            }
            else {
                for(int i=2; i <=num1; i++) {
                    answer *= i;
                }
            }
        }
        else {
            tfNum1.setText("");
            tfNum2.setText("");
            lb1Answer.setText("?");
            tfNum1.requestFocus();
            return;
        }
        lb1Answer.setText(""+num1 + symbol + num2 + " = " + answer);

    }


    public static void main(String[] args) {

        launch(args);
    }
}

