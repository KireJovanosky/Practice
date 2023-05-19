package mk.iwec.practice;

public class RunnerOOP {

    public static void main(String[] args) {

    //Exercise 1
        System.out.println("Exercise 1 - симулација на клима уред");
        AirConditionerOOP airCon = new AirConditionerOOP();
        airCon.setTemp(25);
        airCon.setHumidity(60);
        airCon.run();
        System.out.println("=====================================");


    //Exercise 2
        System.out.println("Exercise 2 - трансформирање на пари");
        MoneyConverter converter = new MoneyConverter();
        System.out.println("3500 EUR = " + converter.inMkd(3500) + " MKD");
        System.out.println("9850 MKD = " + converter.inEur(9850) + " EUR");
        System.out.println("=====================================");


    //Exercise 3
        System.out.println("Exercise 3 - замена на вредност на полиња");
        SwapFields fields = new SwapFields(12, 23);
        fields.swap();
        System.out.println("=====================================");

    //Exercise 4
        System.out.println("Exercise 4 - аритметичка средина");
        ArithmeticMiddle arMiddle = new ArithmeticMiddle();
        System.out.println("x = " + arMiddle.getX() + ", y = " + arMiddle.getY() + ", z = " + arMiddle.getZ());
        System.out.println("Arithmetic middle = " + arMiddle.calculate());
        System.out.println("=====================================");


    //Exercise 5
        System.out.println("Exercise 5 - замена на места");
        DigitSwap digitSwap = new DigitSwap();
        digitSwap.setNumber(791);
        System.out.println("Chosen number = " + digitSwap.getNumber());
        System.out.println("Swapped number = " + digitSwap.swapDigits());
        System.out.println("=====================================");


    //Exercise 7
        System.out.println("Exercise 7 - координати");
        Point point = new Point();
        Point pointB = new Point('B');
        Point pointC = new Point('C', 15,7);
        System.out.println(point.toString());
        System.out.println(pointB.toString());
        System.out.println(pointC.toString());
        System.out.println("Exercise 4 from Conditions");
        point.checkQuadrant();
        pointB.checkQuadrant();
        pointC.checkQuadrant();
        System.out.println("=====================================");


    //Exercise 8
        System.out.println("Exercise 8 - должина на остечка");
        Line line = new Line();
        System.out.println("The length of the line from Exercise 7  = " + line.calculateDistance(point, pointB));
        System.out.println("=====================================");


    //Exercise 9
        System.out.println("Exercise 9 - BMI индекс на тежина");
        BMI.calculateBMI(90, 190);
        System.out.println("=====================================");


    //Exercise 10
        System.out.println("Exercise 10 - Кола");
        CarEngine bmwEngine = new CarEngine(EngineType.DIESEL, 4000, 200);
        Car bmw = new Car("BMW", "X6", "Blue", true, 110000, 5, bmwEngine);
        bmw.accelerate();
        bmw.slowDown();
        bmw.brake();
        System.out.println("=====================================");

    //Exercise 6
        System.out.println("Exercise 6 - калкулатор");
        Calculator calculator = new Calculator();
        calculator.calculate();
        System.out.println("=====================================");

    }

}
