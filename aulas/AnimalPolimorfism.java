class Animal{
    public String sound;

    public void makeSound(){
        System.out.println(this.sound);
    }
}

class Cat extends Animal{
    public String sound = "miau-miau";

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }
}

class Dog extends Animal{
    public String sound = "au-au";

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }
}

public class AnimalPolimorfism {
    public static void main(String [] args){
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }   
}
