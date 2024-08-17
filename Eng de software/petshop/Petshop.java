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
