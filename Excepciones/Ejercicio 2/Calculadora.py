class NumeroInvalidoException(Exception):
    pass

class Calculadora:

    @staticmethod
    def sumar(a, b):
        return a + b

    @staticmethod
    def restar(a, b):
        return a - b

    @staticmethod
    def multiplicar(a, b):
        return a * b

    @staticmethod
    def dividir(a, b):
        if b == 0:
            raise ZeroDivisionError("No se puede dividir entre cero.")
        return a / b

    @staticmethod
    def convertir_a_entero(valor):
        try:
            return int(valor)
        except ValueError:
            raise NumeroInvalidoException(f"'{valor}' no es un número válido.")
def main():
    try:
        num1 = Calculadora.convertir_a_entero("50")
        print("Conversión correcta:", num1)
    except NumeroInvalidoException as e:
        print("Error:", e)

    try:
        num2 = Calculadora.convertir_a_entero("abc")
        print("Conversión correcta:", num2)
    except NumeroInvalidoException as e:
        print("Error:", e)

    try:
        print("Suma:", Calculadora.sumar(10, 5))
        print("Resta:", Calculadora.restar(10, 5))
        print("Multiplicación:", Calculadora.multiplicar(10, 5))
        print("División:", Calculadora.dividir(10, 0))  
    except ZeroDivisionError as e:
        print("Error en división:", e)

    try:
        print("División:", Calculadora.dividir(50, 2))
    except ZeroDivisionError as e:
        print("Error en división:", e)

main()
