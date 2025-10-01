public class ex_45 {
    public static void main(String[] args){
        int r = 10;

        calculator3 calculator = new calculator3();
        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println();

        computer3 computer = new computer3();
        System.out.println("원 면적 : " + computer.areaCircle(r));
    }
}
