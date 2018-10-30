package ba.unsa.etf.rpr.tutorijal03;
import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap();
    public  void dodaj (String ime, TelefonskiBroj broj){
        imenik.put(ime,broj);
    }
        public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
        // jel dobro ovo ? nesto treba pozivati ispisi ??
    }
    public String dajIme(TelefonskiBroj broj){

        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet() ) {
            if(Objects.equals(broj, entry.getValue())){
                return entry.getKey();
            }
        }

        return null;

    }

    public String naSlovo (char s) {
        String povratna = new String();
        int brojac = 0;
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()){
           if(entry.getKey().startsWith(String.valueOf(s))){
               brojac++;
               povratna = povratna + brojac + ". " + String.valueOf(entry.getKey()) + " " + String.valueOf(entry.getValue()) + "\n";
           }
        }

        return povratna;
    }

    public Set<String> izGrada (FiksniBroj.Grad g){
        Set<String> povratni = new TreeSet<String>();

        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()){

        }

        return povratni;
    }
}
