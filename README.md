# 💱 Conversor de Monedas - Java POO

## 📌 Descripción
Este es un proyecto en **Java** que implementa un conversor de monedas con interfaz de consola. Permite realizar conversiones entre diferentes divisas utilizando tasas de cambio en tiempo real obtenidas de una API externa.

El flujo de uso es simple:
1. Seleccionar una opción del menú principal.
2. Elegir las monedas a convertir (opciones predefinidas o personalizadas).
3. Ingresar la cantidad a convertir.
4. Ver el resultado con la tasa de cambio actualizada.
5. Consultar el historial de conversiones realizadas.

### Archivos principales
- **[Principal.java](src/com/edgar/conversordemonedas/Principal/Principal.java):** menú interactivo y flujo principal de la aplicación.
- **[Conversiones.java](src/com/edgar/conversordemonedas/Modelos/Conversiones.java):** lógica de las conversiones y gestión del historial.
- **[Conexion.java](src/com/edgar/conversordemonedas/API/Conexion.java):** consumo de la API externa para obtener tasas de cambio.
- **[Moneda.java](src/com/edgar/conversordemonedas/Modelos/Moneda.java):** modelo de datos para representar una moneda convertida.
- **[MonedaAPI.java](src/com/edgar/conversordemonedas/Modelos/MonedaAPI.java):** modelo para mapear la respuesta de la API.
- **[MonedaHistoricoFecha.java](src/com/edgar/conversordemonedas/Modelos/MonedaHistoricoFecha.java):** modelo para el histórico de tasas de cambio.

---

## 🛠️ Tecnologías utilizadas

- **Java 11+** - Lenguaje de programación.
- **Programación Orientada a Objetos (POO)** - Arquitectura del proyecto.
- **ExchangeRate-API** - API externa para obtener tasas de cambio en tiempo real.
- **Gson** - Librería para deserializar JSON a objetos Java.
- **HttpClient** - Cliente HTTP para consumir la API.
- **Scanner** - Entrada de datos desde consola.

---

## 🎯 Funcionalidades principales

### 1. Conversiones predefinidas
La aplicación ofrece conversiones rápidas entre pares de monedas frecuentes:
- 💵 Dólar (USD) ↔ Peso colombiano (COP)
- 💵 Dólar (USD) ↔ Real brasileño (BRL)
- 💵 Dólar (USD) ↔ Peso argentino (ARS)

**Implementación:**
- Función `ConversionEstatica(String MonedaINI, String MonedaFIN)` en [Conversiones.java](src/com/edgar/conversordemonedas/Modelos/Conversiones.java)
- Lee la cantidad a convertir.
- Llama a la API con el par de monedas especificado.
- Muestra el resultado con la tasa de cambio actual.
- Registra la operación en el historial.

📷 **Ejemplo de conversión:**  
```
El valor de: 100 dólares (USD) son: 412500.50 pesos colombianos (COP)
Usando una tasa de conversion de: 4125.0050
```

---

### 2. Conversión universal (personalizada)
Permite convertir entre cualquier par de monedas soportadas por la API.

**Implementación:**
- Función `ConversionUniversal(String MonedaINI, String MonedaFIN)` en [Conversiones.java](src/com/edgar/conversordemonedas/Modelos/Conversiones.java)
- Solicita al usuario ingrese los códigos de las monedas (ej. EUR, GBP, JPY, etc.).
- Realiza la conversión con tasas en tiempo real.
- Almacena el registro en el historial.

---

### 3. Ver tasas de cambio históricas
Consulta las tasas de cambio de una moneda específica respecto a múltiples divisas.

**Implementación:**
- Función `VerCambiosHistoricos()` en [Conversiones.java](src/com/edgar/conversordemonedas/Modelos/Conversiones.java)
- Utiliza `ObtenerHistoricoMonedaFecha()` de [Conexion.java](src/com/edgar/conversordemonedas/API/Conexion.java)
- Muestra un listado de tasas de cambio actuales para varias monedas.

---

### 4. Historial de conversiones
Mantiene un registro de todas las conversiones realizadas durante la sesión.

**Implementación:**
- Variable `historial` de tipo `ArrayList<String>` en [Conversiones.java](src/com/edgar/conversordemonedas/Modelos/Conversiones.java)
- Se agregan registros automáticamente en cada conversión.
- Función `verHistorial()` para mostrar todas las operaciones realizadas.

---

### 5. Menú interactivo
Interfaz de consola sencilla con opciones numeradas para navegar entre funciones.

**Implementación:**
- Clase `Principal.java` con el método `main()`.
- Utiliza un bucle `do-while` para mantener el menú activo.
- Estructuras `switch-case` para manejar opciones del usuario.

---

## ⚙️ Arquitectura del proyecto

### Estructura de paquetes
```
com.edgar.conversordemonedas
├── Principal/
│   └── Principal.java          (punto de entrada)
├── API/
│   └── Conexion.java           (gestión de API)
└── Modelos/
    ├── Moneda.java             (modelo de moneda convertida)
    ├── Conversiones.java       (lógica de conversiones)
    ├── MonedaAPI.java          (modelo de respuesta API)
    └── MonedaHistoricoFecha.java (modelo para histórico)
```

