public class ex_02 {
    public static void main(String[] args){
        String hobby = "trip";
        hobby = null;

        String kind1 = "car";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: " + kind2);
    }
}
