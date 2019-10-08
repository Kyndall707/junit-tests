import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
