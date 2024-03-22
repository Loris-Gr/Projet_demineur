import java.util.List;
import java.util.ArrayList;
public class CaseIntelligente extends Case {
    private boolean contientUneBombe ;
    private boolean estDecouverte ;
    private boolean estMarquee;
    private List<Case> lesVoisines ;

    public CaseIntelligente() {
        super();
        this.lesVoisines = new ArrayList<>();
    }    

    public void ajouteVoisine(Case uneCase) {
        lesVoisines.add(uneCase) ;
    }

    public int nombreBombesVoisines() {
        int compteur = 0;
        for (Case laCase : lesVoisines) {
            if(laCase.contientUneBombe()) {
                compteur+=1;
            }
        }
        return compteur;
    }

    @Override
    public String toString() {
        if (!estDecouverte && !estMarquee) {
            return " ";
        }
        if (estMarquee) {
            return "?";
        }
        //else
        if (contientUneBombe) {
            return "@";
        }
    }
}
