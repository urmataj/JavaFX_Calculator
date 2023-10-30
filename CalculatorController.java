package com.example.javafx_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField inputField;

    Calculator calc = new Calculator();
    @FXML
    protected void onPlusButtonClick() {
        calc.setOperator('+');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onMinusButtonClick() {
        calc.setOperator('-');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onMultiplicationButtonClick() {
        calc.setOperator('*');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onDivisionButtonClick() {
        calc.setOperator('/');
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp1(d);
        inputField.setText("");
    }
    @FXML
    protected void onEqualButtonClick() {
        String val = inputField.getText();
        double d = Double.parseDouble(val);
        calc.setOp2(d);
        calc.calculate();
        inputField.setText(Double.toString(calc.getResult()));
    }
    @FXML
    protected void onButtonOneClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "1");
    }
    @FXML
    protected void onButtonTwoClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "2");
    }
    @FXML
    protected void onButtonThreeClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "3");
    }
    @FXML
    protected void onButtonFourClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "4");
    }
    @FXML
    protected void onButtonFiveClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "5");
    }
    @FXML
    protected void onButtonSixClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "6");
    }
    @FXML
    protected void onButtonSevenClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "7");
    }
    @FXML
    protected void onButtonEightClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "8");
    }
    @FXML
    protected void onButtonNineClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "9");
    }
    @FXML
    protected void onButtonZeroClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText(val + "0");
    }
    @FXML
    protected void onButtonClearClick() {
        inputField.setText("");
    }

}