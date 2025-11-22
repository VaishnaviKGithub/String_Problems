//WAP to swap first and last char from string
public class Problem3 {
    public static void main(String[] args) {
        String s1="India";
        StringBuilder sb=new StringBuilder();
        sb.append(s1.charAt(s1.length()-1));
        sb.append(s1.substring(1, s1.length()-1));
        sb.append(s1.charAt(0));
        System.out.println(sb);
    }
    
}
