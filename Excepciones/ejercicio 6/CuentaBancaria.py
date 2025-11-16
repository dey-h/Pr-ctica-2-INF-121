class FondosInsuficientesException(Exception):
    pass
class CuentaBancaria:
    def __init__(self, numero, titular, saldo):
        self.numero = numero
        self.titular = titular
        self.saldo = saldo

    def depositar(self, monto):
        if monto <= 0:
            raise ValueError("El monto debe ser positivo.")
        self.saldo += monto

    def retirar(self, monto):
        if monto > self.saldo:
            raise FondosInsuficientesException("Fondos insuficientes.")
        self.saldo -= monto

    def mostrar_info(self):
        print(f"Número: {self.numero}, Titular: {self.titular}, Saldo: {self.saldo}")

cuenta = CuentaBancaria("12345", "Juan Pérez", 1000)

try:
    cuenta.depositar(500)
    cuenta.depositar(-20)
except ValueError as e:
    print("Error en depósito:", e)

try:
    cuenta.retirar(2000)
except FondosInsuficientesException as e:
    print("Error en retiro:", e)
