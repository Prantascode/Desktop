package MyCode;

public class Student extends Person{
    String major;
    public Student(String name,int id, String major){
        super(name,id);
        this.major = major;
    }
    public void showInfo(){
        System.out.println("Major : "+major);
    }
}
