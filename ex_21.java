import java.util.Calendar;

public class ex_21 {
    public static void main(String[] args){
        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        //숫자를 열거 상수로 변환해서 변수에 대입함
        switch (week){
            case 1 : today = Week.SUNDAY;   Break;
            case 2 : today = Week.MONDAY;   Break;
            case 3 : today = Week.TUESDAY;   Break;
            case 4 : today = Week.WEDNESDAY;   Break;
            case 5 : today = Week.THURSDAY;   Break;
            case 6 : today = Week.FRIDAY;   Break;
            case 7 : today = Week.SATURDAY;   Break;
        }

        //열거 타입 변수 사용
        if (today == Week.SUNDAY){
            System.out.println("일요일에는 운동을 합니다.");
        }else {
            System.out.println("자바 공부 합니다.");
        }
    }
}
