import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListePersonnesTest {
   
	public ListePersonnesTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	@Test
	public void testAjouter() {
		Personne Turing = new Personne("Turing", "Alan", 1912);
		ListePersonnes liste = new ListePersonnes();
		liste.ajouter(Turing);
		assertEquals(true, liste.appartient(Turing));
	}
	
	@Test
	public void testAppartientP() {
		Personne alan = new Personne("Turing", "Alan", 1912);
		Personne Marc = new Personne("Marc", "Jim", 2000);
		ListePersonnes liste = new ListePersonnes();
		liste.ajouter(alan);
		assertTrue(liste.appartient(alan));
		assertFalse(liste.appartient(Marc));
	}

    @Test
	public void testAppartient() {
		Personne alan = new Personne("Turing", "Alan", 1912);
		Personne Marc = new Personne("Marc", "Jim", 2000);
		ListePersonnes liste = new ListePersonnes();
		liste.ajouter(alan);
		liste.ajouter(Marc);
		assertTrue(liste.appartient("Turing", "Alan"));
		assertFalse(liste.appartient("Leo", "Thomas"));
	}
}
