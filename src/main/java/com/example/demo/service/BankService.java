package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    /**
     * RG - 11315
     *
     * @param amount : le montant à prélever
     * @return ServiceResponseDTO.class
     */
    public ServiceResponseDTO<Float> debit(float amount) {
        // 2300 €
        // Cas : erreur 789
        if (amount > 2300) {
            return ServiceResponseDTO.buildResponse("789", "Solde insuffisant");
        }

        // Cas : succès 207
        return ServiceResponseDTO.buildResponseWithData("207", "Prélèvement effectué avec succès", (2300 - amount));
    }
}
