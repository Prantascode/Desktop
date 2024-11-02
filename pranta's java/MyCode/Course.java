package MyCode;

public class Course implements GradingSys{
    String courseName;
    Instractor instractor;
    Student [] students;
    String[] grades;
    int StudentCount;
    public Course(String coursename, Instractor instractor, int maxstudent){
        this.courseName = coursename;
        this.instractor = instractor;
        this.students = new Student[maxstudent];
        this.grades = new String[maxstudent];
        this.StudentCount = 0;
    }
    public void GradAssign(Student student, String grade){
        if(StudentCount < students.length){
            students[StudentCount] = student;
            grades [StudentCount] = grade;
            StudentCount++;
        }
    }
    public void displayGrade(){
        for(int i = 0;i<StudentCount;i++){
            System.out.println(students[i].name+" "+grades[i]);
        }
    }
    public void showCourseDetails(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Instractor : "+instractor.name);
    }
}
