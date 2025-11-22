//WAP to shift all vowels at last of string

public class Problem8 {
    
    public static void main(String[] args) {
    
            String s1="international";
            String s2="AEIOUaeiou";
            StringBuilder vow=new StringBuilder();
            StringBuilder sb=new StringBuilder();

            for(int i=0;i<s1.length();i++)
            {
                if(s2.contains(String.valueOf(s1.charAt(i))))
                {
                    vow.append(s1.charAt(i));
                }
                else
                {
                    sb.append(s1.charAt(i));
                }
            }
            sb.append(vow);
            System.out.println(sb);
   }

}
