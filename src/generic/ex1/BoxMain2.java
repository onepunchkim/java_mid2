package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox intergerBox = new ObjectBox();
        intergerBox.set(10);
        Integer integer = (Integer) intergerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        intergerBox.set("문자100");
        Integer result = (Integer) intergerBox.get(); //String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
