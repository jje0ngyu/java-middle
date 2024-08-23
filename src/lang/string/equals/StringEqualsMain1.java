package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {

        // String 클래스의 equals()는 내부 문자열 값을 비교할 수 있도록 재정의(override) 되어있다.

        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));


        // new String() 과 리터럴의 == 비교 값이 다르게 나온다.
        // 리터럴은 각각의 인스터스를 생성하지 않고, "문자열 풀"에서 값을 가져오기 때문이다.
        /*
            문자열 풀 : 문자열 리터럴을 사용하는 경우 메모리 효율성과 성능을 위해 사용.
                        value="hello" 인 경우, 이미 문자열 풀에 정의된 인스턴스 참조 ex) x003
                        value="world" ex) x004

            문자열 풀은 힙 영역을 사용한다.
            문자열 풀은 문자를 찾을 때 해시 알고리즘을 사용하기 때문에 매우 빠른 속도로 해당 인스턴스를 찾는다.
         */
        String str3 = "hello"; // x003
        String str4 = "hello"; // x003
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
