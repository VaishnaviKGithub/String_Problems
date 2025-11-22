//WAP to shift vowels at last of string
public class Problem19 {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        StringBuilder sb=new StringBuilder();
        StringBuilder vow=new StringBuilder();
        String s2="AEIOUaeiou";
        for(int i=0;i<s1.length();i++)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
                vow.append(s1.charAt(i));
            }
            else
            {
                if(!(Character.isWhitespace(s1.charAt(i))))
                {
                    sb.append(s1.charAt(i));
                }
            }
        }
        sb.append(vow);
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isWhitespace(s1.charAt(i)))
            {
                sb.insert(i, " ");
            }
        }
        System.out.println(sb);
    }
}
