/*

    Class with static int and int fields

*/

public class TestClass {

    // Test fields
    static int staticField;
    int intField;

    // Object id
    int id;

    // Constructor
    TestClass() {
        // Test fields increment
        staticField++;
        intField++;
        // Using static field to generate id
        id = staticField;
    }

    // Print fields
    void prnFields() {
        System.out.print("Object id = " + id);
        System.out.print(" Static int field = " + staticField);
        System.out.println(" Int field = " + intField);
    }

}
