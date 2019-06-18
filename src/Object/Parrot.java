package Object;

public class Parrot extends Bird {

    boolean czyUmieKrakac;

    @Override
    public void makeNoise() {
        System.out.println("Polly wants a cracker");
    }

    public void setCzyUmieKrakac() {
        System.out.println(czyUmieKrakac);
    }
}
