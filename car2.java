public class car2 {
    public int speed;

    public void speerUp(){
        speed += 1;
    }

    public final void stop(){
        System.out.println("정지");
        speed = 0;
    }
}
