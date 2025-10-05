class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print("El animal se desplaza de alguna manera")


class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina majestuosamente por la selva")


class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada velozmente por la Antartida")


class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta alegremente por africa")



animales = [
    Leon("alex", 5),
    Pinguino("happy", 3),
    Canguro("jack", 4)
    ]

for animal in animales:
    animal.desplazarse()

