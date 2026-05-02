public class demo {

    public static void main(String[] args) {
        
        //Operators In Java 

        //1.Arithmetic Operators     

        int a= 1000, b=5000, c= 1000, d=2000, e=2000;
        System.out.println(a + b);
        System.out.println(d%c);
        e+=2;
        System.out.println(e);

        int h=++e;
        System.out.println(h);

        //2. Relational operator
          // == != < > <= >=

        int ab= 1000;
        int bc=100;
        
        System.out.println(ab<bc);
        System.out.println(ab!=bc);
        System.out.println(ab==bc);


     //3. Bitwise operator 
       // ^ , ~ , & , | , &= ,|= 
      int x = 5;   // 0101
        int y = 3;   // 0011

        System.out.println("Bitwise AND (&): " + (x & y));  // 1
        System.out.println("Bitwise OR (|): " + (x | y));   // 7
        System.out.println("Bitwise XOR (^): " + (x ^ y));  // 6
        System.out.println("Bitwise NOT (~x): " + (~x));    // -6

    //4. Shift Operators
    // >>> , << , >>
      int num = 8; // 1000

        System.out.println("Left Shift (<<): " + (num << 1));   // 16
        System.out.println("Right Shift (>>): " + (num >> 1));  // 4
        System.out.println("Unsigned Right Shift (>>>): " + (num >>> 1)); // 4



        //Logical operators 
        boolean p = true;
        boolean q = false;

        System.out.println("Logical AND (&&): " + (p && q)); // false
        System.out.println("Logical OR (||): " + (p || q));  // true
        System.out.println("Logical NOT (!p): " + (!p));     // false

      // Uninary Opertors
      int m = 5;

        System.out.println("Post-increment m++: " + (m++)); // 5
        System.out.println("After m++: " + m);              // 6

        System.out.println("Pre-decrement --m: " + (--m));  // 5
    }
}                                                            