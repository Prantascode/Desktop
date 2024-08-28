class Human{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}


public class Mydemo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Pranta");
        System.out.println(obj.getName()+ " : " +obj.getAge());
    }
}
