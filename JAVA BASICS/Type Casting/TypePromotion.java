public class TypePromotion{
    public static void main(String[] args) {
        //Rules
        //1. byte,short,char promoted to int
        //2. if one operand will float,long,double then every will

        byte b=42;
        short s=1024;
        char c= 'a';
        int i=50000;
        float f = 5.67f;
        long l =50000000;
        double d=.1234;

        double result = (f * b)+(i + c) + (d * s) + (l + c);

        System.out.println((f * b)+ " + "+ (i + c)+ " + " +(d * s) +" + " +(l + c));
        System.out.println("Result = "+ result);

    }
}