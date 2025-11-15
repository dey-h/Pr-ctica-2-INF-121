class Doctor:
    def __init__(self, nombre, especialidad):
        self.nombre = nombre
        self.especialidad = especialidad

    def __str__(self):
        return f"{self.nombre} ({self.especialidad})"

class Hospital:
    def __init__(self, nombre):
        self.nombre = nombre
        self.doctores = []

    def agregar_doctor(self, doctor):
        self.doctores.append(doctor)

    def mostrar_doctores(self):
        print(f"Doctores en {self.nombre}:")
        for doctor in self.doctores:
            print(f"- {doctor}")
        print()

d1 = Doctor("Ana Pérez", "Cardiología")
d2 = Doctor("Luis Gómez", "Neurología")

h1 = Hospital("Hospital Central")
h2 = Hospital("Hospital Norte")

h1.agregar_doctor(d1)
h1.agregar_doctor(d2)
h2.agregar_doctor(d1)  

h1.mostrar_doctores()
h2.mostrar_doctores()
