package modele;

public class User {
    private int id;
    private String nom;
    private String motDePasse;
    private String typeAcces;

    public User(int id, String nom, String motDePasse, String typeAcces) {
        this.id = id;
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.typeAcces = typeAcces;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTypeAcces() {
        return typeAcces;
    }

    public void setTypeAcces(String typeAcces) {
        this.typeAcces = typeAcces;
    }
}
