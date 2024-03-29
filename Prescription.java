import java.util.TreeSet;

public class Prescription extends Medicament{
    private String nomMedicament;
    private int doseTraitement;
    private int repetition;
    private TreeSet<Medicament> commande;

    public Prescription(){
    }

    public Prescription(String nomMedicament, int doseTraitement, int repetition) {
        this.nomMedicament = nomMedicament;
        this.doseTraitement = doseTraitement;
        this.repetition = repetition;
    }

    public Prescription(String nom, Date date, String nomMedicament, int doseTraitement, int repetition, TreeSet<Medicament> commande) {
        this.nomMedicament = nomMedicament;
        this.doseTraitement = doseTraitement;
        this.repetition = repetition;
        this.commande = commande;
    }

    public TreeSet<Medicament> getCommande() {
        return commande;
    }

    public void setCommande(TreeSet<Medicament> commande) {
        this.commande = commande;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }
    public int getDoseTraitement() {
        return doseTraitement;
    }

    public int getRepetition() {
        return repetition;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }
}
