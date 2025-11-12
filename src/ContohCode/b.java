package ContohCode;

public class b extends a {
    void method1() {
        // Compile-error! We cannot override a final method
        System.out.println("Illegal!");
    }
}
