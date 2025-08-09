public class ex_10 {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String,홍길동";

        //문자열 분리
        String[] tokens = board.split(",");

        //인덱스
        System.out.println("번호 : " + tokens[0]);
        System.out.println("제목 : " + tokens[1]);
        System.out.println("내용 : " + tokens[2]);
        System.out.println("이름 : " + tokens[3]);
        System.out.println();

        //반복문 for
        for (int i = 0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}
