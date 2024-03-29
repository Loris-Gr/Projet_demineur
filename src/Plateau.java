import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau{
    private int nbLignes ;
    private int nbColonnes ;
    private int pourcentageDeBombes ;
    private int nbBombes ;
    private List<List<CaseIntelligente>> lePlateau;

    public Plateau(int nbLignes, int nbColonnes, int pourcentage) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentage;
        this.creerLesCasesVides();
    }

    private void creerLesCasesVides() {
        this.lePlateau = new ArrayList<>();
        for (int i=0; i < nbLignes; i++) {
            List<CaseIntelligente> listeEnCours = new ArrayList<>() ;
            for (int j=0; j < nbLignes; j++){
                listeEnCours.add(new CaseIntelligente());                   
            }
            this.lePlateau.add(listeEnCours);
        }
        this.rendLesCasesIntelligentes();
    }

    private void rendLesCasesIntelligentes() {
        for (int x = 0; x< this.nbLignes; x++) {
            for (int y = 0; y< this.nbColonnes; y++) {
                for (int dx=-1; dx<2; dx++) {
                    for (int dy=-1; dy<2; dy++) {
                        if (dx!=0 || dy!=0) {
                            try {
                                this.getCase(x, y).ajouteVoisine(this.getCase(x+dx, y+dy));
                            }
                            catch(IndexOutOfBoundsException e){}
                        }
                    }
                }
            }
        }
    }

    public int getNbLignes() {
        return this.nbLignes;
    }

    public int getNbColonnes() {
        return this.nbColonnes;
    }

    public int getPourcentageDeBombes() {
        return this.pourcentageDeBombes;
    }

    public int getNbTotalBombes() {
        return this.nbBombes;
    }

    public CaseIntelligente getCase(int numLigne, int numColonne) {
        return this.lePlateau.get(numLigne).get(numColonne);
    }

    public int getNbCasesMarquees() {
        int compteur = 0;
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbLignes; j++){
                if (this.getCase(i,j).estMarquee()) {
                    compteur+=1;
                }
            }
        }
        return compteur;
    }

    public void poseBombe(int x, int y) {
        this.getCase(x, y).poseBombe() ;
    }

    public void reset() {
        this.nbBombes = 0;
        for (int i=0; i < this.nbLignes; i++) {
            for (int j=0; j < this.nbColonnes; j++){
                this.getCase(i, j).reset();
            }
        }
    }

    protected void poseDesBombesAleatoirement(){
        Random generateur = new Random();
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if (generateur.nextInt(100)+1 < this.pourcentageDeBombes){
                    this.poseBombe(x, y);
                    this.nbBombes = this.nbBombes + 1;
                }
            }
        }
    }
}
