# 🃏 Inventario de Cartas de Hearthstone - Programación II

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Clean Code](https://img.shields.io/badge/Clean%20Code-Principles-brightgreen?style=for-the-badge)

## 🏛 FACULTAD DE INGENIERÍA Y CIENCIAS APLICADAS

### Materia: INGENIERÍA DE SOFTWARE  
**Código:** ISWZ1103 - PROGRAMACIÓN II  
**Tiempo estimado:** 80 minutos  
**Autores:** *Washignton Villares, Bryan Cando, Steven Brazales*  

---

## 🎯 Objetivo de la Actividad

Aplicar los conocimientos adquiridos sobre **manejo de excepciones** en Java, desarrollando una aplicación orientada a objetos basada en el juego de cartas **Hearthstone**.

---

## 📝 Descripción

El programa permite gestionar un **Inventario de Cartas** con las siguientes funcionalidades:

- ✅ Registrar una carta (nombre, descripción, coste de maná)
- 📋 Ver el **total de cartas** ingresadas
- 📦 Ver las cartas registradas y la cantidad repetida de cada una
- ❌ Salir del sistema

Además, el sistema:

- Maneja **excepciones** como `InputMismatchException` para validar correctamente la entrada del usuario.
- Aplica principios de **código limpio** para asegurar legibilidad, modularidad y mantenimiento.

---

## 📂 Estructura del Proyecto

```bash
📦 InventarioCartas
├── Carta.java               # Modelo de carta
├── RegistroCarta.java       # Gestión del inventario (mapa de cartas)
└── Main.java                # Lógica principal con menú y control de excepciones
```

---

## ⚙️ Tecnologías y Requisitos

- **Lenguaje:** Java 8+
- **IDE recomendado:** IntelliJ IDEA
- **Compilación:** Manual con `javac` o desde el IDE

---

## 🧪 Instrucciones de Ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/Washitox/Cartas-de-Hearthstone.git
   cd Cartas-de-Hearthstone
   ```

2. Compila los archivos `.java`:
   ```bash
   javac Main.java Carta.java RegistroCarta.java
   ```

3. Ejecuta el programa:
   ```bash
   java Main
   ```

---

## ❗ Manejo de Excepciones

El sistema detecta errores de entrada como ingreso de texto donde se espera un número, usando:

```java
catch (InputMismatchException e) {
    System.out.println("Solo se aceptan Números");
}
```

---

## 🧼 Buenas Prácticas Aplicadas

- ✅ Métodos concisos y descriptivos.
- ✅ Uso de clases separadas por responsabilidad (modelo, controlador, lógica).
- ✅ Reutilización de código mediante `Map` y métodos como `getOrDefault`.
- ✅ Validación de entradas y control de flujo limpio.

---

## 📸 Capturas del Funcionamiento  


```
- 📋 Menú principal
```
-   >

![image](https://github.com/user-attachments/assets/c0218a76-05cc-4799-a172-0de6f4173099)

   >
```
- 📝 Registro exitoso de una carta
```
-   >

![image](https://github.com/user-attachments/assets/c9370236-0f60-4528-ba64-20da29de8832)

   >
```
- ❌ Error por ingreso de letras en lugar de números
```
-   >


![image](https://github.com/user-attachments/assets/a0e3b948-9e43-4e36-a506-d97d38b2ae6c)

   >  
```
- 🔢 Visualización del total de cartas
```
-   >

![image](https://github.com/user-attachments/assets/95be16ee-6570-4622-9f98-1f02406c457b)

   >
```
- 📦 Listado con cantidad de cartas repetidas
```
-   >

![image](https://github.com/user-attachments/assets/7238b397-fc95-4232-b7d0-a972247699a5)

   >


