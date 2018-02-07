/*

    Think Java Chapter 2 Exercise 8: Static fields mechanism demo

*/

public class ThinkJava2E8 {

    // Run point
    public static void main(String[] args) {
        TestClass test1 = new TestClass();
        TestClass test2 = new TestClass();
        TestClass test3 = new TestClass();
        test1.prnFields();
        test2.prnFields();
        test3.prnFields();
    }

}
