package enumeration.ex2;

public class ClassGrade {

    // 상수 별로 인스턴스를 생성한다.
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자 추가
    private ClassGrade() {}
}
