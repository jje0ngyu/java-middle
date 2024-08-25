package lang.wrapper;

public class MyIntegerNullMain1 {

    // 기본형은 항상 값이 존재해야 한다.
    // 반면에 객체인 참조형은 값이 없다는 null 을 사용할 수 있다.
    // null 을 사용할 경우 NullPointException 이 발생할 수 있기 때문에 주의해서 사용한다.

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
