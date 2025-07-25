

Este proyecto es un ejemplo de aplicación Java que utiliza principios básicos de Programación Orientada a Objetos (POO):

\- Encapsulamiento: Los atributos de la clase Mascota son privados y se acceden mediante getters y setters.

\- Abstracción: La clase Mascota tiene un método mostrarInformacion() que muestra los detalles de cada mascota de forma clara.

\- Modularidad: Cada clase (Mascota y Veterinaria) está definida en su propio archivo.



Estructura

\- Mascota.java: Contiene la definición de la clase Mascota con sus atributos, constructor, métodos getters/setters y el método para mostrar información.

\- `Veterinaria.java`: Crea objetos Mascota y muestra su información en consola.



Ejecución

1\. Compila los archivos Java.

2\. Ejecuta la clase Veterinaria para ver la información de las mascotas en la consola.



Comandos Git utilizados

\- git init

\- git add .

\- git commit -m

\- git remote add origin

\- git push origin main



Reflexión:

es mejor usar el diseño de interfaces ya que permite el agregar comportamientos de una mejor manera y no estar sobrecargando de herencia cada clase, ya que java no permite herencia múltiple de clases, pero si múltiples interfaces



el instanceof permite verificar si un objeto tiene una capacidad extra sin afectar la jerarquía principal.



@Override permite sobreescribir diferentes métodos indicando que vienen de una superclase o interfaz

