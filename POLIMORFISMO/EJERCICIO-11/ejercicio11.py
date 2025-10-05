class Pasajero:
    def __init__(self, nombre, edad, genero, nroHabitacion, costoPasaje):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero
        self.nroHabitacion = nroHabitacion
        self.costoPasaje = costoPasaje


    def __pos__(self):  
        return f"pasajero: {self.nombre}, edad: {self.edad}, genero: {self.genero}, habitacion: {self.nroHabitacion}, costo: {self.costoPasaje} bs"


    def __neg__(self):
        return f"nombre: {self.nombre}"


class Crucero:
    def __init__(self, nombre, paisOrigen, paisDestino):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.pasajeros = []

    def agregar_pasajero(self, pasajero):
        self.pasajeros.append(pasajero)

    def __pos__(self):
        return f"crucero: {self.nombre}, origen: {self.paisOrigen}, destino: {self.paisDestino}, pasajeros: {len(self.pasajeros)}"

    def __neg__(self):
        return f"crucero: {self.nombre}"

    def __eq__(self, other):
        suma1 = sum(p.costoPasaje for p in self.pasajeros)
        suma2 = sum(p.costoPasaje for p in other.pasajeros)
        return f"Total en {self.nombre}: {suma1} Bs. | Total en {other.nombre}: {suma2} Bs."

    def __add__(self, other):
        if len(self.pasajeros) == len(other.pasajeros):
            return "crucero con misma cantidad de pasajeros"
        else:
            return "crucero con diferente cantidad de pasajeros"

    def __sub__(self, other):
        hombres = sum(1 for p in self.pasajeros if p.genero.lower() == "masculino")
        mujeres = sum(1 for p in self.pasajeros if p.genero.lower() == "femenino")
        return f"en el crucero {self.nombre} hay {hombres} hombres y {mujeres} mujeres"






c1 = Crucero("lago titicaca", "copacabana", "isla del sol")
c2 = Crucero("madidi explorer", "rurrenabaque", "parque madidi")
p1 = Pasajero("juan Choque", 30, "masculino", 101, 450)
p2 = Pasajero("maría Quispe", 27, "femenino", 102, 600)
p3 = Pasajero("luis Mamani", 40, "masculino", 103, 550)
p4 = Pasajero("ana Flores", 35, "femenino", 201, 700)
p5 = Pasajero("carlos Condori", 29, "masculino", 202, 500)


c1.agregar_pasajero(p1)
c1.agregar_pasajero(p2)
c1.agregar_pasajero(p3)

c2.agregar_pasajero(p4)
c2.agregar_pasajero(p5)


print(+p1)   
print(-p2)   

print(+c1)   
print(-c2)   

print(c1 == c2)  
print(c1 + c2)   
print(c1 - c2)   
