/**
 * Classe Personne qui représente une personne avec les informations numéro, nom, prénom et année de naissance.
 */ 
public class Personne{
    //Attributs de la classe
    private  int numeroPers;
    private String nomPers;
    private String prenomPers;
    private int anNaissance;
    private static int dernierNumero;    


     
    /**
     * Constructeur qui prend en entrée le nom, le prénom et l'année de naissance d'une personne.
     * Il incrémente également la variable statique dernierNumero.
     * @param nomPers
     * @param prenomPers
     * @param anNaissance
     */
    public Personne(String nomPers, String prenomPers, int anNaissance) {
        this.nomPers = nomPers;
        this.prenomPers = prenomPers;
        this.anNaissance = anNaissance;
        dernierNumero=+1;
    }

    /**
     * @return numeroPers
     * Méthode qui retourne le numéro de la personne.
     */
    public int getNumero() {
        return numeroPers;
    }
    /**
     * Méthode qui permet de définir le numéro de la personne
     */
    public void setNumPers(int numeroPers){
        this.numeroPers=numeroPers;
    }
    /**
     * @return nomPers
     */
    public String getNom() {
        return nomPers;
    }

    /**
     * Méthode qui permet de définir le nom de la personne
     * @param nomPers
     */
    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }
    /**
     * @return prenomPers
     */
    public String getPrenom() {
        return prenomPers;
    }
    /**
     * @param prenomPers
     */
    public void setPrenomPers(String prenomPers) {
        this.prenomPers = prenomPers;
    }
    /**
     * @return anNaissance
     */
    public int getAnNaissance() {
        return anNaissance;
    }
    /**
     * @param anNaissance
     */
    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }
    /**
     * @return dernierNumero
     */
    public int getDernierNumero() {
        return dernierNumero;
    }
  
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return nomPers + ", "  + prenomPers
                + ", " + anNaissance + ", " + dernierNumero ;
    }
    
}