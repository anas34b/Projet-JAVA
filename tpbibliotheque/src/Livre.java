public class Livre {
    private int numLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;
    private static int dernierNum;/* un entier statique qui représente le dernier numéro de livre créé. */
    private static int cpt=0; /* * un entier statique qui est utilisé pour générer le numéro de livre.*/
    /**
     * @param titre
     * @param nombreDePages
     * @param auteur
     */
    /*constructeur qui initialise les propriétés du livre avec les valeurs passées en paramètre. */
    public Livre(String titre, int nombreDePages, Personne auteur) {
        this.titre = titre;
        this.nombreDePages = nombreDePages;
        this.auteur = auteur;
        numLivre=cpt;
        cpt++;
        
    }
    /**
     * @return
     */
    /*retourne le numéro du livre. */
    public int getNumLivre() {
        return numLivre;
    }
    /**
     * @return
     */
    /* retourne le titre du livre. */
    public String getTitre() {
        return titre;
    }
    /**
     * @param titre
     *modifie le titre du livre avec la valeur passée en paramètre.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }
    /**
     * @return
     * retourne le nombre de pages du livre.
     */
    public int getNombreDePages() {
        return nombreDePages;
    }
    /**
     * @param nombreDePages
     * modifie le nombre de pages du livre avec la valeur passée en paramètre.
     */
    public void setNombreDePages(int nombreDePages) {  

        this.nombreDePages = nombreDePages;
    }
    /**
     * @return
     */
    public Personne getAuteur() {
        return auteur;
    }
    /**
     * @param auteur
     * modifie l'auteur du livre avec la valeur passée en paramètre.
     */
    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }
    /**
     * retourne le dernier numéro de livre créé.
     */
    public static int getDernierNum() {
        return dernierNum;
    }
    /**
     * retourne une chaîne de caractères qui décrit le livre.
     */
    @Override
    public String toString() {
        return titre+ ", " + auteur.getPrenom() + " " + auteur.getNom() + ", " + nombreDePages + "p.";
    }
    
    
    
}
