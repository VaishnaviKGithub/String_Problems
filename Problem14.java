//WAP to sort string according to words 
public class Problem14 {
    public static void main(String[] args) {
        String s1="hello i am a java developer";
        String s2[]=s1.split(" ");
        java.util.Arrays.sort(s2);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length;i++)
        {
             sb.append(s2[i]+" ");
        }
       sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

    }
    
}
