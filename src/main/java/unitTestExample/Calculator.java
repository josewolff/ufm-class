package unitTestExample;

public class Calculator {

    public double sum(double number1, double number2){
        return number1 +number2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double div(double num1, double num2) {
        if(num2 == 0 ){
            return -1;
        }else{
            return num1 / num2;
        }
    }
}
