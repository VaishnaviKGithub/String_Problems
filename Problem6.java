//count the vowel in string
public class Problem6 {
    public static void main(String[] args) {
        String s1="International";
        String vowels="AEIOUaeiou";
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(vowels.contains(String.valueOf(s1.charAt(i))))
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
