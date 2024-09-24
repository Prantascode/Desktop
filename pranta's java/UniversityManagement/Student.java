package UniversityManagement;

public class Student extends Person {
    private String major;

    public Student(String name,int id,String major){
        super(name, id);
        this.major = major;
    }
    public void showInfo(){
        System.out.println("Student Information");
        displayInfo();
        System.out.println("Major : "+major);
    }
}
