package lang.wrapper;

/*  기본형의 한계
    : 기본형(Primitive Type)은 객체가 아니기 때문에 다음과 같은 한계가 있다.
        - 매서드 제공 불가
        - 객체 참조가 필요한 컬렉션 프레임워크 사용불가
        - 제네릭 사용불가
        - null 값을 가질 수 없음
 */

// 래퍼(wrapper) 클래스는 기본형을 객체로 만들어주는 클래스이다.

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
