import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestePetShop {

    @Test
    void test() {
        
        PetShop petShop = new PetShop();
        
        Pet helloKitty = new Pet("Hello Kitty", "Gatinho");
        Pet melody = new Pet("Melody", "Cachorrinho");
        
        petShop.cadastrarPet(helloKitty);
        petShop.cadastrarPet(melody);
        
        assertEquals(petShop.getPets().size(), 2);
        
        List<Pet> melodyPets = petShop.buscarPetPorNome("Melody");
        assertEquals(melodyPets.get(0).getTipo(), melody.getTipo());
    }
}
