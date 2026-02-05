package session09_b2;

class Animal {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Mèo kêu: Meo meo");
    }
}

public class B2{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
