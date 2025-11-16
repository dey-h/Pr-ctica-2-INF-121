class Empleado:
    def __init__(self, nombre, puesto, salario):
        self.nombre = nombre
        self.puesto = puesto
        self.salario = salario

    def __str__(self):
        return f"{self.nombre} - {self.puesto} - ${self.salario}"
class Empresa:
    def __init__(self, nombre):
        self.nombre = nombre
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def mostrar_empresa(self):
        print(f"Empresa: {self.nombre}")
        print("Empleados:")
        for e in self.empleados:
            print(f"- {e}")
        print()

    def buscar_empleado(self, nombre):
        for e in self.empleados:
            if e.nombre.lower() == nombre.lower():
                return e
        return None

    def eliminar_empleado(self, nombre):
        inicial = len(self.empleados)
        self.empleados = [e for e in self.empleados if e.nombre.lower() != nombre.lower()]
        return len(self.empleados) < inicial

    def promedio_salarial(self):
        if not self.empleados:
            return 0
        return sum(e.salario for e in self.empleados) / len(self.empleados)

    def empleados_salario_mayor(self, valor):
        print(f"Empleados con salario mayor a ${valor}:")
        for e in self.empleados:
            if e.salario > valor:
                print(f"- {e}")
        print()

empresa = Empresa("Tech Solutions")

empresa.agregar_empleado(Empleado("Ana", "Ingeniera", 3000))
empresa.agregar_empleado(Empleado("Luis", "Analista", 2500))
empresa.agregar_empleado(Empleado("Marta", "Gerente", 4000))

empresa.mostrar_empresa()
e = empresa.buscar_empleado("Ana")
if e:
    print("Empleado encontrado:", e)
empresa.eliminar_empleado("Luis")

empresa.mostrar_empresa()
print("Promedio salarial:", empresa.promedio_salarial())
empresa.empleados_salario_mayor(2800)
