package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    private String theBroj;
    enum Grad  {
        SARAJEVO, TUZLA, ZENICA;
    }

    public FiksniBroj(Grad grad, String broj)  {

        theBroj = "0";
    }

    @Override
    public String ispisi() {
        return theBroj;
    }
}
