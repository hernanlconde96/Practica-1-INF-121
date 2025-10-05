class Bus:
    def __init__(self, marca, modelo, capacidad):
        self.marca = marca
        self.modelo = modelo
        self.capacidad = capacidad
        self.pasajeros = 0

    def subir_pasajeros(self, cantidad):
        if self.pasajeros + cantidad <= self.capacidad:
            self.pasajeros += cantidad
        else:
            print("Ya no hay asientos disponibles")

    def cobrar_pasaje(self):
        costo = 1.50
        return self.pasajeros * costo

    def asientos_disponibles(self):
        return self.capacidad - self.pasajeros

    def __str__(self):
        return f"Bus marca={self.marca}, modelo={self.modelo}, capacidad={self.capacidad}, pasajeros={self.pasajeros}"




b1 = Bus("King Long", "Pumakatari", 30)

p = int(input("Ingrese número de pasajeros: "))
b1.subir_pasajeros(p)

print(b1)
print(f"Total pasajes: {b1.cobrar_pasaje()} Bs")
print(f"Asientos libres: {b1.asientos_disponibles()}")

nuevos = int(input("Ingrese nuevos pasajeros: "))
b1.subir_pasajeros(nuevos)

print(b1)
print(f"Total pasajes: {b1.cobrar_pasaje()} Bs")
print(f"Asientos libres: {b1.asientos_disponibles()}")


