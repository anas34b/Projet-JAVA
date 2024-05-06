
        BINOME : AITYOUNES ZAKI & DAOUI ANAS
( joint par mail une capture d'écran de la validité des test )

Projet 

Classe Personne

La classe Personne contient les attributs suivants :

    numeroPers (int) : le numéro de la personne
    nomPers (String) : le nom de la personne
    prenomPers (String) : le prénom de la personne
    anNaissance (int) : l'année de naissance de la personne
    dernierNumero (int) : la dernière valeur de numéro utilisée (variable statique)

La classe Personne contient également les méthodes suivantes :

    Personne(String nomPers, String prenomPers, int anNaissance) : constructeur qui prend en entrée le nom, le prénom et l'année de naissance d'une personne et incrémente la variable statique dernierNumero.
    getNumero() : retourne le numéro de la personne.
    setNumPers(int numeroPers) : permet de définir le numéro de la personne.
    getNom() : retourne le nom de la personne.
    setNomPers(String nomPers) : permet de définir le nom de la personne.
    getPrenom() : retourne le prénom de la personne.
    setPrenomPers(String prenomPers) : permet de définir le prénom de la personne.
    getAnNaissance() : retourne l'année de naissance de la personne.
    setAnNaissance(int anNaissance) : permet de définir l'année de naissance de la personne.
    getDernierNumero() : retourne la dernière valeur de numéro utilisée.
    toString() : retourne une chaîne de caractères avec les informations de la personne (nom, prénom, année de naissance, numéro)

    Class PersonneTest 

     La classe de test contient plusieurs méthodes de test qui utilisent JUnit pour tester différentes fonctionnalités de la classe Personne. Les méthodes de test incluent des tests pour les méthodes getNumero, getNom, getPrenom, getAnNaissance, getDernierNumero, setNumPers, setNomPers, setPrenomPers, setAnNaissance et toString. Chacune de ces méthodes crée une instance de la classe Personne, appelle la méthode correspondante sur cette instance et vérifie que le résultat est celui attendu en utilisant la méthode assertEquals de JUnit.

Classe bibliotheque :
La classe contient plusieurs méthodes:

    Le constructeur Bibliotheque() crée une nouvelle liste de livres.

    La méthode ajoutLivre(Livre livre) permet d'ajouter un livre à la liste en utilisant la méthode add() de la liste.

    La méthode afficher() affiche tous les livres de la liste en utilisant une boucle for et la méthode toString() des objets Livre.

    La méthode rechercherAuteur(String auteur) recherche et retourne un livre en utilisant l'auteur comme critère de recherche. Si le livre n'est pas trouvé, une exception "Livre non trouvé" est levée.

    La méthode rechercherTitre(String titre) recherche et retourne un livre en utilisant le titre comme critère de recherche. 
    Le constructeur qui crée une nouvelle liste de livres
    La méthode ajoutLivre() qui permet d'ajouter un livre à la liste en utilisant la méthode add() de la liste
    La méthode afficher() qui permet d'afficher tous les livres de la liste en utilisant une boucle for et la méthode toString() de la classe Livre
    La méthode rechercherAuteur() qui permet de rechercher un livre en fonction de son auteur en utilisant une boucle for-each et la méthode getAuteur() de la classe Livre. Si le livre n'est pas trouvé, une exception est levée
    La méthode rechercherTitre() qui permet de rechercher un livre en fonction de son titre en utilisant une boucle for et la méthode getTitre() de la classe Livre. Si le livre n'est pas trouvé, une exception est levée

Classe livre:

Elle possède des propriétés telles que le numéro du livre, le titre, le nombre de pages et l'auteur du livre. Elle contient également des méthodes pour accéder et modifier ces propriétés.

La classe possède un constructeur qui prend en paramètre le titre, le nombre de pages et l'auteur du livre, et qui initialise les propriétés du livre avec ces valeurs. Il y a aussi des méthodes get et set pour accéder et modifier les propriétés du livre.

Il y a une propriété statique dernierNum qui représente le dernier numéro de livre créé et une propriété statique cpt qui est utilisée pour générer le numéro de livre.

Il y a également une méthode toString qui retourne une chaîne de caractères qui décrit le livre.

Livre classe test: 

Les méthodes de test incluent:

    testGetNumLivre: qui vérifie que le numéro du livre est correctement initialisé
    testGetNumLivreTwoBooks: qui vérifie que le numéro du livre est incrémenté correctement lors de la création de plusieurs livres
    testGetTitre: qui vérifie que le titre du livre est correctement initialisé
    testGetNombreDePages: qui vérifie que le nombre de pages du livre est correctement initialisé
    testGetAuteur: qui vérifie que l'auteur du livre est correctement initialisé
    testSetTitre: qui vérifie que la méthode setTitre fonctionne correctement
    testSetAuteur: qui vérifie que la méthode setAuteur fonctionne correctement
    testSetNombreDePages: qui vérifie que la méthode setNombreDePages fonctionne correctement
    testToString: qui vérifie que la méthode toString renvoie la chaîne de caractères attendue.

Classe listePersonne :

fonctionnalité

Ajout d'une personne à la liste via la méthode ajouter(Personne p)
Vérification si une personne est déjà présente dans la liste en utilisant la méthode appartient(Personne p)
Vérification si une personne ayant un certain nom et prénom est déjà dans la liste en utilisant la méthode appartient(String nom, String prenom)
Si une personne est ajoutée à la liste alors qu'elle y est déjà présente, un message sera affiché indiquant que la personne existe déjà.
La classe Personne utilisée dans ce projet doit implémenter les méthodes getNom() et getPrenom() pour que les fonctionnalités de vérification de présence fonctionnent correctement.

Classe de test listePersonne


Le test "testAjouter" vérifie si la méthode "ajouter" fonctionne correctement en ajoutant une instance de "Personne" à la liste et en vérifiant si elle est présente dans la liste en utilisant la méthode "appartient".

Le test "testAppartientP" vérifie si la méthode "appartient" fonctionne correctement en utilisant des instances de "Personne" pour vérifier si elles appartiennent à la liste.

Le test "testAppartient" vérifie si la méthode "appartient" fonctionne correctement en utilisant des valeurs de nom et prénom pour vérifier si une personne avec ces valeurs appartient à la liste.