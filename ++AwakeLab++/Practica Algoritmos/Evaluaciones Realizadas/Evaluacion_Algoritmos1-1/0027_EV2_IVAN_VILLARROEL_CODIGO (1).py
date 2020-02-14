#!/usr/bin/python3
import sys

def funcion1():
    print(
    """
    INGRESARA 3 NUMEROS Y SE MOSTRARA EL PROMEDIO

    """
    )
    suma = 0
    arreglo = []
    for i in range(0,3):
        aux = int(input("Ingrese el numero "+str(i)+": "))
        arreglo.append(aux)
    for i in range(0,3):
        suma = (suma + arreglo[i])
    print("El promedio es: "+str(suma/3))

def funcion2():
    print(
    """
    SISTEMA PARA INGRESAR AL BAÑO

    """
    )
    nombre = input("Ingrese nombre: ")
    genero = input("Ingrese genero: ")
    if genero.lower() == "masculino":
        print("===> Su baño es el de hombres")
    if genero.lower() == "femenino":
        print("===> Su baño es el de mujeres")
    if genero.lower() != "masculino" and genero.lower() !="femenino":
        print("===> Su genero no coincide")

def funcion3():
    funcion2()   
    print(
    """
    SISTEMA DE COBRANZA

    """
    )
    respuesta = input("Desea ingresar al baño?: ")
    if respuesta.lower() == "si":
        print("===>Son $250 por favor pague con sencillo")
    if respuesta.lower() == "no":
        respuesta2 = input("Desea ingresar a la ducha?: ")
        if respuesta2.lower() == "si":
            print("===>Son $2500 por favor pague con sencillo")
        if respuesta2.lower() == "no":
            print("===>OK, adios")
        if respuesta2.lower() !="si" and respuesta2.lower() != "no":
            print("===>Respuesta invalida")

def funcion4():
    print(
    """
    SISTEMA DE TRADUCCION NUMERICA 

    """
    )
    diccionario = {
        1:"UNO",
        2:"DOS",
        3:"TRES",
        4:"CUATRO",
        5:"CINCO",
        6:"SEIS",
        7:"SIETE",
        8:"OCHO",
        9:"NUEVE",
        10:"DIEZ"
    }
    while True:
        aux = int(input("Ingrese numero del 1 al 10: "))
        if(aux not in range (1,11)):
            continue
        else:
            print("===>Usted ingreso el numero: "+str(diccionario.get(aux)))
            break

def funcion5():
    print(
    """
    SISTEMA REPETITIVA MIENTRAS

    """
    )
    def funcionPromedio(arreglo):
        num = 0
        for i in arreglo: 
            num = num + i
        return num/len(arreglo)
    arreglo = []
    while True: 
        aux = int(input("Ingrese un numero: "))
        if aux==0:
            break
        else:
            arreglo.append(aux)
    print(arreglo)
    print("El promedio es: "+str(funcionPromedio(arreglo)))  

def funcion6():
    print(
    """
    SISTEMA ADIVINA EL NOMBRE

    """
    )
    arreglo = []
    while True:
        nombre = input("Ingrese nombre con J: ")
        arreglo.append(nombre)
        if nombre.lower() == "juan":
            print("Ganaste!")
            break
    print("Te tomo "+str(len(arreglo)-1)+" intento(s) fallidos.")


def funcion7():
    print(
    """
    SISTEMA DE NOMBRES REPETIDOS 

    """
    )
    diccionario = {
        1 : "PRIMER",
        2 : "SEGUNDO",
        3 : "TERCER",
        4 : "CUARTO",
        5 : "QUINTO",
        6 : "SEXTO",
        7 : "SEPTIMO",
        8 : "OCTAVO",
        9 : "NOVENO",
        10 : "DECIMO"
    }
    arreglo = []
    arregloAux = []
    print("Ingresara 10 nombres.")
    for i in range(1,11):
        nombre = input("Ingrese "+diccionario.get(i)+" nombre: ")
        arreglo.append(nombre)
    while len(arreglo)>0: 
        for elemento in arreglo:  
            aux = elemento
            arreglo.remove(elemento)
            if aux in arreglo:
                arregloAux.append(aux)
    if len(arregloAux)>0: 
        print("Los siguientes nombres fueron repetidos: ",arregloAux)
    else: 
        print("No hay nombres repetidos")
    

def funcion8():
    print(
    """
    SISTEMA 5 ALUMNOS POR FILA

    """
    )
    arreglo = []
    arregloAux = []
    tamanoArreglo = int(input("Ingrese largo de lista: "))
    for i in range(0,tamanoArreglo):
        nombre = input(str(i+1)+": Ingrese nombre:  ")
        arreglo.append(nombre)
    arregloAux = arreglo
    for i in range(0,tamanoArreglo//5):
        print(arregloAux[:5])
        del arregloAux[:5]
    print(arregloAux)


def funcion9():
    print(
    """
    SISTEMA ARREGLOS BIDIMENSIONALES

    """
    )
    subArray = []
    array = []
    numAlumnos = int(input("Ingrese numero alumnos: "))
    for i in range(0,numAlumnos):
        nombre = input("Ingrese nombre: ")
        apellido = input("Ingrese apellido: ")
        fono = int(input("Ingrese fono: "))
        email = input("Ingrese email: ")
        subArray.append(nombre)
        subArray.append(apellido)
        subArray.append(fono)
        subArray.append(email)
        array = array + subArray
        del subArray[:4]
    for i in range(0,len(array)//4):
        print(array[:4])

def menu(opcion):
    if opcion == 1:
        funcion1()
    if opcion == 2:
        funcion2()
    if opcion == 3:
        funcion3()
    if opcion == 4:
        funcion4()
    if opcion == 5:
        funcion5()
    if opcion == 6:
        funcion6()
    if opcion == 7:
        funcion7()
    if opcion == 8:
        funcion8()
    if opcion == 9:
        funcion9()
    if opcion == 10:
        print("Saliendo del programa.")
        sys.exit(0)

def main():
    print(
        """

        ==========MENU==========
        
        1.- SECUENCIAL
        2.- CONDICIONAL SI ENTONCES
        3.- CONDICIONAL SI ENTONCES ANIDADO
        4.- CONDICIONAL SEGUN
        5.- REPETITIVA MIENTRAS
        6.- REPETITIVA REPETIR
        7.- REPETITIVA PARA
        8.- ARREGLO SIMPLE
        9.- ARREGLO BIDIMENSIONAL 
        10.- SALIR

        """
    )
    opcion = int(input("Ingrese opcion: "))
    menu(opcion)

if __name__ == '__main__':
    main()