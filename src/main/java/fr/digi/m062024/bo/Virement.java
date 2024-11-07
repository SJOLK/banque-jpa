package fr.digi.m062024.bo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("VIREMENT")
public class Virement extends Operation {
    @Column(name = "beneficiaire")
    private String beneficiaire;

    public Virement(){
    }
    public Virement(LocalDateTime date, double montant, String motif, Compte compte,String beneficiaire){
        super(date, montant, motif, compte);
        this.beneficiaire = beneficiaire;
    }

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
