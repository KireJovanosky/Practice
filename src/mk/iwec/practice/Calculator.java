package mk.iwec.practice;

import java.util.Scanner;

public class Calculator {

    private int x;
    private int y;
    private String operator;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value for x: ");
        x = scanner.nextInt();
        System.out.println("Please enter value for y: ");
        y = scanner.nextInt();
        System.out.println("Please choose one of the commands: +, -, *, /");
        operator = scanner.next();

        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.println("Please enter one of the predefined operators");
            calculate();
        }else {
            switch (operator){
                case "+":
                    System.out.println("x + y = " + (x + y));
                    break;
                case "-":
                    System.out.println("x - y = " + (x - y));
                    break;
                case "*":
                    System.out.println("x * y = " + (x * y));
                    break;
                case "/":
                    System.out.println("x / y = " + (float) x / y);
                    break;
            }
        }
    }
}

