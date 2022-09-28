class persona:
        def __init__ (self, nombre, edad, telefono,):
            self.nombre = nombre
            self.edad = edad
            self.telefono = telefono


class cliente (persona):
        def __init__(self,credito):
            self.credito= credito


cliente1 = persona ( " vanesa", 33, 1127223944)
print (cliente1.nombre)
print (cliente1.edad)
print (cliente1.telefono)
cliente2 = cliente (10000)
print (cliente2.credito)

class trabajador (persona):
        def __init__ (self, salario):
            self.salario = salario


Cliente3 = trabajador (15000)
print (Cliente3.salario)

