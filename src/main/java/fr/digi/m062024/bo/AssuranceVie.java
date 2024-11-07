package fr.digi.m062024.bo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("ASSURANCE_VIE")
public class AssuranceVie extends Compte {
    @Column(name = "date_fin")
    private LocalDate dateFin;

    @Column(name = "taux")
    private double taux;

    /**
     * Getter
     *
     * @return dateFin
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * Setter
     *
     * @param dateFin dateFin
     */
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Getter
     *
     * @return taux
     */
    public double getTaux() {
        return taux;
    }

    /**
     * Setter
     *
     * @param taux taux
     */
    public void setTaux(double taux) {
        this.taux = taux;
    }

    public AssuranceVie(LocalDate dateFin, double taux) {
        this.dateFin = dateFin;
        this.taux = taux;
    }
}
