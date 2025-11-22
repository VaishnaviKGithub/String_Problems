// WAP to reverse each word from string
public class Problem11 {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String[] s2=s1.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder word=new StringBuilder();
            word.append(s2[i]);
            sb.append(word.reverse()+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    
}
