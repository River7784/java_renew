public class SmartPhone1 extends Phone1{
    public SmartPhone1(String model, String color){
        super(); //생략 가능(컴파일 시 자동 추가됨)
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone1(String model, String color) 생성자 실행됨");
    }
}
