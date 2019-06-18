package Object;

public class Program {
    public static void main(String[] args) {

        //Animal animal = new Animal();
        //animal.weight = 100;
        //animal.makeNoise();

        Bird seagull = new Bird();
        seagull.weight = 10;
        seagull.canFly = true;
        seagull.makeNoise();

        Dog reksio = new Dog();
        Parrot polly = new Parrot();
        polly.czyUmieKrakac = true;

        System.out.println("---------");

        Animal [] zoo = {seagull, reksio, polly };
        for(Animal a : zoo) {
            a.makeNoise();
        }

        System.out.println("---------");

        Animal pollyx = new Bird();
        polly.age = 10;
        polly.weight = 1;
        polly.sleep();

        Animal alfa = new Dog();
        alfa.age = 2;
        alfa.weight = 10;
    }
}




