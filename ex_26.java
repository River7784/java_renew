public class ex_26 {
    public static void main(String[] args){
        //calculator 객체 생성
        calculator myCalc = new calculator();

        //리턴값이 없는 powerOn() 메소드 호출
        myCalc.powerOn();

        //plus 메소드 호출 시 5와 6을 매개값으로 제공하고 덧셈 결과를 리턴 받아 result 변수에 대입함
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 : " + result1);

        myCalc.powerOff();
    }
}
