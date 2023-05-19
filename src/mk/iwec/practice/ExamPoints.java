package mk.iwec.practice;

public class ExamPoints {

    public void calculateGrade(int points){
        if (points >= 0 && points <= 50){
            System.out.println("5 пет");
        } else if (points >= 50 && points <= 66) {
            System.out.println("6 шест");
        }else if (points >= 67 && points <= 76) {
            System.out.println("7 седум");
        }else if (points >= 77 && points <= 84) {
            System.out.println("8 осум");
        }else if (points >= 85 && points <= 95) {
            System.out.println("9 девет");
        }else if (points >= 96 && points <= 100) {
            System.out.println("10 десет");
        }else {
            System.out.println("Please enter correct points amount");
        }
    }


}
