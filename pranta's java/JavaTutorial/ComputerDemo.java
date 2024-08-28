package JavaTutorial;
class computer{
    public void musicPlay(){
        System.out.println("Music playing");
    }
    public String getPen(int cost){
        if(cost >=10)
            return "Pen";
        
        else
            return "Nothing";
    }
}

public class ComputerDemo {
    
    public static void main(String[] args) {
        computer obj = new computer();
        obj.musicPlay();
        String str = obj.getPen(10);
        System.out.println(str);
    }
}
