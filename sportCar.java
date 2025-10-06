public class sportCar extends car2{
    @Override
    public void speedUp() {
        speed += 10;
    }

    @Override
    public void stop(){     //final이라 Override 불가
        System.out.println("정지");
        speed = 0;
    }
}
