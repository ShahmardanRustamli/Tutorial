package interface_segregation;

public class Penguin implements Eat,Swim{
    // Pinqivin klassimiz da ozune lazim olan methodlari Override etdi.
    // pinqivin yemek yeye bilir ve uze bilir, lakin uca bilmir..
    @Override
    public void Eat() {

    }

    @Override
    public void Swim() {

    }
}
