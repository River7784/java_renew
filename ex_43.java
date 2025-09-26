public class ex_43 {
    public static void main(String[] args){
        SmartPhone1 myPhone = new SmartPhone1();

        //Phone으로부터 상속 받은 필드 읽기
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
    }
}
