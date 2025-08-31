public class ex_27 {
    public static void main(String[] args){
        //computer 객체 생성
        computer myCom = new computer();

        //sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고 합산 결과를 리턴 받아 result1에 대입
        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1 : " + result1);
    }
}
