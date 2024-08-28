package JavaTutorial.Enum;

enum Status{
    Runing, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Pending;
        // for(Status s : ss )
        //System.out.println(s.ordinal()+ " : " + s);
        switch (s) {
            case Runing:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;     
            default:
                System.out.println("Done");
                break;
        }
    }
}
