//WAP to print each word with its length at its end
public class Problem9 {
    public static void main(String args[])
    {
        String s1="hello i am a java developer";
        String[] s2=s1.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder word=new StringBuilder(s2[i]);
            word.append(word.length());
            sb.append(word+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
