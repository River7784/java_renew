public class computer3 extends calculator3{
    //메소드 오버라이드
    @Override
    public double areaCircle(double r){
        System.out.println("computer3 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
