package chapter10; // Chapter 10a

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        // Note: still an animal, but is specified as a dog (child class).
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(rocky);

        // Note: since they are still under the same parent class (Animal), this is surprisingly legal.
        // However, sasha cannot call scratch like 'sasha.scratch', we will need to cast it
        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    // Note: even though rocky is under the Dog class, we can still pass it as an argument
    public static void feed(Animal animal) {

        // Checks if this is an instance of Dog class/Dog type
        if (animal instanceof Dog) {
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here's your cat food");
        }
    }
}
