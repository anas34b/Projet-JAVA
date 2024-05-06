import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class BibliothequeTest {
    public Personne auteur1;
    public Personne auteur2;
    public Livre livre1;
    public Livre livre2;
    public Bibliotheque bibliotheque;


    public BibliothequeTest() { 
    } 
    
    /**
     * on creer nos objets pour eviter les repititions dans le code
     */
    @BeforeClass 
    public static void setUpClass() { 
        Bibliotheque bibliotheque = new Bibliotheque();
        Personne auteur1 = new Personne("auteur1","auteur1",1985);
        Personne auteur2 = new Personne("auteur2","auteur2",1999);
        Livre livre1 = new Livre("Titre Livre 1", 150,auteur1);
        Livre livre2 = new Livre("Titre Livre 2",200,auteur2);
        bibliotheque.ajoutLivre(livre1);
        bibliotheque.ajoutLivre(livre2);
    } 
  
    @AfterClass 
    public static void tearDownClass() { 
    } 
  
    @Before 
    public void setUp() { 
    } 
  
    /**
     * 
     */
    @After 
    public void tearDown() { 
    } 


    /**
     * teste de l'ajout de livre
     */
    @Test
	public void testAjout() {
		try {
            assertEquals(livre1, bibliotheque.rechercherTitre("livre1"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            assertEquals(livre2, bibliotheque.rechercherTitre("livre2"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}

    /**
     * on peut pas tester l'affichage car c'est une procedure qui ne retourne rien
     */
    @Ignore
    public void testAfficher() {
        
    }

    /**
     * teste de la recherche par auteur
     */
    @Test
    public void testRechercherParAuteur()  {
        Livre livreTrouve;
        try {
            livreTrouve = bibliotheque.rechercherAuteur("auteur1");
            assertEquals(livre1, livreTrouve);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    /**
     * teste de la recherche par titre
     */
    @Test
    public void testRechercherParTitre() {
        Livre livreTrouve;
        try {
            livreTrouve = bibliotheque.rechercherTitre(livre2.getTitre());
            assertEquals(livre2, livreTrouve);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
