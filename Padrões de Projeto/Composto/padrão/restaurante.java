package padrão;

class ItemCardapio(ABC):
    @abstractmethod
    def mostrar(self):
        pass

class Prato(ItemCardapio):
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def mostrar(self):
        print(f"Prato: {self.nome} - R$ {self.preco:.2f}")

class Menu(ItemCardapio):
    def __init__(self, nome):
        self.nome = nome
        self.itens = []

    def adicionar(self, item: ItemCardapio):
        self.itens.append(item)

    def mostrar(self):
        print(f"\n--- {self.nome} ---")
        for item in self.itens:
            item.mostrar()

class Restaurante:
    def __init__(self, nome):
        self.nome = nome
        self.menu_principal = Menu("Cardápio Principal")

    def adicionar_item(self, item: ItemCardapio):
        self.menu_principal.adicionar(item)

    def mostrar_cardapio(self):
        print(f"\n🍴 Restaurante: {self.nome}")
        self.menu_principal.mostrar()

restaurante = Restaurante("La Trattoria")

menu_massas = Menu("Massas")
menu_massas.adicionar(Prato("Lasanha", 35))
menu_massas.adicionar(Prato("Pizza", 40))

menu_bebidas = Menu("Bebidas")
menu_bebidas.adicionar(Prato("Suco de Laranja", 10))
menu_bebidas.adicionar(Prato("Água", 5))

restaurante.adicionar_item(menu_massas)
restaurante.adicionar_item(menu_bebidas)

restaurante.mostrar_cardapio()
