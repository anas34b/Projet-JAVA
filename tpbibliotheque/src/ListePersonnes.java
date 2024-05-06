import java.util.ArrayList;
public class ListePersonnes {
    
    private ArrayList<Personne> liste;

   
    public ListePersonnes() {
        liste = new ArrayList<Personne>();
    }

    /**
     * ajoute une personne à la liste si elle n'y est pas déjà présente
     * @param p
     */
    public void ajouter(Personne p) {
        if(!(appartient(p)))
            liste.add(p);
        else
            System.out.println("la personne : "+p.getNom()+"existe déja");
    }



    /**
     * vérifie si une personne est déjà dans la liste
     * @param p
     * @return
     */
    public boolean appartient(Personne p) {
        return liste.contains(p);
    }

    /**
     * vérifie si une personne ayant un certain nom et prénom est déjà dans la liste.
     * @param nom
     * @param prenom
     * @return
     */
    public boolean appartient(String nom, String prenom) {
        for (Personne p : liste) {
            if (p.getNom().equals(nom) && p.getPrenom().equals(prenom)) {
                return true;
            }
        }
        return false;
    }
}
