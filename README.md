# 3_Clases  
Creación de clases. Entender funcionamiento de los métodos. 
## Concesionario

Crea una clase **Coche**. Cada coche tiene los siguientes atributos:  
-matricula, tipo array de 7 caracteres, público  
-modelo, tipo String, privado  
-nSeguro, tipo entero, privado  
-color, tipo String, privado, por defecto a color "Blanco"  
-nMarchas, tipo byte, privado  
-nRuedas, constante de tipo byte, público, con el valor 4  
-precio, tipo float, privado  
-vendido, tipo boolean, privado, por defecto en false  

Y los siguientes métodos:  
+getter y setter de todos los atributos privados  
+aumentarPrecio(float aumento)  
+disminuirPrecio(float decremento)  
  
Crea una aplicación llamada **Concesionario**. En el método main crea 5 coches, llámalos coche1, coche2, coche3, coche4 y coche5. Solicita el modelo del coche por consola y asignaselo a todos los coches. Solicita el número de marchas al usuario y asígnalo a todos los coches. [Extra: el atributo nMarchas sólo se modificará si el número introducido está entre 4 y 7]. Asigna un color diferente a los coches 3 y 5. Establece un precio de 6000€ a cada coche. Consulta el número de ruedas del coche2 y muéstralo por pantalla. Aumenta el precio de los coches 3 y 5 por ser de diferente color en 1000€. Muestra todos los precios de los coches. Ahora sacan un nuevo modelo de coche y el modelo actual se devalúa en 2000€, es decir, disminuye el precio de todos los coches. Muestra el precio de todos los coches.  
  
Ahora llega un cliente y quiere comprar un coche. El usuario debe introducir un número por consola para decidir el coche. El cliente debe introducir una matrícula y un número de seguro para poder llevarse el coche. Muestra todos los atributos del coche. El coche seleccionado se marcará como vendido. Se mostrará su precio por pantalla.

Corrección:
~~~
Falta el get de la matrícula. 
Para marcar la venta de un coche has creado otro coche.
~~~
## SIMs

Crea una clase SIM (**Personaje**). Añade las características de los SIM:  
nombre, tipo String, privado  
genero, tipo char, privado  
dinero, tipo float, privado, por defecto en 10000 simoleones;  
nivelComida, tipo byte, privado, por defecto en 50;  
nivelEnergia, tipo byte, privado, por defecto en 50;  
vivo, tipo boolean, privado, por defecto a true.  
  
+Crea los métodos set y get de nombre y género. El género sólo podrá ser 'M' o 'H'.  
+Crea los métodos get de todos los atributos  
+Crea el método toString()  
+Crea los métodos ganarDinero(float cantidad), gastarDinero(float cantidad)  
  
+Crea estos métodos  
dormir() --> Incrementará el nivelEnergía en 50 y decrementa nivelComida en 10  
siesta() --> Incrementa nivel de Energía en 10  
comer() --> Incrementa nivel de comida en 20  
pedirComidaDomicilio(float coste) --> Utiliza el método comer() y decrementa el dinero según el coste de la comida  
hacerDeporte() --> Decrementa nivel de energía en 30 y decrementa comida en 10  
comprarRopa(float coste) --> Decrementa dinero según el coste de la ropa utilizando el método gastarDinero()  
trabajar(int nHoras) --> Por cada hora de trabajo el SIM incrementará su dinero en 120simoleones por cada hora. Utilizando el método ganarDinero()  

USO: Invéntate una aplicación (**SIMs**) que demuestre la creación y gestión de un SIM  

RETO: Un SIM sólo puede cambiar su nombre una vez en su vida  
RETO: Implementa todas las actividades UTILIZANDO LOS MÉTODOS DE INCREMENTAR/DECREMENTAR:  
Crea los métodos incrementarComida(byte aumento), decrementarComida(byte perdida), incrementarEnergia(byte aumento) y decrementarEnergia(byte perdida)  
Estos métodos pondrán el atributo vivo en estado FALSE cuando los niveles de energía sean negativos o 0.

Añade en el juego de los SIMs constructores que inicialicen los siguientes atributos:  
- (constructor vacío)  
- nombre  
- nombre y género  
- nombre, género y dinero  
- nombre, género, dinero, nivelVida y nivelEnergia

Prueba todos los constructores en tu programa

## Profesor_Módulo


Crea una clase **Profesor**. La clase tendrá los siguientes atributos: (todos privados)  
nombre, tipo String  
domicilio, tipo String  
titulación, tipo String  
telefono, tipo int  
+Crea setter y getters para todos los atributos  
+Crea el método toString  
  
Constructores para Profesor:  
- constructor por defecto  
- con todos los atributos  
  
