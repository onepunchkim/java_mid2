package generic.test.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
        //return param instanceof T; //오류
        return false;
    }

    public void creat() {
        //return new T(); //오류
    }
}