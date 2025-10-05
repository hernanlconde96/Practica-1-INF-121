class Videojuego:
    def __init__(self, nombre=None, plataforma=None, cantidad_jugadores=None):
        if nombre is None and plataforma is None and cantidad_jugadores is None:
            self.nombre = "sin nombre"
            self.plataforma = "pc"
            self.cantidad_jugadores = 1
        elif plataforma is None and cantidad_jugadores is None:
            self.nombre = nombre
            self.plataforma = "multiplataforma"
            self.cantidad_jugadores = 1
        else:
            self.nombre = nombre
            self.plataforma = plataforma
            self.cantidad_jugadores = cantidad_jugadores
    
    def agregar_jugadores(self, cantidad=None):
        if cantidad is None:
            self.cantidad_jugadores += 1
            print(f"se agrego 1 jugador. total: {self.cantidad_jugadores}")
        else:
            self.cantidad_jugadores += cantidad
            print(f"se agregaron {cantidad} jugadores. total: {self.cantidad_jugadores}")
    
    def mostrar_info(self):
        print(f"juego: {self.nombre} | plataforma: {self.plataforma} | jugadores: {self.cantidad_jugadores}")


print("****videojuegos creados*******")
juego1 = Videojuego("mario kart", "switch", 4)
juego2 = Videojuego("fifa 2024")

juego1.mostrar_info()
juego2.mostrar_info()

print()
print("******agregando jugadores*********")

juego1.agregar_jugadores()  
juego2.agregar_jugadores(3)  

print()
print("info actualizada")
juego1.mostrar_info()
juego2.mostrar_info()