Crea la "clase" enum **NombreMódulo** que contiene los nombres de los módulos (PROGRAMACION, ANDROID, LENGUAJESDEMARCAS, ENTORNOS, BASESDEDATOS, ACCESOADATOS, INTERFACES;)  
  
Crea una clase **Módulo**. La clase tendrá los siguientes atributos:  
NombreModulo nombre, es un ENUM de tipo NombreModulo , privado  
profesor, tipo Profesor, privado  
aula, tipo int, publico  
curso, tipo byte para indicar si es 1º o 2º  
nHoras, tipo byte, privado  
nMatriculados, tipo byte, privado representa el nº de alumnos matriculados  
una constante para el máximo de alumnos que será 20  
un boolean para indicar si tiene prácticas, privado  
  
Constructores para Modulo:  
-constructor por defecto  
- con nombre, profesor, curso y nº horas  
- con nombre y profesor  
- con nombre  
- con todos los atributos  
  
+Crea setter y getter de los atributos privados  
+Crea el método toString  
+Crea un método que sea desmatricularAlumno que decremente en 1 el nMatriculados si el nMatriculados es mayor que 0  
+Crea un método que sea matricular alumno y sólo deje matricular si el número de alumnos no está en el máximo.  
  
USO: Crea una **aplicación** que cree 2 profesores. El primer profesor se creará utilizando el constructor completo. El segundo, con el contrstuctor por defecto, rellena todos sus atributos utilizando los métodos set de la clase. Utiliza el método toString para mostrar todos los atributos de estos 2 objetos Profesor. Cambia el teléfono del primer profesor y la dirección del segundo. Vuelve a mostrar todos los atributos.  
  
A continuación crea 2 Módulos: uno de PROGRAMACION y otro de ANDROID.  
Crea el primer módulo con el constructor de modulo y profesor.  
Crea el segundo módulo con el constructor por defecto  
Cada módulo tendrá uno de los profesores creados previamente.  
Solicita al usuario el número de alumnos matriculados en cada módulo.  
Rellena todos los atributos que falten.  
Muestra todas las propiedades utilizando el método toString.  
Decrementa un alumno del módulo de segundo.  
Matricula a un alumno en el módulo de primero.  
Vuelve a mostrar todas las propiedades de los módulos.

## Agenda

Último ejercicio de clases antes del examen. Aquí tenéis el formato que pondré en el examen. Os daré dos clases que tengan alguna relación entre ellas, tendréis que verlas y comentarlas y a continuación tendréis que crear la aplicación principal. En este ejercicio la dificultad está en el uso de la clase ArrayList, una clase que veremos la semana que viene, aquí la utilizo para que vayáis trabajando con ella y comprendiendo sus métodos.  
  
Estudia las clases **Persona** y **Agenda**.  
Comenta qué hace cada método en ambas clases.  
  
Crea una aplicación **GestionaAgenda**.  
En dicha aplicación:  
- Crea una persona p1  
- Muestra el dni de esa persona  
- Añádela a la agenda  
- Muestra la lista de personas de la agenda  
- Crea una persona p2  
- Añádela a la agenda  
- Muestra la lista de personas de la agenda  
- Borra la persona p1 de la agenda  
- Muestra la agenda  
- Vuelve a añadir a la persona p2 a la agenda  
- Muestra la agenda  
- Vuelve a añadir a la persona p1 a la agenda  
- Finalmente, muestra la agenda

## RectánguloCuerda

Crea una clase **Rectángulo de cuerda**. Los rectángulos de cuerda tendrán dos propiedades, base y altura cuyos valores (en metros) se proporcionarán en la construcción del objeto. Existirán métodos para calcular el área y el perímetro de cada rectángulo. De alguna forma es necesario llevar la cuenta de los metros de cuerda utilizados al crear los rectángulos de cuerda. Debes disponer de un método que diga cúantos metros de cuerda se han utilizado para un rectángulo concreto y el total de metros utilizados.  
  
¡¡Diseña la clase de forma modular!!  
¡¡Gestiona posibles errorres!!  
  
Muestra un ejemplo de uso completo de tu clase (**RectánguloApp**).

## Electrodoméstico
Crea una clase **Electrodoméstico**. Cada aparato tiene una propiedad que representa su potencia, esta potencia se determina cuando se fabrica el electrodoméstico. Los aparatos se encienden un determinado número de horas. El consumo de cada electrodoméstico va en función del número de horas que esté encendido, potencia*horas. Es necesario llevar la cuenta del consumo total de todos los electrodomésticos de forma automática, es decir, de alguna forma el usuario de la aplicación (**Casa**) dirá cuántas horas enciende cada electrodoméstico y por último podrá visualizar cuál ha sido el consumo total.