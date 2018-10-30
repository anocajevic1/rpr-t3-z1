package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

    private String theBroj = "0";
    public enum Grad  {
        SARAJEVO, TUZLA, ZENICA;
    }

    public FiksniBroj(Grad grad, String broj){
        if(grad == Grad.SARAJEVO)  theBroj+= 33;
            else if(grad == Grad.ZENICA) theBroj+= 32;
                else if(grad == Grad.TUZLA) theBroj += 35;

                theBroj+=broj;

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
