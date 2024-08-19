### 09/08 - 1) Atividade Trecho do livro: Software Engenering at Google

" We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. "

Comentário sobre:

Este trecho destaca três diferença entre programação e engenharia de software e ao longo dele percebemos que enquanto a programação foca já no código,
a engenharia de software vem para considerar decisões complexas que impactam o software trazendo também pensamentos em relação a organização, com isso
percebo que as responsabilidades dos engenheiros de software são mais ampliadas.

### 12/08 - 2) Atividade Trade Off

Cite 3 exemplos de trade off que foram ou não citados anteriormente na aula 

1. Tempo vs. Dinheiro: Você pode gastar mais dinheiro para economizar tempo, ou gastar mais tempo para economizar dinheiro.

2. Qualidade vs. Velocidade: Você pode fazer algo rapidamente, mas a qualidade pode ser menor. Ou pode fazer com alta qualidade, mas vai demorar mais.

3. Privacidade vs. Conveniência: Você pode compartilhar mais informações pessoais para ter um serviço mais conveniente, ou manter suas informações privadas, mas com menos conveniência.


### 19/08 - 3) Atividade Java 
### Classe Pet
```bash
public class Pet {
    
    private String nome;  ### Aqui crio tipo e nome
    private String tipo;
    
    public Pet(String nome, String tipo) {  ### Usando o this eu referencio as variaveis
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
```
### Classe PetShop
```bash
import java.util.List;
import java.util.LinkedList;

public class PetShop {

    private List<Pet> pets = new LinkedList<Pet>();
    
    public void cadastrarPet(Pet pet) {
        pets.add(pet);
    }
    
    public List<Pet> buscarPetPorNome(String nome){
        List<Pet> petsEncontrados = new LinkedList<Pet>();
        for(Pet pet : pets) {
            if(pet.getNome().equals(nome)) 
                petsEncontrados.add(pet);
        }
        return petsEncontrados;
    }
    
    public List<Pet> getPets(){
        return pets;
    }
}
```
### Classe Teste
```bash
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestePetShop {

    @Test
    void test() {
        
        PetShop petShop = new PetShop(); ### Crio um novo petshop
        
        Pet helloKitty = new Pet("Hello Kitty", "Gatinho"); ### Crio e nomeio dois novos pets
        Pet melody = new Pet("Melody", "Cachorrinho");
        
        petShop.cadastrarPet(helloKitty);
        petShop.cadastrarPet(melody);
        
        assertEquals(petShop.getPets().size(), 2);
        
        List<Pet> melodyPets = petShop.buscarPetPorNome("Melody");
        assertEquals(melodyPets.get(0).getTipo(), melody.getTipo());
    }
}

