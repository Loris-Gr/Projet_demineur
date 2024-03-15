import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau{
    private int nbLignes ;
    private int nbColonnes ;
    private int pourcentageDeBombes ;
    private int nbBombes ;
    private List<CaseIntelligente> lePlateau;

    public Plateau(int nbLignes, int nbColonnes, int pourcentage) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentage;
    }

    private void creerLesCasesVides() {
        this.lePlateau = new ArrayList<>();
        for (int i=0; i < nbLignes; i++) {
            List<Case> listeEnCours = new ArrayList<>() ;
            for (int j=0; j < nbLignes; j++){
                    

            }
        }
    }

    private void rendLesIntelligentes() {
        
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
        return null;
    }

    public int getNbCasesMarquees() {
        return 0;
    }

    public void poseBombe(int x, int y) {

    }

    public void reset() {

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
