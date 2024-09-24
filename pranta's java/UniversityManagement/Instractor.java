package UniversityManagement;

public class Instractor extends Person {
    private String department;

    public Instractor(String name, int id , String department){
        super(name, id);
        this.department = department;
    }
    public void showInfo(){
        System.out.println("Instractor Information");
        displayInfo();
        System.out.println("Derpartment : "+department);
    }
}

