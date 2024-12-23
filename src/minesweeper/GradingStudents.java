import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (int grade : grades) {
            int nextMultipleOfFive = (grade + 4) / 5 * 5;
            int difference = nextMultipleOfFive - grade;

            if (grade >= 38 && difference < 3) {
                roundedGrades.add(nextMultipleOfFive);
            } else {
                roundedGrades.add(grade);
            }
        }

        return roundedGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> roundedGrades = gradingStudents(grades);

        for (int grade : roundedGrades) {
            System.out.println(grade);
        }
    }
}