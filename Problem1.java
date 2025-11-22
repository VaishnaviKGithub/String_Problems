//WAP to shift first char to last
public class Problem1 {
    public static void main(String[] args) {
        String s1="INDIA";
        StringBuilder s=new StringBuilder();
        s.append(s1.substring(1));
        s.append(s1.charAt(0));
        System.out.println(s);
    }
    
}
