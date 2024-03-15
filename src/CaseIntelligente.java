public class CaseIntelligente extends Case {
    private boolean contientUneBombe ;
    private boolean estDecouverte ;
    private boolean estMarquee;

    public CaseIntelligente() {
        this.contientUneBombe = false;
        this.estDecouverte = false;
        this.estMarquee = false;
    }    

    public void ajouteVoisine(Case uneCase) {

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
