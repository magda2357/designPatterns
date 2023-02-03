package Strategy;

public class ModelowaKaczka extends Kaczka {
    public ModelowaKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Kwacz();
    }

    public void wyświetl() {
        System.out.println("Jestem modelową kaczką!");
    }
}
