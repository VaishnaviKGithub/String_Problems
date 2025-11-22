//input: welcome to 2026
//output: 10 // addition of digits
public class Problem20 {
    
    public static void main(String[] args) {
        String s1=" welcome to 2026";
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)))
            {

                int n=Integer.parseInt(String.valueOf(s1.charAt(i)));
                sum+=n;
            }
        }

        System.out.println(sum);

    }
}
