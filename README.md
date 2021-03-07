# metrocuadrado

#BDD (Behavior Driven Development)
El desarrollo guiado por el comportamiento, es una estrategia que plantea la definición de requisitos desde el punto de vista del negocio y lo integra con la parte técnica, creando un lenguaje común para el negocio y para los automatizadores.

#Gherkin
Gherkin es un lenguaje común que se escribe en términos de negocio, pero dado su formato puede ser entendido por un programa, lo que hace que pueda ser usado para diseñar casos de prueba automatizados.

Las pruebas se almacenan en archivos `.feature`, y las sentencias más comunes usadas son:

`Feature:` Nombre de la funcionalidad  que vamos a probar.

`Scenario:` habrá uno por cada prueba que quiera especificar para esta funcionalidad

`Given (Dado):`  precondiciones

`When (Cuando):` acciones que se van a ejecutar

`Then (Entonces):` Se especifica el  resultado esperado, las verificaciones a realizar.

#Cucumber
Cucumber es la herramienta que permite la ejecución de las pruebas automatizadas,  cuando los casos de prueba están escritos en el lenguaje de negocio.

#Gradle
Es un sistema de automatización de construcción de código abierto que construye sobre los conceptos de Apache Ant y Apache Maven e introduce un lenguaje específico del dominio (DSL) basado en Groovy en vez de la forma XML utilizada por Apache Maven para declarar la configuración de proyecto.

#JUnit
JUnit es un conjunto de clases, que permite ejecutar de forma controlada clases java, con el fin de evaluar si el funcionamiento de cada uno de los métodos tiene el comportamiento esperado. Generalmente, es usado para la ejecución de pruebas.

#Serenity BDD
Serenity BDD, es una librería de código abierto que ayuda a automatizar pruebas de aceptación de forma mas rápida y fácil. Además ofrece muchas ventajas en cuanto a la generación de reportes ilustrativos con los resultados de las pruebas ejecutadas y ayuda a la mantenibilidad de las pruebas

#Instalación de herramientas para automatización

- La primera herramienta que se debe instalar es el JDK de java.
- Descargar e instalar un IDE para desarrollo en JAVA, se recomienda utilizar IntelliJ en su versión community.
- Descargar e instalar gradle.
- Descargar e instalar el navegador web google chrome.
- clonar el proyecto `metrocuadrado` y en la carpeta raiz por medio de consola ejecutar el comando `gradle clean test aggregate --refres-dependendcies`
