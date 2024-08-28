import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println("Absulate path :  " +myObj.getAbsolutePath());
            }
            else{
                System.out.println("File Already exixts");
            }
        } catch(IOException e){
            System.out.println("An error occurred");
        }
    }
}
