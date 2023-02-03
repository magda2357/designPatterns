package Strategy;

public class KrzyżówkaKaczka extends Kaczka {

    public KrzyżówkaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydła();
    }

    public void wyświetl() {
        System.out.println("Jestem prawdziwą kaczką krzyżówką");
    }
}
