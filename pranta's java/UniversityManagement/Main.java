package UniversityManagement;

public class Main {
    public static void main(String[] args) {
        Instractor instractor = new Instractor("Majharul Hasan", 2010, "CSE");
        Student student  = new Student("Pranta", 34, "CSE");
        Course course = new Course("OPP", instractor, 10);
        
        course.showCourseDetails();
        course.assignGrade(student, "A+");
        course.displayGrade();
    }
}
