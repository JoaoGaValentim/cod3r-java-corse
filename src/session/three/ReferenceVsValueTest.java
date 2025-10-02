package session.three;

public class ReferenceVsValueTest {
    int a = 3;
    static int b = 4;

    public static void main(String[] args) {
        ReferenceVsValueTest referenceVsValueTest = new ReferenceVsValueTest();
        System.out.println(referenceVsValueTest.a);
        referenceVsValueTest.a++;

        System.out.println(referenceVsValueTest.a);
        System.out.println(b);
    }
}
