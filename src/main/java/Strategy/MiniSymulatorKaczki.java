package Strategy;

public class MiniSymulatorKaczki {
    public static void main(String[] args) {
        Kaczka dzika = new KrzyżówkaKaczka();
        dzika.wyświetl();
        dzika.wykonajKwacz();
        dzika.wykonajLeć();

        Kaczka modelowa = new ModelowaKaczka();
        modelowa.wyświetl();
        modelowa.wykonajLeć();
        modelowa.ustawLatanieInterfejs(new LatamZNapędemRakietowym());
        modelowa.wykonajLeć();
    }
}
