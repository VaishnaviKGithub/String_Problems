//WAP to shift first char to last in each word of string
public class Problem16 {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String s2[]=s1.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder word=new StringBuilder();
            word.append(s2[i]);
            word.append(word.charAt(0));
            word.deleteCharAt(0);
            sb.append(word+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
