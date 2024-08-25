package lang.wrapper;

public class WrapperClassMain {

    /*
     자바가 제공하는 기본형에 대응하는 래퍼 클래스
     - Byte
     - Short
     - Integer
     - Long
     - Float
     - Double
     - Character
     - Boolean

     * 주의
     - 불변
     - 참조형이기 때문에 동등성 비교를 해야한다. (equals 비교)

     */

    public static void main(String[] args) {
        /*

        래퍼 클래스를 생성 - 박싱(Boxing)
        : 기본형을 래퍼 클래스로 변경하는 것을 마치 박스에 물건을 넣는 것 같다고 해서 박싱(Boxing)이라 한다.

        언박싱 (Unboxing)
        : 래퍼 클래스에 들어있는 기본형을 다시 꺼내는 매서드를 일컫는다.
        : 박스에 들어 있는 물건을 꺼내는 것 같다고 해서 언박싱(Unboxing)이다.

         */

        // Boxing
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변 (String 의 문자열 풀과 같은 맥락)
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        // Unboxing
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        // 자바가 기본으로 제공하는
        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
