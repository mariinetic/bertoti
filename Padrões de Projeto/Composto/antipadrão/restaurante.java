package antipadrão;

class PratoComposto(Menu):
    def __init__(self, nome, preco):
        super().__init__(nome)
        self.preco = preco

    def mostrar(self):
        print(f"Prato composto: {self.nome} - R$ {self.preco:.2f}")
        for item in self.itens:
            item.mostrar()

class Restaurante:
    def __init__(self, nome):
        self.nome = nome

    def mostrar_exemplo_antipadrao(self):
        print(f"\n🍴 Restaurante: {self.nome} (Exemplo Anti-Padrão)")

        pizza = PratoComposto("Pizza Gigante", 60)
        pizza.adicionar(Prato("Mini Pizza", 15))  

        pizza.mostrar()

restaurante = Restaurante("FastFood X")
restaurante.mostrar_exemplo_antipadrao()
