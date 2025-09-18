public class ex_38 {

    private int speed;
    private boolean stop;

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if (speed < 0){
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }
}