### Flujo de datos
1. **Usuario** ingresa datos en consola.
2. **Principal.java** valida opciones y llama a métodos en **Conversiones.java**.
3. **Conversiones.java** realiza lógica de negocio y solicita datos a **Conexion.java**.
4. **Conexion.java** consume la API ExchangeRate y deserializa JSON con **Gson**.
5. Los datos se mapean en modelos (**Moneda.java**, **MonedaAPI.java**, etc.).
6. Los resultados se muestran al usuario y se guardan en el historial.

---

## ▶️ Cómo ejecutar

### Requisitos previos
- **Java 11 o superior** instalado en tu sistema.
- **Librería Gson** incluida en el classpath del proyecto.
- Conexión a Internet para acceder a la API ExchangeRate-API.

### Pasos para ejecutar

1. **Clonar o descargar** este repositorio.
2. **Navegar** al directorio del proyecto:
   ```bash
   cd ConversorDeMonedas
   ```

### Flujo de uso
1. Seleccionar opción **1** → Cambiar de una moneda a otra.
2. Elegir una conversión predefinida (ej. USD → COP) u opción 7 para personalizada.
3. Ingresar la cantidad a convertir (ej. 100).
4. Ver el resultado con la tasa de cambio actualizada.
5. Seleccionar opción **3** para ver el historial de todas las conversiones.
6. Seleccionar opción **4** para salir.

---

## 📝 Ejemplo de uso

```
------------------------------------------
  Bienvenido/a al Conversor de Monedas 
------------------------------------------
Elige una de las opciones escribiendo en numero
------------------------------------------
 1. Cambiar de una moneda a otra 
 2. Ver la tasa actual de una moneda
 3. Ver mi historial de coversiones
 4. Salir
------------------------------------------
1

------------------------------------------
      Cambiar de una moneda a otra        
------------------------------------------
 1. Dólar =>> Peso colombiano 
 2. Peso colombiano =>> Dólar
 3. Dólar =>> Real brasileño
 4. Real brasileño =>> Dólar
 5. Dólar =>> Peso argentino
 6. Peso argentino =>> Dólar
 7. Cambio personalizado 
------------------------------------------
 8. Regresar al menu principal
------------------------------------------
1

------------------------------------------
       Ingrese la cantidad      
------------------------------------------
100

El valor de: 100.0 dólares (USD) son: 412500.50 pesos colombianos (COP)
Usando una tasa de conversion de: 4125.0050
```

---

## 📂 Referencias a código

### Principal.java
- **Punto de entrada:** Método `main(String[] args)`
- **Estructura:** Menú principal con bucle `do-while`
- **Función:** Gestiona opciones y delega a `Conversiones.java`

### Conversiones.java
- **Variables principales:**
  - `historial` → ArrayList para almacenar conversiones
  - `cantidad` → valor ingresado por el usuario
  - `conexion` → instancia de Conexion para llamadas a API

- **Métodos clave:**
  - `ConversionEstatica(String, String)` → Realiza conversión entre pares predefinidos
  - `ConversionUniversal(String, String)` → Conversión personalizada
  - `VerCambiosHistoricos()` → Muestra tasas de cambio actuales
  - `verHistorial()` → Muestra registro de operaciones
  - `IngresarCantidad()` → Lee cantidad de usuario

### Conexion.java
- **Método principal:**
  - `HacerConversion(String conversionDeMoneda)` → Llamada a API para obtener tasa de cambio
  - `ObtenerHistoricoMonedaFecha(String codigoMoneda)` → Obtiene tasas de cambio históricas

- **API utilizada:** `https://v6.exchangerate-api.com/`
- **Deserialización:** Gson para convertir JSON a objetos Java

### Modelos (Moneda.java, MonedaAPI.java, MonedaHistoricoFecha.java)
- Clases que mapean los datos de la API y almacenan resultados de conversión.

---

## 🚀 Mejoras futuras

- ✅ **Persistencia de datos:** Guardar el historial en una base de datos o archivo.
- ✅ **Interfaz gráfica (GUI):** Migrar a Swing o JavaFX para mejor experiencia.
- ✅ **Más pares de monedas:** Incluir criptomonedas (BTC, ETH) y más divisas.
- ✅ **Gráficos de tendencias:** Mostrar variaciones de tasas en tiempo real.
- ✅ **Validaciones mejoradas:** Manejo robusto de errores y entrada inválida.
- ✅ **Caché local:** Almacenar tasas en memoria para reducir llamadas a la API.
- ✅ **Múltiples conversiones:** Permitir cadenas de conversión (USD → EUR → GBP).

---

## 📹 Video de demostración
🎬 [Ver demostración del funcionamiento de la aplicación](https://drive.google.com/file/d/1BIcgzFwkJ_H7jMmD_pmDKNTg0lGb2gHW/view?usp=sharing)  

---

## 📄 Licencia
Este proyecto es de práctica educativa para el **Oracle Next Education Challenge**.

---

## 👤 Autor
Desarrollado por **Edgar Stiven Garcia** como parte del Challenge de Conversor de Monedas - Java POO.

---

## 🤝 Contribuciones
¿Encontraste un bug o tienes sugerencias? ¡Abre un issue o contacta al autor!

