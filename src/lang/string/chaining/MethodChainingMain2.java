package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        // adder, adder1, adder2 의 참조 값이 동일하다.
        System.out.println("adder2 = " + adder);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
    }
}
