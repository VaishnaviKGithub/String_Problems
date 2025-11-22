//WAP to count special char in given string 
public class Problem21 {
    
    public static void main(String[] args) {
        String s1="hello i am aman, where is nayan & naman???";
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(!(Character.isLetterOrDigit(s1.charAt(i)) || Character.isWhitespace(s1.charAt(i))))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
