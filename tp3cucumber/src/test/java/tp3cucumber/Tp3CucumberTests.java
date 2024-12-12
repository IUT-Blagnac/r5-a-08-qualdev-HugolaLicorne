package tp3cucumber;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tp3CucumberTests {

    private List<String> joueurs;
    private Random random;
    private int tirageSimule;

    public Tp3CucumberTests() {
        this.joueurs = new ArrayList<>();
        this.random = new Random();
    }

    public void ajouterJoueur(String joueur) {
        joueurs.add(joueur);
    }

    public void retirerJoueur(String joueur) {
        joueurs.remove(joueur);
    }

    public void setTirageSimule(int tirage) {
        this.tirageSimule = tirage; 
    }

    public void tirageAleatoire(String joueur) {
        int tirage = tirageSimule;
        if (tirage > 0) {
            ajouterJoueur(joueur);
        } else if (tirage < 0) {
            retirerJoueur(joueur);
        }
    }

    public List<String> getJoueurs() {
        return joueurs;
    }

    public int getTailleListe() {
        return joueurs.size();
    }

    public void reinitialiserListe() {
        joueurs.clear();
    }
}
