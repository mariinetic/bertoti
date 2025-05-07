package com.thehecklers.sburrestdemo;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bolsas")
public class BolsaController {

    private final BolsaRepository bolsaRepository;

    @Autowired
    public BolsaController(BolsaRepository bolsaRepository) {
        this.bolsaRepository = bolsaRepository;
    }

    @GetMapping
    public Collection<Bolsa> getBolsas() {
        return bolsaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bolsa> getBolsaById(@PathVariable String id) {
        Optional<Bolsa> bolsa = bolsaRepository.findById(id);
        return bolsa.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Bolsa> postBolsa(@RequestBody Bolsa bolsa) {
        if (bolsa.getId() == null || bolsa.getId().isEmpty()) {
            bolsa.setId(UUID.randomUUID().toString());
        }
        Bolsa savedBolsa = bolsaRepository.save(bolsa);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBolsa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bolsa> putBolsa(@PathVariable String id, @RequestBody Bolsa bolsa) {
        if (!bolsaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        bolsa.setId(id);
        Bolsa updatedBolsa = bolsaRepository.save(bolsa);
        return ResponseEntity.ok(updatedBolsa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBolsa(@PathVariable String id) {
        if (!bolsaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        bolsaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
