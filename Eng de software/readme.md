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
    
    ## Definindo as características básicas do pet: nome e tipo
    private String nome;  
    private String tipo;
    
    ## Construtor para inicializar o nome e o tipo do pet. 
    ## Usamos 'this' para deixar claro que estamos referenciando os atributos da classe.
    public Pet(String nome, String tipo) {  
        this.nome = nome;
        this.tipo = tipo;
    }
    
    ## Método para obter o nome do pet.
    public String getNome() {
        return nome;
    }
    
    ## Método para alterar o nome do pet.
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    ## Método para obter o tipo do pet.
    public String getTipo() {
        return tipo;
    }
    
    ## Método para alterar o tipo do pet.
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

    ## Criando uma lista pra poder aguardar todos os pets cadastrados no PetShop.
    private List<Pet> pets = new LinkedList<Pet>();
    
    ## Método para cadastrar um novo pet no PetShop.
    public void cadastrarPet(Pet pet) {
        pets.add(pet); // Adiciona o pet à lista dos pets.
    }
    
    ## Método para buscar pets pelo nome.
    ## Se tiver mais de um pet com o mesmo nome, todos vão ser retornados.
    public List<Pet> buscarPetPorNome(String nome){
        List<Pet> petsEncontrados = new LinkedList<Pet>(); ## Lista para guardar os pets encontrados.
        for(Pet pet : pets) {  ## anda pela lista de pets cadastrados.
            if(pet.getNome().equals(nome)) ## Verifica se o nome do pet corresponde ao nome buscado.
                petsEncontrados.add(pet); ## Adiciona o pet encontrado à lista de pets encontrados.
        }
        return petsEncontrados; ## Retorna a lista de pets encontrados.
    }
    
    ## Método para obter a lista completa de todos os pets cadastrados no PetShop.
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
        
        ## Crio um novo petshop, onde vou cadastrar os pets para os testes.
        PetShop petShop = new PetShop(); 
        
        ## Crio e nomeio dois novos pets: um gatinho chamado Hello Kitty e um cachorrinho chamado Melody.
        Pet helloKitty = new Pet("Hello Kitty", "Gatinho"); 
        Pet melody = new Pet("Melody", "Cachorrinho");
        
        ## Cadastro os pets no petshop.
        petShop.cadastrarPet(helloKitty);
        petShop.cadastrarPet(melody);
        
        ## Verifico se o número de pets cadastrados no petshop é 2.
        assertEquals(petShop.getPets().size(), 2);
        
        ## Busco o pet chamado Melody e verifico se o tipo dele é o mesmo que foi definido inicialmente (Cachorrinho).
        List<Pet> melodyPets = petShop.buscarPetPorNome("Melody");
        assertEquals(melodyPets.get(0).getTipo(), melody.getTipo());
    }
}
}

