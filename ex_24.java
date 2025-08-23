public class ex_24 {
    public static void main(String[] args){
        //car_spec 객체 생성
        car_spec myCar = new car_spec();

        System.out.println("제조사 : " + myCar.company);
        System.out.println("모델 : " + myCar.model);
        System.out.println("색상 : " + myCar.color);
        System.out.println("출력 : " + myCar.hp);

        //객체의 필드값 변경
        myCar.torque = 60;
        System.out.println("수정된 토크 : " + myCar.torque);
    }
}
