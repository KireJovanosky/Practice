package mk.iwec.practice;

public class RunnerConditions {

    public static void main(String[] args) {

    //Exercise 5
        System.out.println("Exercise 5 - поени на испит");
        ExamPoints points = new ExamPoints();
        points.calculateGrade(84);
        System.out.println("=====================================");

    //Exercise 6
        System.out.println("Exercise 6 - денови во месец");
        DaysInMonth days = new DaysInMonth();
        System.out.println("The chosen month has: " + days.calculateDays(5, 2023) + " days");
        System.out.println("=====================================");

    //Exercise 7
        System.out.println("Exercise 7 - оценка");
        Grade grade = new Grade();
        grade.showGrade(3);
        System.out.println("=====================================");

    //Exercise 8
        System.out.println("Exercise 8 - H2SO4");
        H2SO4 molecules = new H2SO4();
        System.out.println("With the given atoms we can create: " + molecules.calculateMolecules(6, 7,12) + " molecules of H2SO4");
        System.out.println("=====================================");






    }

}
