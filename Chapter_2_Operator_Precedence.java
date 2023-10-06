package Chapter_2.Chapter_2;

public class Chapter_2_Operator_Precedence {
    public static void main(String[] args) {
        int a = 7*5-34/2;
        /*
            =35 - 34/2
            =35 - 17
            =18
         */
        System.out.println(a);
        int b = 60/5-34*2;
        /*
            = 12 - 34*2
            = 12 - 68
            = -56
         */
        System.out.println(b);
        //Precedence & Associativity
    }
}
