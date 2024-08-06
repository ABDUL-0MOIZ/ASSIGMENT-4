//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Write a function that takes a number as its parameter. The function is to return the
// factorial of that numbergiven by user?
       int fact= facrorial(10);
        System.out.println(fact);
    }

    private static int facrorial(int i) {
        if(i==0)
            return 1;
return i*facrorial(i-1);


    }
}