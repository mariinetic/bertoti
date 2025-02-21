package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
public class BagApplication {
    public static void main(String[] args) {
        SpringApplication.run(BagApplication.class, args);
    }
}

@RestController
@RequestMapping("/bolsas")
class BolsaController {
    private final Map<String, Bolsa> bolsas = new ConcurrentHashMap<>();

    public BolsaController() {
        List.of("Bolsa de Couro", "Bolsa de Tecido", "Bolsa Esportiva", "Bolsa de Viagem")
            .forEach(nome -> {
                Bolsa bolsa = new Bolsa(nome);
                bolsas.put(bolsa.getId(), bolsa);
            });
    }

    @GetMapping
    public Collection<Bolsa> getBolsas() {
        return bolsas.values();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bolsa> getBolsaById(@PathVariable String id) {
        return bolsas.containsKey(id) ? 
            ResponseEntity.ok(bolsas.get(id)) :
            ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Bolsa> postBolsa(@RequestBody Bolsa bolsa) {
        bolsas.put(bolsa.getId(), bolsa);
        return ResponseEntity.status(HttpStatus.CREATED).body(bolsa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bolsa> putBolsa(@PathVariable String id, @RequestBody Bolsa bolsa) {
        if (!bolsas.containsKey(id)) {
            bolsa.setId(id);
            bolsas.put(id, bolsa);
            return ResponseEntity.status(HttpStatus.CREATED).body(bolsa);
        }
        bolsa.setId(id);
        bolsas.put(id, bolsa);
        return ResponseEntity.ok(bolsa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBolsa(@PathVariable String id) {
        return bolsas.remove(id) != null ?
            ResponseEntity.noContent().build() :
            ResponseEntity.notFound().build();
    }
}

class Bolsa {
    private String id;
    private String nome;

    public Bolsa(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Bolsa(String nome) {
        this(UUID.randomUUID().toString(), nome);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
