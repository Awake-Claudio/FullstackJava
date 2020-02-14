El programa incia llamando la funcion menuPrincipal, la cual a través de un Segun/Switch llama a las otras funciones dentro de este menu las cuales realizan las siguientes aciones:

opcion 1:
se definen 3 variables enteras (suma, n, contador)
Se obtiene el ingreso de 3 numeros a traves de un ciclo repetitivo
el numero (n) se registra dentro de suma, sumando a suma+n
el contador cuenta las vueltas dadas para detener el ciclo
se entrega el promedio de los datos ingresados y al finalizar se devuelve al menu inicial

opcion 2:
Se genera un arreglo de 2 dimensiones, dentro se ingresan el nombre y genero de los usuarios correspondientes, se reduce en caracter correspondiente a lo ingresado en 'genero' para poder realizar comparacion sin problemas de tipeo, segun el sexo ingresado se muestra un mensaje con el baño correspondiente, al finalizar se moviliza hacia la función 3

opcion 3:
la funcion 3 solo entra en funcionamiento si la funcion 2 ya ha sido utilizada y rellenada con datos correspondientes
Se realiza la consulta para saber si se pretende utilizar baño o ducha a traves de la indicacion de 2 opciones, 1 y 2 correspondientemente, en caso de ingresar numeros que no sean 1 o 2 la consulta se vuelve a realizar
segun lo ingresado en la eleccion, se envia un mensaje con el valor correspondiente

opcion 4:
se solicita ingresar 10 numeros a través de un ciclo iterativo que tiene la consulta dentro, se realiza la lectura del valor ingresado y a traves de un segun/switch se devuelve el numero expresado como texto, si mientras se realiza la consulta se ingresa un numero que no esté entre 1 y 10, la cuenta de vueltas se mantiene y se continua preguntando por un numero valido
una vez finalizado se regresa al menu principal llamando a la funcion

opcion 5:
se definen las variables enteras que serán de utilidad, contador y suma se incian en 0 ya que no deben contener nada en un inicio
se solicita el ingreso de un numero, en caso de ser igual a 0 desde un inicio, la ejecucion de esta funcion se detiene indicando que los valores finales son iguales a 0 y se vuelve al menu de incio
en caso de ser ingresados valores validos se van sumando los numeros y la cantidad que se han ingresado hasta que el usuario ingrese un valor 0, finalizado esto se muestra por pantalla la cantidad de numeros ingresados y el promedio de estos

opcion 6:
se define un contador de intentos y una varible para registrar textos ingresados
se solicita un nombre, y mientras el nombre ingresado no sea correspondiente a 'juan', los intentos se acumulan, una vez acertado el nombre se muestra el mensaje de 'ganar' y la cantidad de intentos que tomó
finalizado todo, se devuelve al menu principal

opcion 7:
se define un arreglo para guardar 10 nombres, a traves de un ciclo iterativo se rellenan los nombres, cualquier nombre ingresado se tranforma en minusculas, una vez ingresados todos los nombres se procede a otro ciclo iterativo
el siguiente ciclo procede  consultar la primera posicion del arreglo y a compararla con el resto de nombres dentro, se crea una variable para verificar si efectivamente hay nombres repetidos, se guarda en una variable el nombre repetido
al final de la realizacion de los ciclos se entrega un mensaje, si se valida, de que hay o no hay nombres repetidos, y las cantidades de estos
finalizado todo se vuelve al menu inicial

opcion 8: (contiene fallos)
se crea un arreglo con nombres
se recorre el arreglo con un ciclo iterativo, si el largo del ciclo alcanza para escribir en una linea 5 nombres ingresados, se imprime la linea
se realiza la misma consulta para ver si alcanza para poner 4, 3, 2 o un nombre dentro de una linea, luego se finaliza la consulta cuando ya no quedan nombres por consultar
una vez terminado se regresa al menu inicial

opcion 9:
Se crea un arreglo bidimensional de tamaño dado por el usuario, dentro de cada indice se registran 4 datos, esos cuatro datos son rellenados a traves de una consulta por un ciclo iterativo
una vez rellenados se procede a mostrar lo ingresado mostrando todo lo del 1er indice (los 4 datos) y asi sucesivamente hasta recorrer el arreglo
una vez finalizado todo se vuelve al menu principal