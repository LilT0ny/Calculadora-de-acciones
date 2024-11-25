# Stock Calculator

Este proyecto es una calculadora de inversiones en acciones desarrollada en Java siguiendo el modelo MVC (Model-View-Controller) y con una interfaz gráfica de usuario (GUI). La aplicación permite a los usuarios ingresar datos de compra de acciones, obtener el precio actual desde una API externa y calcular la ganancia o pérdida en dólares y porcentaje.

## Características

- **Obtención del Precio Actual**: Usa la API de Alpha Vantage para obtener el precio actualizado de una acción.
- **Cálculo de Ganancia/Pérdida**: Calcula la ganancia o pérdida en función del precio de compra, precio actual y cantidad de acciones.
- **Interfaz Gráfica de Usuario (GUI)**: Facilita la entrada de datos y presenta los resultados de manera clara y visualmente atractiva.

## Requisitos

- Java 8 o superior.
- Dependencia de `org.json` para manejar la respuesta JSON de la API.
- Clave de API de [Alpha Vantage](https://www.alphavantage.co/) para obtener el precio actual de las acciones.

## Instalación

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/tu-usuario/stock-calculator.git
    cd stock-calculator
    ```

2. **Configura la clave de API**:
    - En el código fuente, reemplaza `TU_CLAVE_DE_API` con tu clave de Alpha Vantage.

3. **Ejecuta la aplicación**:
    - Compila y ejecuta el proyecto en tu IDE preferido o usando comandos de Java en terminal.

## Uso

1. **Ingrese los datos de inversión**:
    - Símbolo de la acción (por ejemplo, AAPL).
    - Cantidad de acciones compradas.
    - Precio de compra por acción.
    - Fecha de compra (formato YYYY-MM-DD).

2. **Obtén el resultado**:
    - La aplicación mostrará el precio actual, la ganancia o pérdida en porcentaje, y el equivalente en dólares.

## Ejemplo de Salida

Fecha de compra: 2023-01-01 Precio de compra por acción: $150.00 Precio actual por acción: $155.00 Ganancia/Pérdida: 3.33% Equivalente en dólares: $500.00


## Estructura del Proyecto

El proyecto está dividido en tres componentes principales:

1. **Modelo (Model)**: Contiene la lógica de negocio, como los métodos para obtener el precio actual y calcular la ganancia/pérdida.
2. **Vista (View)**: Presenta la interfaz gráfica de usuario (GUI) para ingresar datos y mostrar los resultados.
3. **Controlador (Controller)**: Coordina la interacción entre la vista y el modelo.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, abre un issue o envía un pull request.

---
