package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private String theBroj;
    public MobilniBroj(int mobilnaMreza, String broj)  {
        // konstruktor
       theBroj = "0";
       theBroj+= mobilnaMreza;
       theBroj+= "/";
       theBroj+= broj.substring(0,3);
       theBroj+= "-";
       theBroj+= broj.substring(3);

    }

    @Override
    public String ispisi() {
        return theBroj;
    }
}
