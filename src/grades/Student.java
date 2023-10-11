package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);

    }

    public double getGradeAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String getGrades() {
        String output = "";
        for (int grade : grades) {
            output += grade + " ";
        }
        return output;
    }

    public void allStudents() {
        HashMap<String, Student> students = new HashMap<>();
        for (String key : students.keySet()) System.out.print("|" + key + "| ");
    }
}
