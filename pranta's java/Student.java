public class Student {
    int id ;
    String name;
    public Student(String name, int id){
        this.id = id;
        this.name =name;
    }
    public void dispalyInfo(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
}
class Main12{
    public static void main(String[] args) {
        Student myStudent = new Student("Pranta Saha", 34);
        myStudent.dispalyInfo();
    }
}
