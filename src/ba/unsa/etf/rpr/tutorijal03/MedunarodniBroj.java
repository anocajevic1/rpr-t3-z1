package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {

    private String theBroj;
    public MedunarodniBroj(String drzava, String broj) {
        theBroj += drzava;
        theBroj += broj;
    }

    @Override
    public String ispisi() {
        return theBroj;
    }
}
