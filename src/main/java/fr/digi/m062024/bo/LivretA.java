package fr.digi.m062024.bo;

import jakarta.persistence.*;


@Entity
@DiscriminatorValue("LIVRET_A")
public class LivretA extends Compte {
    @Column(name = "taux")
    private double taux;

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

    public LivretA(double taux) {
        this.taux = taux;
    }
}
