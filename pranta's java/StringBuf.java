public class StringBuf {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pranto");
        sb.deleteCharAt(5);
        sb.insert(5,"a");
        sb.append(" Saha");
        sb.insert(0,"Programmer ");
        System.out.println(sb);
    }
}
