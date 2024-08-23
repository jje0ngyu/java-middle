package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");

        // 방법 1. 새로운 인스턴스를 생성한다.
        date1 = new ImmutableMyDate(2025, 1, 1);

        // 방법 2. 불변객체의 값을 변경하기 위해 생성한 withYear()을 이용한다.
        date1.withYear(2025);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
