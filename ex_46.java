public class ex_46 extends  airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly(){
        if (flyMode == SUPERSONIC){
            System.out.println("초음속 비행");
        } else {
            super.fly();    //기존에 있어서 그냥 호출 가능
        }
    }
}
