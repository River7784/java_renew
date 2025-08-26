public class car_spec {

    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int hp = 200;
    int torque;

    //생성자 선언
    car_spec(){}

    car_spec(String model){
        this.model = model;
    }

    car_spec(String model, String color){
        this.model = model;
        this.color = color;
    }

    car_spec(String model, String color, int hp){
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    car_spec(String model, String color, int hp, int torque){
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.torque = torque;
    }
}
