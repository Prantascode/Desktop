package MyCode;

public class Main {
    public static void main(String[] args) {
        Instractor instractor = new Instractor("Majharul Islam", 2002, "CSE");
        Student student = new Student("Pranta", 34, "OOP");
        Course couse = new Course("OOP", instractor, 10);
        couse.GradAssign(student, "A+");
        couse.displayGrade();
        couse.showCourseDetails();
    }
}
