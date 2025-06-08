# Prueba Técnica - Automatización y Pruebas de Performance

Este repositorio contiene el proyecto de automatización con Serenity BDD + Java + Gradle, así como un script de pruebas de performance con Apache JMeter.

---


## 1. Estructura del proyecto

- `PruebaTecnica`: Carpeta que contiene Script de pruebas automatizadas con Serenity BDD.
- `Reporte Serenity`: Carpeta que contiene capturas de evidencias y reporte HTML de Serenity.
- `Performance/PruebaTecnica.jmx`: Script de pruebas de carga con Apache JMeter.
- `Performance/REPORTE PRUEBAS DE PERFORMANCE.docx`: Documento con captura de los resultados de carga y resumen de hallazgos.

---

## 2. Instrucciones para ejecutar pruebas de UI (Serenity BDD)

### Prerrequisitos:
- Java 11 o superior
- Gradle instalado 
- Navegador Chrome
- Intellij IDEA

### Comandos de ejecucion:
#### Ejecutar todas las pruebas desde Gradle
./gradlew clean test aggregate
O ejecutar desde el runner deseado en el IDE (por ejemplo, desde `RegressionRunner`)

## 3. Instrucciones para ejecutar pruebas de Performance (Jmeter)

### Prerrequisitos:
- Apache Jmeter 5.6.3 instalado

### Ejecucion:
- Abrir Jmeter
- Cargar el script `PruebaTecnica.jmx`
- Ejecutar la prueba dando click en el boton de play ▶️
- Ver los resultados en el arbol de resultados o Reporte resumen

