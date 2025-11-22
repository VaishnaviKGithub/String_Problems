//replace vowels in string with number
public class Problem7 {
    public static void main(String[] args) {
        String s1="international";
        StringBuilder sb=new StringBuilder();
        String vow="AEIOUaeiou";
        int count=1;
        for(int i=0;i<s1.length();i++)
        {
            if(vow.contains(String.valueOf(s1.charAt(i))))
            {
                sb.append(count++);
            }
            else
            {
                sb.append(s1.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
