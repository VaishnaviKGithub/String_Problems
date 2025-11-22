//WAP to shift first and last char to last of string 
public class Problem4 {
    public static void main(String[] args) {
        String s1="India";
        StringBuilder sb=new StringBuilder();
        sb.append(s1.substring(1,s1.length()-1));
        sb.append( s1.charAt(0));
        sb.append(s1.charAt(s1.length()-1));
        System.out.println(sb);
        
    }
}
