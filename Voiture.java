public class Voiture {
    String  couleur;
    String  marque;
    String   matricule;


    // Constructeur
    public Voiture(String couleur, String marque, String matricule) {
        this.couleur = couleur;
        this.marque = marque;
        this.matricule = matricule;
    
    }

 // Méthode principale (point d'entrée du programme)
 public static void main(String[] args) {
    // Création d'un objet Voiture
    Voiture maVoiture = new Voiture("Rouge", "Toyota", "AA-123-BB");
    // Voiture ifVoiture = new Voiture("Vert", "NISSAN", "AA-897-BB");

     // Affichage des attributs de la voiture
     System.out.println("Couleur: " + maVoiture.couleur);
     System.out.println("Marque: " + maVoiture.marque);
     System.out.println("Matricule: " + maVoiture.matricule);

 }

 }