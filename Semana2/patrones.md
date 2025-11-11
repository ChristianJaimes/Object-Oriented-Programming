# 💡 Diferencia entre Patrones GRASP y GoF

---

## 🧩 ¿Qué son los patrones de diseño?

- Son **soluciones reutilizables** a problemas comunes en el diseño de software.
- No son código, sino **modelos conceptuales**.
- Promueven:
  - **Buenas prácticas**
  - **Reutilización**
  - **Mantenibilidad**
  - **Bajo acoplamiento**

---

## 🎯 Dos familias principales

Existen dos grupos ampliamente reconocidos:

1. **Patrones GRASP (General Responsibility Assignment Software Patterns)**  
   ➜ Enfocados en **asignar responsabilidades** entre clases y objetos.

2. **Patrones GoF (Gang of Four)**  
   ➜ Enfocados en **estructurar la arquitectura y el comportamiento** del software.

---

## 🧠 Patrones GRASP

- Propuestos por **Craig Larman**.
- GRASP = *General Responsibility Assignment Software Patterns*.
- Definen **cómo distribuir las responsabilidades** dentro de un sistema orientado a objetos.

### 🔹 Objetivo:
> Ayudar a decidir **qué clase debe hacer qué**.

---

## 📘 Ejemplos de Patrones GRASP

| Patrón | Propósito principal |
|--------|----------------------|
| **Information Expert** | Asigna la responsabilidad a quien tiene la información necesaria. |
| **Creator** | Define quién debe crear instancias de otras clases. |
| **Controller** | Coordina las operaciones del sistema. |
| **Low Coupling** | Minimiza dependencias entre clases. |
| **High Cohesion** | Mantiene las clases enfocadas y coherentes. |
| **Polymorphism** | Usa polimorfismo para manejar variaciones de comportamiento. |
| **Pure Fabrication** | Crea clases artificiales para reducir acoplamiento. |
| **Indirection** | Usa intermediarios para desacoplar clases. |
| **Protected Variations** | Aísla las partes que cambian para proteger el resto del sistema. |

---

## 🧩 Patrones GoF

- Definidos por el grupo **“Gang of Four”** (Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides).
- Publicados en el libro:
  > *Design Patterns: Elements of Reusable Object-Oriented Software (1994)*

### 🔹 Objetivo:
> Proporcionar **soluciones de diseño reutilizables** a nivel estructural y de comportamiento.

---

## 📘 Clasificación de los Patrones GoF

| Tipo | Enfoque | Ejemplo |
|------|----------|----------|
| **Creacionales** | Creación de objetos | Singleton, Factory, Builder |
| **Estructurales** | Composición de clases y objetos | Adapter, Composite, Decorator |
| **Comportamentales** | Interacción entre objetos | Observer, Strategy, Command |

---

## ⚖️ Diferencias clave entre GRASP y GoF

| Aspecto | **GRASP** | **GoF** |
|----------|------------|----------|
| **Enfoque** | Asignación de responsabilidades | Estructura y comportamiento del diseño |
| **Nivel de abstracción** | Conceptual (principios de diseño) | Concreto (soluciones arquitectónicas) |
| **Origen** | Craig Larman | Gamma, Helm, Johnson, Vlissides |
| **Propósito** | Enseñar buenas prácticas de diseño OO | Reutilizar soluciones a problemas comunes |
| **Ejemplos** | Controller, Creator, Low Coupling | Singleton, Observer, Factory |

---

## 🧩 Relación entre ambos

- **GRASP** define *cómo pensar y asignar responsabilidades*.
- **GoF** define *cómo implementar soluciones específicas*.
- Son **complementarios**, no opuestos.

> 🧠 Puedes usar GRASP para diseñar la lógica general,  
> y luego aplicar GoF para resolver problemas técnicos puntuales.

---

## 💬 Ejemplo comparativo

**Situación:** Diseñar un sistema de notificaciones.

- **GRASP:**  
  - Usa *Controller* para manejar solicitudes.  
  - Usa *Low Coupling* para mantener independencia entre clases.

- **GoF:**  
  - Aplica *Observer* para notificar automáticamente a múltiples suscriptores.

---

## ✅ En resumen

| | **GRASP** | **GoF** |
|--|--|--|
| **Define** | Principios de diseño | Soluciones de diseño |
| **En qué ayuda** | Asignar responsabilidades | Estructurar y conectar objetos |
| **Nivel** | Conceptual | Técnico |
| **Complemento** | GoF | GRASP |

---

## 🏁 Conclusión

- GRASP enseña **cómo pensar en diseño orientado a objetos**.  
- GoF enseña **cómo implementar patrones reutilizables**.  
- Ambos **se complementan** para lograr sistemas:
  - Más mantenibles
  - Más robustos
  - Más escalables

---

## 💡 Frase final

> “GRASP te enseña a **pensar bien** el diseño.  
> GoF te enseña a **construirlo bien**.”
