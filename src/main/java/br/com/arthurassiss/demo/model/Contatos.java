package br.com.arthurassiss.demo.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Contatos {

    private int id;
    private String nome;
    
}
