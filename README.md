"Proyecto algoritmos" 
Integrantes:
Juan Martinez
Camila Giraldo
Diego Ortiz
Leonardo Cuadros


<img width="500" height="491" alt="image" src="https://github.com/user-attachments/assets/fc65f2c3-edce-4411-aa47-34835f3369b2" />


//Definición del subproceso para saludar
SubProceso saludar()
	Escribir "¡Hola! Bienvenido al programa :p."
FinSubProceso
//Definición de la función para sumar enteros positivos
Funcion resultado <- sumarEnteros(a, b)
	Definir resultado Como Entero
	Si a < 0 O b < 0 Entonces
		resultado <- -1
	Sino
		resultado <- a + b
	FinSi
FinFuncion
Algoritmo ProgramaPrincipal
	//Prueba del primer método (saludar)
	saludar()
	//Prueba del segundo método (sumarEnteros)
	Definir num1, num2, total Como Entero
	num1 <- 8
	num2 <- 6
	total <- sumarEnteros(num1, num2)
	Escribir "La suma es: ", total
	//Lógica adicional de los enteros a y b
	Definir a, b, sumaDirecta Como Entero
	a <- 0 //Se puede cambiar según necesites
	b <- 0
	sumaDirecta <- a + b
	Escribir "La suma de los números es: ", sumaDirecta
FinAlgoritmo
