//sort the string alphabetically
public class Problem5 {

    public static void main(String[] args) {
        String s1="international";
        char ch[]=s1.toCharArray();
        java.util.Arrays.sort(ch);
        StringBuilder sb=new StringBuilder();
        sb.append(ch);
        System.out.println(sb);
    }
    
}
