class Persona:
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def mostrar(self):
        print(f"nombre: {self.nombre} {self.apellido}")
        print(f"CI: {self.ci}")


class Cliente(Persona):
    def __init__(self, nombre, apellido, ci, nro_compra, id_cliente):
        super().__init__(nombre, apellido, ci)
        self.nro_compra = nro_compra
        self.id_cliente = id_cliente

    def mostrar(self):
        super().mostrar()
        print(f"id Cliente: {self.id_cliente}")
        print(f"numero de compra: {self.nro_compra}")


class Jefe(Persona):
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar(self):
        super().mostrar()
        print(f"sucursal: {self.sucursal}")
        print(f"tipo: {self.tipo}")



p1 = Persona("luis", "fernandez", "98445653")
print("**********persona********")
p1.mostrar()
print()

c1 = Cliente("ana", "gomez", "4323890", "C123", "A001")
print("********datos de cliente*********")
c1.mostrar()
print()

j1 = Jefe("carlos", "perez", "1234567", "sucursal central", "general")
print("********datos de jefe*********")
j1.mostrar()


