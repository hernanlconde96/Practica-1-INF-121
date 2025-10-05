class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cant):
        self.stock -= cant
        return self.stock

    def reabastecer(self, cant):
        self.stock += cant
        return self.stock

    def __str__(self):
        return f"Producto [nombre={self.nombre}, precio={self.precio}, stock={self.stock}]"

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_precio(self):
        return self.precio

    def set_precio(self, precio):
        self.precio = precio

    def get_stock(self):
        return self.stock

    def set_stock(self, stock):
        self.stock = stock


p1 = Producto("guitarra", 500, 5)
print(p1)
p1.vender(3)
print(p1)
p1.reabastecer(15)
print(p1)
