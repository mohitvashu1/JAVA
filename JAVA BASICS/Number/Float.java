public class Float {

    public static void main(String[] args) {
        //Float
        float myNum = 69.99f;
        System.out.println(myNum);
    
        //Double
        double MyNumber = 48.9d;
        System.out.println(MyNumber);

        float f = 0.7f;
        System.out.printf("%.20f%n",f);
}
}

//precision of float is only 6-7 decimal digits,
//while double variables have a precision of about 16 digits.
//Therefore it is safer to use double for most calculations.