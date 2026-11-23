# Taller #6 — Arreglos y Colecciones en Java

**Materia:** Desarrollo Web  
**Profesor:** @SarmientoEdu  
**Módulo:** 4 — Arreglos y Colecciones  
**Modalidad:** Grupal (parejas)

---

## Configuración rápida

### Integrante A (dueño del fork)

```bash
# 1. Fork en GitHub → habilitar Actions
# 2. Clonar
git clone https://github.com/TU-USUARIO/Taller6-java.git
cd Taller6-java

# 3. Crear la rama
git checkout -b taller6-apellidoA-apellidoB

# 4. Subir rama vacía para que B pueda unirse
git push origin taller6-apellidoA-apellidoB
```

### Integrante B

```bash
git clone https://github.com/USUARIO-A/Taller6-java.git
cd Taller6-java
git checkout taller6-apellidoA-apellidoB
```

## Compilar y ejecutar

```bash
# Parte 1
javac src/Parte1.java && java -cp src Parte1

# Parte 2
javac src/Parte2.java && java -cp src Parte2

# Parte 3 (dos archivos juntos)
javac src/Producto.java src/Parte3.java && java -cp src Parte3

# Parte 4
javac src/Parte4.java && java -cp src Parte4
```

## Estructura

```
src/          → archivos Java (completar con el código del taller)
respuestas/   → parte1.txt … parte4.txt (responder preguntas aquí)
imagenes/     → capturas de pantalla (p1, p2, p3, p4a, p4b, p4c)
```

## Entrega

Abrir Pull Request de `taller6-apellidoA-apellidoB` hacia `SarmientoEdu/Taller6-java`.  
Título: `[Taller6] ApellidoA-ApellidoB`
