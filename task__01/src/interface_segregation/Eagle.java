package interface_segregation;

public class Eagle implements Eat, Fly{

    //burada bizim 2 klassimiz var qartal ve pinqivin
    // Qartal uca bilir ve yemek yeye bilir buna gore de biz ona lazim olan methodlari
    // Override etdik
    // qartal uze bilmir buna gore de Swim methodunu boshuna istifade etmis olardiq



    @Override
    public void Eat() {

    }

    @Override
    public void Fly() {

    }
}
