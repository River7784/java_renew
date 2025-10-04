public class ex_47 {
    public static void main(String[] args){
        ex_46 sa = new ex_46();
        sa.takeoff();
        sa.fly();
        sa.flyMode = ex_46.SUPERSONIC;
        sa.fly();
        sa.flyMode = ex_46.NORMAL;
        sa.fly();
        sa.land();
    }
}
