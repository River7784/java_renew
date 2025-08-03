public class ex_05 {
    public static void main(String[] args){
        String ssn = "9710271234567";
        char sex = ssn.charAt(6);
        switch (sex){
            case '1':
            case '3':
                System.out.println("male");
                break;
            case '2':
            case '4':
                System.out.println("female");
                break;
        }
    }
}
