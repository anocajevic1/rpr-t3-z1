package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(theBroj);
    }
}
