//WAP to find largest word from string
public class Problem13 {
    public static void main(String[] args) {
        String s1="hello i am java developer ";
        String[] s2=s1.split(" ");
        int max=0;
        for(int i=0;i<s2.length;i++)
        {
            if(max<s2[i].length())
            {
                max=s2[i].length();
            }
        }

        for(int i=0;i<s2.length;i++)
        {
            if(max==s2[i].length())
            {
                System.out.println(s2[i]);
                break;
            }
        }
    }
}
