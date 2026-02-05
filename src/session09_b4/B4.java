package session09_b4;

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

    public void run() {
        System.out.println("Chó đang chạy");
    }
}

public class B4 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.run();
        }
    }
}
