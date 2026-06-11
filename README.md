# Implementación de un sistema de procesamiento de eventos en tiempo real

En el contexto de un sistema de gestión de pagos en línea, debes implementar un componente que maneje flujos de eventos provenientes de múltiples orígenes (por ejemplo, solicitudes de pago, confirmaciones de pago, rechazos de pago). El componente debe ser resiliente, escalable y confiable, utilizando operadores de Project Reactor para gestionar estos flujos de manera eficiente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración inicial del sistema

**Objetivo:** Establecer un sistema básico que pueda recibir y procesar eventos de pago.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los diferentes tipos de eventos de pago y sus fuentes.
- Configurar el sistema para recibir estos eventos y almacenarlos temporalmente.

**Entregable:** Sistema capaz de recibir y almacenar eventos de pago.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar la simultaneidad de eventos provenientes de diferentes fuentes.
- Piensa en la estructura de datos adecuada para almacenar estos eventos.

</details>

### Fase 2: Implementación de operadores de Project Reactor

**Objetivo:** Utilizar operadores de Project Reactor para procesar los eventos de pago de manera eficiente.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Seleccionar los operadores adecuados para filtrar, transformar y combinar los eventos de pago.
- Implementar la lógica para manejar diferentes tipos de eventos (solicitudes, confirmaciones, rechazos).

**Entregable:** Sistema que utiliza operadores de Project Reactor para procesar eventos de pago.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga los diferentes operadores disponibles en Project Reactor y sus usos.
- Considera cómo puedes utilizar estos operadores para mejorar la eficiencia y resiliencia del sistema.

</details>

### Fase 3: Garantizar resiliencia y escalabilidad

**Objetivo:** Asegurar que el sistema sea resiliente y escalable ante un aumento en el volumen de eventos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar mecanismos para manejar la congestión y los fallos temporales.
- Optimizar el sistema para manejar un mayor volumen de eventos sin degradar el rendimiento.

**Entregable:** Sistema resiliente y escalable para manejar eventos de pago.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga técnicas para manejar la congestión y los fallos temporales en sistemas reactivos.
- Considera cómo puedes optimizar el sistema para manejar un mayor volumen de eventos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los operadores de Project Reactor y cómo se utilizan en la programación reactiva?
- **paraQueSirve**: ¿Para qué sirve utilizar operadores de Project Reactor en el procesamiento de eventos de pago?
- **comoSeUsa**: ¿Cómo se utilizan los operadores de Project Reactor para filtrar, transformar y combinar eventos de pago?
- **erroresComunes**: ¿Cuáles son los errores comunes al utilizar operadores de Project Reactor y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica garantizar la resiliencia y escalabilidad del sistema de procesamiento de eventos?

## Criterios de Evaluacion

- Implementación de un sistema básico que pueda recibir y almacenar eventos de pago.
- Utilización de operadores de Project Reactor para procesar eventos de pago de manera eficiente.
- Implementación de mecanismos para manejar la congestión y los fallos temporales.
- Optimización del sistema para manejar un mayor volumen de eventos sin degradar el rendimiento.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
