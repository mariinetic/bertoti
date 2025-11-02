package padrão;
import java.util.ArrayList;
import java.util.List;

// Interface for menu items
interface ItemCardapio {
    void mostrar();
}

// Concrete class for dishes
class Prato implements ItemCardapio {
    private String nome;
    private double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void mostrar() {
        System.out.printf("Prato: %s - R$ %.2f%n", nome, preco);
    }
}

// Composite class for menus
class Menu implements ItemCardapio {
    private String nome;
    private List<ItemCardapio> itens = new ArrayList<>();

    public Menu(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemCardapio item) {
        itens.add(item);
    }

    @Override
    public void mostrar() {
        System.out.println("\n--- " + nome + " ---");
        for (ItemCardapio item : itens) {
            item.mostrar();
        }
    }
}

// Restaurant class
class Restaurante {
    private String nome;
    private Menu menuPrincipal = new Menu("Cardápio Principal");

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(ItemCardapio item) {
        menuPrincipal.adicionar(item);
    }

    public void mostrarCardapio() {
        System.out.println("\n🍴 Restaurante: " + nome);
        menuPrincipal.mostrar();
    }
}

// Main method to run the program
public class restaurante {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("La Trattoria");

        Menu menuMassas = new Menu("Massas");
        menuMassas.adicionar(new Prato("Lasanha", 35));
        menuMassas.adicionar(new Prato("Pizza", 40));

        Menu menuBebidas = new Menu("Bebidas");
        menuBebidas.adicionar(new Prato("Suco de Laranja", 10));
        menuBebidas.adicionar(new Prato("Água", 5));

        restaurante.adicionarItem(menuMassas);
        restaurante.adicionarItem(menuBebidas);

        restaurante.mostrarCardapio();
    }
}
