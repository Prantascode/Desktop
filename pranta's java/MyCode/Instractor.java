package MyCode;

public class Instractor extends Person {
    String department;
    public Instractor(String name, int id, String department){
        super(name, id);
        this.department = department;
    }
    public void showInfo(){
        System.out.println("Department : "+department);
    }
}
