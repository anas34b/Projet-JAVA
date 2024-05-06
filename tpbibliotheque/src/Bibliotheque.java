import java.util.ArrayList;
public class Bibliotheque {
    private ArrayList<Livre> livres;

    /**
     * le constructeur cree une liste de class livre
     */
    public Bibliotheque() {
        this.livres = new ArrayList<Livre>();
    }
    /**
     * on ajoute un livre avec la methode add() de liste
     * @param livre
     */
    public void ajoutLivre(Livre livre) {
        livres.add(livre);
    }

    /**
     * on affiche la liste en utilisant la boucle for et la methode tostring()
     */
    public void afficher() {
        for (int i = 0; i < livres.size(); i++) {
            System.out.println(livres.get(i).toString());
        }
    }
    /**
     * cette fonction retourne le livre si son auteur est identique à celui du parametre sinon il envoi l'erreur
     * @param auteur
     * @return
     * @throws Exception
     */
    public Livre rechercherAuteur(String auteur) throws Exception {
        for (Livre livre : livres) {
            if (livre.getAuteur().getNom().equals(auteur)) {
                return livre;
            }
        }throw new Exception("Livre non trouvé");
    }

    /**
     * cette fonction retourne le livre si son titre est identique à celui du parametre sinon il renvoi une erreur
     * @param titre
     * @return
     * @throws Exception
     */
    public Livre rechercherTitre(String titre) throws Exception {
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).getTitre().equals(titre)) {
                return livres.get(i);
            }
        }throw new Exception("Livre non trouvé");
    }
    
}
