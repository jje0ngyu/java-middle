package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;

    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // 불변객체에서 새로운 값을 지정
    // 기존 값을 유지한 상태로 새로운 값을 새로운 인스턴스로 내보낼 때는 set -> with 로 이름을 설정해준다.
    public ImmutableMyDate withYear(int newYear) {

        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth) {

        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay) {

        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return  year + "-" + month + "-" + day;
    }
}
