public class Case {
    private boolean contientUneBombe ;
    private boolean estDecouverte ;
    private boolean estMarquee;

    public Case() {
        this.contientUneBombe = false;
        this.estDecouverte = false;
        this.estMarquee = false;
    }

    public void reset() {

    }

    public void poseBomb() {

    }

    public boolean ContientUneBombe() {
        return this.contientUneBombe;
    }

    public boolean EstDecouverte() {
        return this.estDecouverte;
    }

    public boolean EstMarquee() {
        return this.estMarquee;
    }

    public boolean reveler() {
        if(!this.estDecouverte) {
            this.estDecouverte = true;
            return true;
        }
        return false;
    }

    public void marquer() {
        
    }
}

