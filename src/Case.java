public class Case {
    private boolean contientUneBombe ;
    private boolean estDecouverte ;
    private boolean estMarquee;

    public Case() {
        this.reset();
    }

    public void reset() {
        this.contientUneBombe = false;
        this.estDecouverte = false;
        this.estMarquee = false;
    }

    public void poseBombe() {
        this.contientUneBombe = true;
    }

    public boolean contientUneBombe() {
        return this.contientUneBombe;
    }

    public boolean estDecouverte() {
        return this.estDecouverte;
    }

    public boolean estMarquee() {
        return this.estMarquee;
    }

    public boolean reveler() {
        if(!this.estDecouverte) {
            this.estDecouverte = true;
            this.estMarquee = false;
            return true;
        }
        return false;
    }

    public void marquer() {
        if (!this.estDecouverte()) {
            this.estMarquee = true;
        }
    }
}

