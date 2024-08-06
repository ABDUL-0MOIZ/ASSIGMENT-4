public class pow {
    public static void main(String[] args) {
       long res= pow(2,3);
        System.out.println(res);
    }
       static long pow(int x,int e){
        if(e==0){
            return 1;
        }
        //2*2*1
        return x * pow(x,e-1);
    }
}