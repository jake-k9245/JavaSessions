package Chapter2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    void bark() {
            System.out.println(name + "가 멍멍 짖습니다.");
        }

}
