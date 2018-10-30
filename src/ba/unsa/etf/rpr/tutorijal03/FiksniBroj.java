package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

    private String theBroj;
    public enum Grad  {
        SARAJEVO, TUZLA, ZENICA;
    }

    public FiksniBroj(Grad grad, String broj)
        theBroj = "0";

    }

    @Override
    public String ispisi() {
        return theBroj;
    }

    @Override
    public int HashCode() {
        return 0;
    }
}
