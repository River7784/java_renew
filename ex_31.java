public class ex_31 {
    //인스턴스 필드와 메소드 선언
    int field1;

    void method1() {}

    //정적 필드와 메소드 선언
    static int field2;
    static int method2() {}

    static {
        field2 = 10;
        method2();
    }

    //정적 메소드 선언
    static void Method3 {
        //this.field1 = 10;
        //this.method1();

        ClassName obj = new ClassName();

        obj.field1 = 10;
        obj.method1();

        /*
        field2 = 10;
        method2();
         */
    }
}
