# Convertidor de Moneda
Este proyecto es un convertidor de moneda simple y fácil de usar. Utiliza la API de ExchangeRate-API para obtener las tasas de cambio en tiempo real.


## Clases
El proyecto consta de tres clases:

1. `Moneda`: Esta clase es un registro que contiene un solo campo, `conversion_rate`, que representa la tasa de cambio obtenida de la API.

2. `ConvertirMoneda`: Esta clase contiene un método, `moneda`, que toma una moneda de origen, una moneda de destino y una cantidad de dinero,
   y devuelve una instancia de `Moneda` con la tasa de cambio correspondiente.

4. `Principal`: Esta es la clase principal del programa. Contiene un menú interactivo que permite al usuario seleccionar el tipo de conversión que desea realizar.


## Uso
Para usar el convertidor de moneda, simplemente ejecuta la clase `Principal`. Se te presentará un menú con varias opciones de conversión. 
Ingresa el número de la opción que deseas, luego ingresa la cantidad de dinero que deseas convertir. El programa calculará la cantidad de 
dinero en la moneda de destino y la mostrará en la consola.


## Dependencias
Este proyecto utiliza las siguientes dependencias:
- Gson: Una biblioteca de Google para convertir objetos Java en su representación JSON y viceversa.
