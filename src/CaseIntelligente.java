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
        return 0;
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
