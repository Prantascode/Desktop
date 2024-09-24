package JavaTutorial.Throw;


class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
       

        try
        {
            j =18/i;
            if(j==0)
                throw new MyException("I don't want zero");
        }
        catch(MyException e){
            j = 18/1;
            System.out.println("That's the default output "+e);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong.."+e);
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}

