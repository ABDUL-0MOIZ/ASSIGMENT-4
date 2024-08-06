
public class man {
    public static void main(String[] args) {
//     A palindrome is a sequence of characters or numbers that looks the same forwards and backwards. For example,
//"Madam, I'm Adam" is a palindrome because it is spelled the same reading it from front to back as from back to
//front. The number 12321 is a numerical palindrome. Write a function that takes a string and its length as
//arguments and recursively determines whether the string is a palindrome:
//int ispalindrome(string s, int len).?

        boolean ch = ispalindrome("madam",4,0);
        if(ch){
            System.out.println("pilandrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    static boolean ispalindrome(String number, int i,int j)
    {


        boolean a = false;

        if (number.charAt(i) == number.charAt(j)) {
            if (i == 0)
                return a;
            ispalindrome(number, i - 1, j + 1);
            a = true;



        }

        return a;
    }
}