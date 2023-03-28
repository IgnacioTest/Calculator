#  Calculadora Spring-Boot
Calculadora como micro-servicio (API) utilizando Spring-boot y Maven con funcionalidades básicas de sumar, restar. Ademas de tracear el resultado de la operacion

Comunicación a través de una API REST (p.e. GET /calculator/calculate?num1=4&num2=9&operator=SUMA)

# Como utilizar:
* Descargar el repositorio github
* Ejecutar una verificación de Maven
* Instalación limpia de Maven

# Abrir una consola y ejecutar:
1. git clone
2. mvn clean install
3. mvn spring-boot:run

Con estos pasos deberiamos tener a nuestra disposición una API REST escuchando en http://localhost:8080/calculator/calculate

Una vez realizados los comandos, el micro estará abierto en el puerto 8080 y escuchando peticiones REST GET.

Los parámetros se le deben pasar por URL en formato URLEncoded. Los parametros son los siguientes primero el primer numero (num1) de la operación, segundo el segundo numero de la operación (num2) y la operación (operator) a realizar. 

# Valores aceptados: 

suma y resta. 


Por ejemplo:

http://localhost:8080/calculator/calculate?num1=4&num2=9&operator=SUMA
