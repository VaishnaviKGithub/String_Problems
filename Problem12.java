//WAP to find palindrome words from string
public class Problem12 {
    
    public static void main(String[] args) {
        String s1="hello nayan and amit where is naman";
        String[] s2=s1.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder word =new StringBuilder();
            word.append(s2[i]);
            if(word.toString().equalsIgnoreCase(word.reverse().toString()))
            {
                System.out.println(s2[i]);
            }
        }
    }
}
