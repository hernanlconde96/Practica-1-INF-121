class MP4:
    def __init__(self, marca, capacidadGb):
        self.marca = marca
        self.capacidadGb = capacidadGb * 1024  # convertir a mb
        self.canciones = []
        self.videos = []

    def espacio_usado(self):
        total_canciones = sum(c["peso"] / 1024 for c in self.canciones)
        total_videos = sum(v["peso"] for v in self.videos)
        return total_canciones + total_videos

    def espacio_disponible(self):
        return self.capacidadGb - self.espacio_usado()

    def borrar_cancion(self, criterio, valor):
        if criterio == "nombre":
            self.canciones = [c for c in self.canciones if c["nombre"] != valor]
        elif criterio == "artista":
            self.canciones = [c for c in self.canciones if c["artista"] != valor]
        elif criterio == "peso":
            self.canciones = [c for c in self.canciones if c["peso"] != valor]

    def __add__(self, cancion):
        if any(c["nombre"] == cancion["nombre"] for c in self.canciones):
            return "la cancion ya esta en el mp4"
        if self.espacio_disponible() >= cancion["peso"] / 1024:
            self.canciones.append(cancion)
            return f"cancion '{cancion['nombre']}' añadida"
        else:
            return "no hay espacio suficiente para la cancion"

    def __sub__(self, video):
        if any(v["nombre"] == video["nombre"] for v in self.videos):
            return "el video ya esta en el mp4"
        if self.espacio_disponible() >= video["peso"]:
            self.videos.append(video)
            return f"video '{video['nombre']}' añadido"
        else:
            return "no hay espacio suficiente para el video"

    def __str__(self):
        return (f"mp4 {self.marca}\n"
                f"capacidad total: {self.capacidadGb} mb\n"
                f"espacio usado: {self.espacio_usado():.2f} mb\n"
                f"espacio disponible: {self.espacio_disponible():.2f} mb\n"
                f"canciones: {[c['nombre'] for c in self.canciones]}\n"
                f"videos: {[v['nombre'] for v in self.videos]}")


mp4 = MP4("sony", 2)

c1 = {"nombre": "back to black", "artista": "amy winehouse", "peso": 100}
c2 = {"nombre": "lost on you", "artista": "lp", "peso": 150}

v1 = {"nombre": "heathens", "artista": "twenty one pilots", "peso": 50}
v2 = {"nombre": "harmonica andromeda", "artista": "kshmr", "peso": 70}
v3 = {"nombre": "without me", "artista": "halsey", "peso": 30}

print(mp4 + c1)
print(mp4 + c2)

print(mp4 - v1)
print(mp4 - v2)
print(mp4 - v3)

mp4.borrar_cancion("nombre", "lost on you")

print(mp4)
