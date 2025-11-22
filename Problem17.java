//WAP to shift last letter to first from each word
public class Problem17 {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String s2[]=s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder word=new StringBuilder();
            word.append(s2[i].charAt(s2[i].length()-1));
            word.append(s2[i].substring(0,s2[i].length()-1));
            sb.append(word+ " ");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    
}
