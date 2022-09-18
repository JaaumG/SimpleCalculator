package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Objects;

/**
 * This application it's a simple calculator based on Windows 10 Calculator,
 * it can calculate simple problems such as squareroot, square, percentage, sum, subtraction, division, multiplication, and inverse (1/X)
 * compare to microsoft calculator this one has some flaws, per example, when you calculate the squareroot of a number several times and
 * then later square it exact the same times you squareroot it you won't get the same value you started with, it's because of the properties
 * of variables like double and/or float which its lack precision.
 * <p>
 * Author @João Guilherme 18/09/2022
 */
public class CalculatorController {
    @FXML
    private Label Window;
    private double value, value2; //because of its simplicity, for all the operations its only needs two variables
    private String[] operation; //String array to handle if the operations, splitting most of the all
    public void ButtonPressed(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        switch(button.getText()){
            case "1":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("1");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", "")); //Regex to get the last string char
                }
                Window.setText(Window.getText() + 1);
                break;
            case "2":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("2");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 2);
                break;
            case "3":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("3");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 3);
                break;
            case "4":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("4");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 4);
                break;
            case "5":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("5");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 5);
                break;
            case "6":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("6");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 6);
                break;
            case "7":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("7");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 7);
                break;
            case "8":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("8");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 8);
                break;
            case "9":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("9");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 9);
                break;
            case "0":
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    break;
                }else{
                    Window.setText(Window.getText() + 0);
                }
                break;
            case "⌦":
                if(Window.getText().length()==1||Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")) {
                    Window.setText("0");
                    return;
                }if(Window.getText().length()>1) {
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                break;
            case "CE":
            case "C":
                Window.setText("0");
                break;
            case "X²":
                value = Double.parseDouble(Window.getText());
                if(Math.sqrt(StrictMath.round(StrictMath .pow(value, 2))) == value){
                    Window.setText(String.valueOf(Math.round(Math.pow(value, 2))));
                    break;
                }
                if (String.valueOf(Math.pow(value, 2)).endsWith(".0")) {
                    Window.setText(String.valueOf(Math.round(Math.pow(value, 2))));
                    break;
                }
                Window.setText(String.valueOf(Math.pow(value, 2)));
                break;
            case "1/X":
                value = Double.parseDouble(Window.getText());
                if (String.valueOf(1/ value).endsWith(".0")) {
                    Window.setText(String.valueOf(Math.round(1/ value)));
                    break;
                }
                Window.setText(String.valueOf(1/ value));
                break;
            case "√":
                value = Double.parseDouble(Window.getText());
                if (String.valueOf(Math.sqrt(value)).endsWith(".0")) {
                    Window.setText(String.valueOf(Math.round(Math.sqrt(value))));
                    break;
                }
                Window.setText(String.valueOf(Math.sqrt(value)));
                break;
            case "×":
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "×");
                }
                break;
            case "÷":
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "÷");
                }
                break;
            case "-":
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "-");
                }
                break;
            case "+":
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "+");
                }
                break;
            case "%":
                if(Window.getText().endsWith("×")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                    value=Double.parseDouble(Window.getText());
                    if(String.valueOf(value/100).endsWith(".0")){
                        Window.setText(Window.getText() + "×" + Math.round(value/100));
                        break;
                    }
                    Window.setText(Window.getText() + "×" + value/100);
                    break;
                }if(Window.getText().endsWith("-")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                    value=Double.parseDouble(Window.getText());
                    if(String.valueOf(value/100).endsWith(".0")){
                        Window.setText(Window.getText() + "-" + Math.round(value/100));
                        break;
                    }
                    Window.setText(Window.getText() + "-" + value/100);
                    break;
                }if(Window.getText().endsWith("+")) {
                    Window.setText(Window.getText().replaceAll(".$", ""));
                    value=Double.parseDouble(Window.getText());
                    if(String.valueOf(value/100).endsWith(".0")){
                        Window.setText(Window.getText() + "+" + Math.round(value/100));
                        break;
                    }
                    Window.setText(Window.getText() + "+" + value/100);
                    break;
                }if(Window.getText().endsWith("÷")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                    value=Double.parseDouble(Window.getText());
                    if(String.valueOf(value/100).endsWith(".0")){
                        Window.setText(Window.getText() + "÷" + Math.round(value/100));
                        break;
                    }
                    Window.setText(Window.getText() + "÷" + value/100);
                    break;
                }else{
                    String[] operation;
                    if(Window.getText().contains("+")){
                        operation = Window.getText().split("\\+");
                        if(Window.getText().contains("(")){
                            value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                        }else {
                            value2 = Double.parseDouble(operation[1]);
                        }
                        if (String.valueOf(value2 / 100).endsWith(".0")) {
                            Window.setText(String.valueOf(Math.round(value2 / 100)));
                            break;
                        }
                        Window.setText(operation[0]+"+"+value2 / 100);
                        break;
                    }if(Window.getText().contains("÷")){
                        operation = Window.getText().split("÷");
                        if(Window.getText().contains("(")){
                            value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                            if (String.valueOf(value2 / 100).endsWith(".0")) {
                                Window.setText(String.valueOf(Math.round(value2 / 100)));
                                break;
                            }
                            Window.setText(operation[0]+"÷("+value2 / 100);
                            break;
                        }else {
                            value2 = Double.parseDouble(operation[1]);
                            if (String.valueOf(value2 / 100).endsWith(".0")) {
                                Window.setText(String.valueOf(Math.round(value2 / 100)));
                                break;
                            }
                            Window.setText(operation[0]+"÷"+value2 / 100);
                            break;
                        }
                    }if(Window.getText().contains("×")){
                        operation = Window.getText().split("×");
                        if(Window.getText().contains("(")){
                            value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                            if (String.valueOf(value2 / 100).endsWith(".0")) {
                                Window.setText(String.valueOf(Math.round(value2 / 100)));
                                break;
                            }
                            Window.setText(operation[0]+"×("+value2 / 100);
                            break;
                        }else {
                            value2 = Double.parseDouble(operation[1]);
                            if (String.valueOf(value2 / 100).endsWith(".0")) {
                                Window.setText(String.valueOf(Math.round(value2 / 100)));
                                break;
                            }
                            Window.setText(operation[0]+"×"+value2 / 100);
                            break;
                        }
                    }if(Window.getText().contains("-")) {
                        if(!Window.getText().startsWith("-")) {
                            operation = Window.getText().split("-");
                            value = Double.parseDouble(operation[0]);
                            if(Window.getText().contains("(-")) {
                                value2 = Double.parseDouble(operation[2]);
                                Window.setText(value +"-("+ value2/100);
                                return;
                            }else{
                                value2 = Double.parseDouble(operation[1]);
                                Window.setText(value +"-"+ value2/100);
                                return;
                            }
                        }else{
                            operation = Window.getText().split("-");
                            value = Double.parseDouble(operation[1]);
                            value *= -1;
                            if(Window.getText().contains("(")) {
                                value2 = Double.parseDouble(operation[3]);
                                value2*=-1;
                            }else{
                                value2 = Double.parseDouble(operation[2]);
                            }
                            Window.setText(value +"-("+ value2/100);
                        }
                    }
                }
                break;
            case ",":
                if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")) {
                    Window.setText("0,");
                }else{
                    String[] operation;
                    if(Window.getText().contains("×")) {
                        operation = Window.getText().split("×");
                        value = Double.parseDouble(operation[0]);
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            if(Window.getText().endsWith("0")){
                                Window.setText(Window.getText() + ".");
                                break;
                            }
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                    if(Window.getText().contains("÷")) {
                        operation = Window.getText().split("÷");
                        value = Double.parseDouble(operation[0]);
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            if(Window.getText().endsWith("0")){
                                Window.setText(Window.getText() + ".");
                                break;
                            }
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                    if(Window.getText().contains("+")) {
                        operation = Window.getText().split("\\+");
                        value = Double.parseDouble(operation[0]);
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            if(Window.getText().endsWith("0")){
                                Window.setText(Window.getText() + ".");
                                break;
                            }
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                    if(Window.getText().contains("-")) {
                        operation = Window.getText().split("-");
                        if(!Window.getText().startsWith("-")){
                            value = Double.parseDouble(operation[0]);
                            if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                                if(Window.getText().endsWith("0")){
                                    Window.setText(Window.getText() + ".");
                                    break;
                                }
                                Window.setText(Window.getText() + "0.");
                                break;
                            }
                        }else if (Window.getText().startsWith("-")&&Window.getText().endsWith("-")){
                            if(Window.getText().endsWith("0")){
                                Window.setText(Window.getText() + ".");
                                break;
                            }
                            Window.setText(Window.getText() + "0.");
                        }if(!Window.getText().endsWith(".")) {
                            Window.setText(Window.getText() + ".");
                        }
                    }else {
                        value = Double.parseDouble(Window.getText());
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                }
                break;
            //Dealing with the case of subtraction was the worst part of the all, the problem it is not the operation but
            // its signal which is used to represent negative numbers, so I had to do check if it's a simple subtraction
            // between natural numbers, or a subtraction of Integers if it is a subtraction of a negative number its ends
            // like a sum of it.
            // So to deal with it, just like microsoft's calculator I use the function of the negate button
            // (+/-) to make easier this problem, when clicked it checks if the string in the label Window has "(", if its does
            // then its gets removed, otherwise its check if the string contains the operator character, if it does, them it
            // 'negate' the left part of the operation, otherwise negate the first part.
            case "+/-":
                if(Window.getText().contains("(-")){
                    Window.setText(Window.getText().replaceAll("\\(-",""));
                    break;
                }if(Window.getText().endsWith("-")||Window.getText().endsWith("+")||Window.getText().endsWith("÷")||Window.getText().endsWith("×")){
                    Window.setText(Window.getText()+"(-");
                    break;
                }if (Window.getText().contains("+")){
                    operation = Window.getText().split("\\+");
                    Window.setText(operation[0]+ "+(-" + operation[1]);
                    break;

                }if (Window.getText().contains("÷")){
                    operation = Window.getText().split("÷");
                    Window.setText(operation[0]+ "÷(-" + operation[1]);
                    break;
                }if (Window.getText().contains("×")) {
                    operation = Window.getText().split("×");
                    Window.setText(operation[0]+ "×(-" + operation[1]);
                    break;
                }if (Window.getText().contains("-")) {
                    if (!Window.getText().startsWith("-") && !Window.getText().endsWith("-")) {
                        operation = Window.getText().split("-");
                        Window.setText(operation[0]+"-(-"+operation[1]);
                        break;
                    }else{
                        operation = Window.getText().split("-");
                        Window.setText(operation[1]+"-(-"+operation[2]);
                        break;
                    }
                }
                if(!Window.getText().startsWith("-")){
                    Window.setText("-" + Window.getText());
                    break;
                }
                Window.setText(String.valueOf(new StringBuilder(Window.getText()).deleteCharAt(0)));
                break;

            case "=":
                if(Window.getText().contains("×")) {
                    operation = Window.getText().split("×");
                    value = Double.parseDouble(operation[0]);
                    if(Window.getText().contains("(-")) {
                        value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                    }else{
                        value2 = Double.parseDouble(operation[1]);
                    }
                    if(String.valueOf(value *value2).endsWith(".0")){
                        Window.setText(String.valueOf(Math.round(value *value2)));
                        break;
                    }
                    Window.setText(String.valueOf(value *value2));
                }if(Window.getText().contains("÷")) {
                    operation = Window.getText().split("÷");
                    value = Double.parseDouble(operation[0]);
                    if(Window.getText().contains("(-")) {
                        value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                    }else{
                        value2 = Double.parseDouble(operation[1]);
                    }
                    if(String.valueOf(value /value2).endsWith(".0")){
                        Window.setText(String.valueOf(Math.round(value /value2)));
                        break;
                    }
                    Window.setText(String.valueOf(value /value2));
                }if(Window.getText().contains("+")) {
                    operation = Window.getText().split("\\+");
                    value = Double.parseDouble(operation[0]);
                    if(Window.getText().contains("(-")) {
                        value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                    }else{
                        value2 = Double.parseDouble(operation[1]);
                    }
                    if(String.valueOf(value +value2).endsWith(".0")){
                        Window.setText(String.valueOf(Math.round(value +value2)));
                        break;
                    }
                    Window.setText(String.valueOf(value +value2));
                }if(Window.getText().contains("-")) {
                    if(!Window.getText().startsWith("-")) {
                        operation = Window.getText().split("-");
                        value = Double.parseDouble(operation[0]);
                        if(Window.getText().contains("(-")) {
                            value2 = Double.parseDouble(operation[2]);
                        }else{
                            value2 = Double.parseDouble(operation[1]);
                        }
                        if (String.valueOf(value - value2).endsWith(".0")) {
                            Window.setText(String.valueOf(Math.round(value - value2)));
                            break;
                        }
                    }else{
                        operation = Window.getText().split("-");
                        value = Double.parseDouble(operation[1]);
                        value *= -1;
                        if(Window.getText().contains("(")) {
                            value2 = Double.parseDouble(operation[3]);
                            value2*=-1;
                        }else{
                            value2 = Double.parseDouble(operation[2]);
                        }
                        if (String.valueOf(value - value2).endsWith(".0")) {

                            Window.setText(String.valueOf(Math.round(value - value2)));
                        }else{
                            Window.setText(String.valueOf(value - value2));
                        }
                    }
                }
                break;
        }
    }
    public void ButtonKey(KeyEvent keyEvent){
        if(keyEvent.getCode().equals(KeyCode.ENTER)) {
            if(Window.getText().contains("×")) {
                operation = Window.getText().split("×");
                value = Double.parseDouble(operation[0]);
                if(Window.getText().contains("(-")) {
                    value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                }else{
                    value2 = Double.parseDouble(operation[1]);
                }
                if(String.valueOf(value *value2).endsWith(".0")){
                    Window.setText(String.valueOf(Math.round(value *value2)));
                    return;
                }
                Window.setText(String.valueOf(value *value2));
            }if(Window.getText().contains("÷")) {
                operation = Window.getText().split("÷");
                value = Double.parseDouble(operation[0]);
                if(Window.getText().contains("(-")) {
                    value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                }else{
                    value2 = Double.parseDouble(operation[1]);
                }
                if(String.valueOf(value /value2).endsWith(".0")){
                    Window.setText(String.valueOf(Math.round(value /value2)));
                    return;
                }
                Window.setText(String.valueOf(value /value2));
            }if(Window.getText().contains("+")) {
                operation = Window.getText().split("\\+");
                value = Double.parseDouble(operation[0]);
                if(Window.getText().contains("(-")) {
                    value2 = Double.parseDouble(operation[1].replaceAll("\\(",""));
                }else{
                    value2 = Double.parseDouble(operation[1]);
                }
                if(String.valueOf(value +value2).endsWith(".0")){
                    Window.setText(String.valueOf(Math.round(value +value2)));
                    return;
                }
                Window.setText(String.valueOf(value +value2));
            }
            if(Window.getText().contains("-")) {
                //As you can see, the subtraction and negate operations was the hardest to handle, and here you can see the way
                //I resolve it, by check if the string start with "-" I can conclude that the first half of the operation is a
                //negative number
                if(!Window.getText().startsWith("-")) {
                    //in this case which it doesn't start if "-" I can conclude by split the string by "-" the first item will be
                    //the number
                    operation = Window.getText().split("-");
                    value = Double.parseDouble(operation[0]);
                    //But it can be split in other points if the second part its negative
                    //So I checked if the original string contain  "(", if it does then the split got the number on the third position
                    // Example : 2-(-9 -> {2},{(},{9}
                    if(Window.getText().contains("(")) {
                        value2 = Double.parseDouble(operation[2]);
                        value2*=-1;
                    }else{
                        //Otherwise the number will be on the second position
                        // Example : 2-9 -> {2},{9}
                        value2 = Double.parseDouble(operation[1]);
                    }
                    if (String.valueOf(value - value2).endsWith(".0")) {
                        //Just for somewhat perfectionism I decide to exclude the decimal point in case its equal to 0
                        //it has no reason to be shown for the final user
                        Window.setText(String.valueOf(Math.round(value - value2)));
                        return;
                    }
                    //if the decimal point has some value different of 0 then its shown
                    Window.setText(String.valueOf(value - value2));
                }else{
                    //In this case the string starts with "-" so I know the first number after the split will be on the second position
                    // Example : -2-9 -> {(empty string)},{2},{9}
                    operation = Window.getText().split("-");
                    value = Double.parseDouble(operation[1]);
                    value *= -1;
                    //But if it does have "(" then I know the second number will be on the forth position
                    // Example : -2-(-9 -> {(empty string)},{2},{(},{9}
                    if(Window.getText().contains("(")) {
                        value2 = Double.parseDouble(operation[3]);
                        value2*=-1;
                    }else{
                        value2 = Double.parseDouble(operation[2]);
                    }
                    if (String.valueOf(value - value2).endsWith(".0")) {

                        Window.setText(String.valueOf(Math.round(value - value2)));
                    }else{
                        Window.setText(String.valueOf(value - value2));
                    }
                }
            }
        }
    }
    public void KeyBoardAction(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case NUMPAD1:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("1");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 1);
                break;
            case NUMPAD2:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("2");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 2);
                break;
            case NUMPAD3:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("3");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 3);
                break;
            case NUMPAD4:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("4");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 4);
                break;
            case NUMPAD5:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("5");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 5);
                break;
            case NUMPAD6:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("6");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 6);
                break;
            case NUMPAD7:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("7");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 7);
                break;
            case NUMPAD8:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("8");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 8);
                break;
            case NUMPAD9:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("9");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                Window.setText(Window.getText() + 9);
                break;
            case NUMPAD0:
                if(Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                    break;
                }if(Objects.equals(Window.getText(), "-0")){
                    break;
                }else{
                    Window.setText(Window.getText() + 0);
                }
                break;
            case MULTIPLY:
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "×");
                }
                break;
            case DIVIDE:
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "÷");
                }
                break;
            case SUBTRACT:
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    break;
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "-");
                }
                break;
            case ADD:
                if(!(Window.getText().startsWith("-"))&&(Window.getText().contains("×")||Window.getText().contains("÷")||Window.getText().contains("+")||Window.getText().contains("-"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if((Window.getText().endsWith("-")) || (Window.getText().endsWith("+")) ||(Window.getText().endsWith("×")) ||(Window.getText().endsWith("÷"))){
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")||Objects.equals(Window.getText(), "-Infinity")||Objects.equals(Window.getText(), "-NaN")) {
                    Window.setText("0");
                }else{
                    value = Double.parseDouble(Window.getText());
                    Window.setText(Window.getText() + "+");
                }
                break;
            case DECIMAL:
                if(Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")) {
                    Window.setText("0,");
                }else{
                    String[] operation;
                    if(Window.getText().contains("×")) {
                        operation = Window.getText().split("×");
                        value = Double.parseDouble(operation[0]);
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            if(Window.getText().endsWith("0")){
                                Window.setText(Window.getText() + ".");
                                break;
                            }
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                    if(Window.getText().contains("÷")) {
                        operation = Window.getText().split("÷");
                        value = Double.parseDouble(operation[0]);
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            if(Window.getText().endsWith("0")){
                                Window.setText(Window.getText() + ".");
                                break;
                            }
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                    if(Window.getText().contains("+")) {
                        operation = Window.getText().split("\\+");
                        value = Double.parseDouble(operation[0]);
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            if(Window.getText().endsWith("0")){
                                Window.setText(Window.getText() + ".");
                                break;
                            }
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                    if(Window.getText().contains("-")) {
                        operation = Window.getText().split("-");
                        if(!Window.getText().startsWith("-")){
                            value = Double.parseDouble(operation[0]);
                            if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                                if(Window.getText().endsWith("0")){
                                    Window.setText(Window.getText() + ".");
                                    break;
                                }
                                Window.setText(Window.getText() + "0.");
                                break;
                            }
                        }else if (Window.getText().startsWith("-")&&Window.getText().endsWith("-")){
                            Window.setText(Window.getText() + "0.");
                        }if(!Window.getText().endsWith(".")) {
                            Window.setText(Window.getText() + ".");
                        }
                    }else {
                        value = Double.parseDouble(Window.getText());
                        if (Window.getText().contains("×") || Window.getText().contains("÷") || Window.getText().contains("+") || Window.getText().contains("-")) {
                            Window.setText(Window.getText() + "0.");
                            break;
                        }
                        Window.setText(Window.getText() + ".");
                    }
                }
                break;
            case BACK_SPACE:
                if(Window.getText().length()==1||Objects.equals(Window.getText(), "0")||Objects.equals(Window.getText(), "Infinity")||Objects.equals(Window.getText(), "NaN")) {
                    Window.setText("0");
                    return;
                }if(Window.getText().length()>1) {
                    Window.setText(Window.getText().replaceAll(".$", ""));
                }
                break;
        }
    }
}