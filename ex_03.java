public class ex_03 {
    public static void main(String[] args){
        String strVar1 = "str";
        String strVar2 = "str";

        if (strVar1 == strVar2){
            System.out.println("strVar1 과 strVar2 은 참조가 같음");
        } else {
            System.out.println("strVar1 과 strVar2 은 참조가 다름");
        }

        if (strVar1.equals(strVar2)){
            System.out.println("strVar1 과 strVar2 은 문자열이 같음");
        }

        String strVar3 = new String("str");
        String strVar4 = new String("str");

        if (strVar3 == strVar4){
            System.out.println("strVar3 과 strVar4 은 참조가 같음");
        } else {
            System.out.println("strVar3 과 strVar4 은 참조가 다름");
        }

        if (strVar3.equals(strVar4)){
            System.out.println("strVar3 과 strVar4 은 문자열이 같음");
        }
    }
}
