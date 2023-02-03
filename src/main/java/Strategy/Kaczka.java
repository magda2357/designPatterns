package Strategy;

public abstract class Kaczka {
    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public Kaczka() {
    }

    public abstract void wyświetl();

    public void wykonajLeć() {
        latanieInterfejs.leć();
    }

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void płyń() {
        System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
    }

    public void ustawLatanieInterfejs(LatanieInterfejs li) {
        latanieInterfejs = li;
    }

    public void ustawKwakanieInterfejs(KwakanieInterfejs ki) {
        kwakanieInterfejs = ki;
    }
}
