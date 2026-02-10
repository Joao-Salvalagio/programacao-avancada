package com.joaosalvalagio.__02.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CaminhaoModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String modelo;
    private Integer anofabricacao;
    private Integer kmatual;
    private Integer capacidadecarga;
    private Integer capacidadeeixo;

    public String registrarRota(Integer kmrecebido){
        if (kmrecebido>0){
            return "Km deverá ser maior que 0";
        }else{
            setKmatual(getKmatual()+kmrecebido);
            return "O Km atual é" +  getKmatual();
        }
    }
}
