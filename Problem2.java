//WAP to shift last char to first from string
public class Problem2 {
    public static void main(String[] args) {
          String s1="India";
          StringBuilder sb=new StringBuilder();
          sb.append(s1.charAt(s1.length()-1));
          sb.append(s1.substring(0,s1.length()-1));
          System.out.println(sb);
        }
}
