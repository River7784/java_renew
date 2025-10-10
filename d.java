public class d extends a{
    public d(){
        super();
    }

    public void method(){
        this.field = "value";
        this.method();
        //상속을 통해서만 사용 가능
    }

    public void method2(){
        a a = new a();
        a.field = "value";
        a.method();
        //직접 객체 생성하여 사용하는것은 안됨
    }
}
