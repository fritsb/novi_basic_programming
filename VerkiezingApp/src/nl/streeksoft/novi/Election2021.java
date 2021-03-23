package nl.streeksoft.novi;

public class Election2021 extends Election {

    public Election2021(String name, int year) {
        super(name, year);

        System.out.println("Verkiezing aangemaakt met naam: " + name + ", van jaar: " + year);
    }

    @Override
    public void doSomething() {
        System.out.println("Something");
    }
}
