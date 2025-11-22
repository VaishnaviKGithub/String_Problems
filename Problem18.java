//WAP to shift vowels from each words at last of words from string
public class Problem18 {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String s2[]=s1.split(" ");
        String s3="AEIOUaeiou";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder vow=new StringBuilder();
            StringBuilder word=new StringBuilder();
            String str=s2[i];
            for(int j=0;j<str.length();j++)
            {
                
                if(s3.contains(String.valueOf(str.charAt(j))))
                {
                    vow.append(str.charAt(j));
                }
                else{
                    word.append(str.charAt(j));
                }
            }
            word.append(vow);
            sb.append(word+" ");
        }

        System.out.println(sb);
    }
}
