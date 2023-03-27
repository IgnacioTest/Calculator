#  Calculadora Spring-Boot
Calculadora como micro-servicio (API) utilizando Spring-boot y Maven con funcionalidades básicas de sumar, restar. Ademas de tracear el resultado de la operacion

Comunicación a través de una API REST (p.e. GET /calculator/calculate?num1=4&num2=9&operator=SUMA)

# Como utilizar:
* Descargar el repositorio girhub
* Ejecutar una verificación de Maven
* Instalación limpia de Maven

# Abrir una consola y ejecutar:
1. git clone
2. mvn clean install
3. mvn spring-boot:run

Con estos pasos deberiamos tener a nuestra disposición una API REST escuchando en http://localhost:8080/calculator/calculate

Si has tenido algun error con la ejecución de las instrucciones anteriores, en el proyecto ya hay un JAR definitivo compilado con todas las dependencias,  puedes  

1. clonar el proyecto en local 
2. ejecutar el JAR precompilado calculator-0.0.1-SNAPSHOT.jar


Si has seguido correctamente los pasos anteriores, deberias tener el puerto 8080 abierto y escuchando peticiones REST GET.

Los parámetros se le deben pasar por URL en formato URLEncoded. Los parametros son los siguientes primero el primer numero de la operación, segundo el segundo numero de la operación y operacion una cadena de texto describiendo la operación a realizar. 
# Valores aceptados: 

suma y resta. 


Por ejemplo:

http://localhost:8080/calculator/calculate?num1=4&num2=9&operator=SUMA