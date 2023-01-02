package guided;

public class Genericprogramming<T> {

    private T t;

    public Genericprogramming(T t){
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
class Sentences {
    public static void main(String[] args) {
        Genericprogramming<String> sentence = new Genericprogramming<>("Nice to meet you, I am David");
        System.out.println(sentence.get());


    }
}