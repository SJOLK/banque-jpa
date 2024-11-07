package fr.digi.m062024.bo;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("VIREMENT")
public class Virement extends Operation {
    @Column(name = "beneficiaire")
    private String beneficiaire;

    /**
     * Getter
     *
     * @return beneficiaire
     */
    public String getBeneficiaire() {
        return beneficiaire;
    }


    /**
     * Setter
     *
     * @param beneficiaire beneficiaire
     */
    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public Virement(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
