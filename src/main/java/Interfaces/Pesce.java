package Interfaces;

public class Pesce implements Predatore, Preda {
    @Override
    public void caccia() {
        System.out.println("Pesce grosso mangia pesce piccolo!");
    }

    @Override
    public void scappa() {
        System.out.println("Pesce piccolo scappa!");
    }
}
