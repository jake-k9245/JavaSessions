package Chapter2;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + "가 먹고 있습니다.");
    }
}