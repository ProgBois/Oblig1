package Koe;


//********************************************************************
//
//Representerer en samling k¯, implementert vha en tabell.
// foran er i posisjon 0.
//********************************************************************

public class TabellKoe<T> implements KoeADT<T> {
    private final static int STDK = 100;
    private int bak;
    public T[] koe;

    /******************************************************************
     Oppretter en tom k¯ med standard st¯rrelse.
     ******************************************************************/
    public TabellKoe()   {
        this(STDK);
    }

    /******************************************************************
     Oppretter en tom k¯ med kapasitet gitt ved parameter
     ******************************************************************/
    public TabellKoe (int startKapasitet){
        bak = 0;
        koe = (T[])(new Object[startKapasitet]);
    }

    @Override
    public void innKoe(T element) {
        if (antall() == koe.length) {
            utvidKapasitet();
        }
        koe[bak] = element;
        bak++;
    }

    @Override
    public T utKoe() {
        if (erTom()) {
            throw new EmptyCollectionException("koe er tom");
        }
        T resultat = koe[0];
        bak--;
        /** flytter elementene en plass fram */
        for (int i = 0; i < bak; i++) {
            koe[i] = koe[i+1];
        }
        koe[bak] = null;
        return resultat;
    }

    @Override
    public T foerste() {
        if (erTom()) {
            throw new EmptyCollectionException("koe er tom");
        }
        T resultat = koe[0];
        return resultat;
    }

    @Override
    public boolean erTom() {
        return (antall() == 0);
    }

    @Override
    public int antall() {
        return bak;
    }

    private void utvidKapasitet() { // eks. utvide 10%
        T[] hjelpetabell = (T[]) new Object[koe.length + 1];
        for (int i = 0; i < bak; i++) {
            hjelpetabell[i] = koe[i];
        }
        koe = hjelpetabell;
    }

    public T[] getKoe() {
        return koe;
    }

}//class



