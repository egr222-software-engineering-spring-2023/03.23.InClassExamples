public abstract class Duck {
    public Duck() {
    }

    public abstract void display();
    public void quack() {
        System.out.println("Quack");
    }
    public void swim() {
        System.out.println("Swim");
    }

    public void fly() { System.out.println("I'm flying"); }
}
