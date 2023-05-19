package mk.iwec.practice;

import java.util.Random;

public class Point {

    private int x;
    private  int y;
    private char name;

    public Point(){
        name = 'A';

        Random random = new Random();
        x = random.nextInt(20) - 10;
        y = random.nextInt(20) - 10;
    }

    public Point(char name){
        this.name = name;
        Random random = new Random();
        x = random.nextInt(20) - 10;
        y = random.nextInt(20) - 10;
    }

    public Point(char name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void checkQuadrant(){
        if (x == 0){
            System.out.println("The point lies on X axis");
        }else if (y == 0) {
            System.out.println("The point lies on Y axis");
        }else if (x > 0 && y > 0) {
            System.out.println("The point lies on Quadrant 1");
        }else if (x < 0 && y > 0) {
            System.out.println("The point lies on Quadrant 2");
        }else if (x < 0 && y < 0) {
            System.out.println("The point lies on Quadrant 3");
        }else {
            System.out.println("The point lies on Quadrant 4");
        }
    }

    @Override
    public String toString() {
        return name + "(" + x + ", " + y + ")";
    }
}
