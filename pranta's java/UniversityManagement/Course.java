package UniversityManagement;

public class Course implements GradingSystem {
   // private static final Student Student = null;
    private String courseName;
    private Instractor instractor;
    private Student[] students;
    private String[] grades;
    private int studentCount;
    public Course(String courseName ,Instractor instractor,int maxstudent){
        this.courseName = courseName;
        this.instractor = instractor;
        this.students = new Student[maxstudent];
        this.grades = new String[maxstudent];
        this.studentCount = 0;
    }
    public void assignGrade(Student student, String grade){
        if(studentCount < students.length){
            students[studentCount] = student;
            grades[studentCount] = grade;
            studentCount++;
        }
       
    }
    public void displayGrade(){
        System.out.println("Grade for course");
        for(int i =0;i<studentCount;i++){
        System.out.println(students[i].name + " - " +grades[i]);
        }
    }
    public void showCourseDetails(){
        System.out.println("Course name : "+courseName);
        System.out.println("Instractor : "+ instractor.name);
    }
}
