public class ex_09 {
    public static void main(String[] args){
        String subject = "JAVA programming";

        int location = subject.indexOf("programming");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(subject);

        // 문자열 return
        location = subject.indexOf("JAVA");
        if(location != -1){
            System.out.println("자바와 관련된 책입니다.");
        }else{
            System.out.println("자바와 관련 없는 책입니다.");
        }


        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책입니다.");
        }else{
            System.out.println("자바와 관련 없는 책입니다.");
        }
    }
}
