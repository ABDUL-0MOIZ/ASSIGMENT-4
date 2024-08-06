public  class Revese {
    public static void main(String[] args) {
        String er=revrse("ali",2);
        System.out.println(er);
    }

    private static String revrse(String value, int i) {
        char[] arr = value.toCharArray();
        String a = "";
        a = a + arr[i];
        if (i == 0) {
            return a;
        }
        return a + revrse(value, i - 1);


    }
    }