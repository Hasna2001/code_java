public class Maison {
    String couleur;
    String ville;
    String pays;

    // Constructeur
    public Maison(String couleur, String ville, String pays) {
        this.couleur = couleur;
        this.ville = ville;
        this.pays = pays;
    }

    // Méthode principale (point d'entrée du programme)
    public static void main(String[] args) {
        // Création d'un objet Voiture
        Maison maMaison = new Maison("Blanche", "Dakar", "Sénégal");
        Maison maMaison1 = new Maison("Gris", "Matam", "Sénégal");

        // Affichage des attributs de la voiture
        System.out.println("Couleur: " + maMaison.couleur);
        System.out.println("Ville: " + maMaison.ville);
        System.out.println("Pays: " + maMaison.pays);

        System.out.println("Couleur: " + maMaison1.couleur);
        System.out.println("Ville: " + maMaison1.ville);
        System.out.println("Pays: " + maMaison1.pays);
    }

}

