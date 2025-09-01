public class car {
    String model;
    boolean start;
    int speed;

    car(String model){
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "의 속도는 시속 " + this.speed + "km/h");
    }
}
