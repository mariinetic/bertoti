package com.thehecklers.sburrestdemo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bolsa {
    @Id
    private String id;

    private String nome;

    @Column(name = "imagem_url")
    private String imagemUrl;

    @Column(name = "preco")
    private String preco;

    public Bolsa() {}

    public Bolsa(String id, String nome, String imagemUrl, String preco) {
        this.id = id;
        this.nome = nome;
        this.imagemUrl = imagemUrl;
        this.preco = preco;
    }

    public Bolsa(String nome, String imagemUrl, String preco) {
        this(UUID.randomUUID().toString(), nome, imagemUrl, preco);
    }

    // Getters e setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getImagemUrl() { return imagemUrl; }
    public void setImagemUrl(String imagemUrl) { this.imagemUrl = imagemUrl; }

    public String getPreco() { return preco; }
    public void setPreco(String preco) { this.preco = preco; }
}
