package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {

        // https:// 로 시작하는지 확인하기  (startWith)
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");
        System.out.println("result = " + result);
    }
}
