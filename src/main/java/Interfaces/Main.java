package Interfaces;

public class Main {
    public static void main (String[] args) {
        // ____________________ Interfaces ____________________ //
        Leone leone = new Leone();
        Gazzella gazzella = new Gazzella();
        Pesce pesce = new Pesce();

        leone.caccia();
        gazzella.scappa();
        pesce.caccia();
        pesce.scappa();
    }
}
