package Object;

public abstract class Animal {
    int age;
    int weight;

    void makeNoise() {
        System.out.println("I'm an animal!");
    }

    void sleep(){
        System.out.println("I'm sleeping");
    }

    boolean isOlder (Animal other){
        if (other.age > this.age) return true;
        return false;
    }
}
