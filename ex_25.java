public class ex_25 {
    public static void main(String[] args){
        car_spec car1 = new car_spec();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        car_spec car2 = new car_spec("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        car_spec car3 = new car_spec("자가용", "색상");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        car_spec car4 = new car_spec("승합", "노랑", 235, 30);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.hp : " + car4.hp);
        System.out.println("car4.torque : " + car4.torque);
        System.out.println();
    }
}
