package mk.iwec.practice;

public class Grade {

    public void showGrade(int grade){
        switch (grade){
            case 1:
                System.out.println("Недоволен");
                break;
            case 2:
                System.out.println("Доволен");
                break;
            case 3:
                System.out.println("Добар");
                break;
            case 4:
                System.out.println("Многу добар");
                break;
            case 5:
                System.out.println("Одличен");
                break;
        }
    }

}
