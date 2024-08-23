package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {

        // 문자열 비교에 항상 equals()를 사용해야 하는 이유
        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002
        System.out.println("매서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("매서드 호출 비교1: " + isSame(str3, str4));


    }

    /*
        문자열 비교에 인스턴스가 비교될 지, 리터럴이 비교될 지 알 수 없기 때문에
        문자열 비교에서는 항상 동등성 비교(equals)가 사용되어야 한다.
     */
    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y);
    }
}
