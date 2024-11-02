package MyCode;

abstract class User {
    String name;
    int id;
    public User (String name, int id){
        this.name = name;
        this.id = id;
    }
    public abstract void showInfo();
}
