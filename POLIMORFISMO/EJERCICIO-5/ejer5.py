class Celular:
    def __init__(self,nroTel, duenio, espacio, ram ,nroApp):
        self._nroTel = nroTel
        self._duenio = duenio
        self._espacio = espacio
        self._ram = ram
        self._nroApp = nroApp
    def __pos__(self):
        self._nroApp += 10;
        return self;
    
    
    def __pos__(self):
        self._nroApp += 10
        return self
        
        
    def __neg__(self):
        self._espacio -= 5
        return self
    
    def mostrar(self):
        print(f"numero de telefono: {self._nroTel}")
        print(f"dueño del celular:{self._duenio}")
        print(f"espacio: {self._espacio} GB")
        print(f"memoria ram: {self._ram} GB")
        print(f"numero de apps: {self._nroApp}")
        print("*******************************")   
        
        

    
cel1 = Celular("72573578","fernando",128,8,15)
print("********celular 1********")
cel1.mostrar()
print("********celular con mas apps********")
+cel1
cel1.mostrar()
print("********celular con menos espacio********")
-cel1
cel1.mostrar()