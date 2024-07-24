# CampusLands ERP

CampusLands ERP es un programa desarrollado para llevar el seguimiento académico de todos los campers matriculados en el programa intensivo de programación del departamento académico de CampusLands. Este programa permite a los usuarios procesar inscripciones, gestionar rutas de entrenamiento, asignar trainers, registrar notas y generar reportes.

## Características

El sistema cuenta con las siguientes características:

1. **Registro de Campers**:
    - Identificación
    - Nombres
    - Apellidos
    - Dirección
    - Acudiente
    - Teléfonos de contacto (celular y fijo)
    - Estado (En proceso de ingreso, Inscrito, Aprobado, Cursando, Graduado, Expulsado, Retirado)
    - Riesgo

2. **Rutas de Entrenamiento**:
    - Ruta NodeJS
    - Ruta Java
    - Ruta NetCore

3. **Roles del Sistema**:
    - Camper
    - Trainer
    - Coordinador

4. **Áreas de Entrenamiento**:
    - Apollo
    - Artemis
    - Sputnik
    - Cada área tiene una capacidad máxima de 33 campers.

5. **Módulos de Entrenamiento**:
    - Fundamentos de programación (Introducción a la algoritmia, PSeInt y Python)
    - Programación Web (HTML, CSS y Bootstrap)
    - Programación formal (Java, JavaScript, C#)
    - Bases de datos (MySQL, MongoDB, PostgreSQL)
    - Backend (NetCore, Spring Boot, NodeJS y Express)

6. **Evaluación y Seguimiento Académico**:
    - Prueba inicial para aprobar la inscripción
    - Evaluaciones periódicas de módulos (teórica y práctica)
    - Registro de notas y cambios de estado
    - Gestión de campers en rendimiento bajo

7. **Reportes**:
    - Listado de campers inscritos
    - Listado de campers aprobados en el examen inicial
    - Listado de trainers activos
    - Listado de campers con bajo rendimiento
    - Listado de campers y trainers asociados a una ruta
    - Estadísticas de aprobación y pérdida por módulo y ruta

## Requisitos del Sistema

- Java 8 o superior
- IDE de Java (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## Instalación y Ejecución

1. Clona este repositorio:
    ```bash
    git clone https://github.com/tu_usuario/CampusLands-ERP.git
    ```

2. Abre el proyecto en tu IDE de Java preferido.

3. Compila y ejecuta el programa.

## Uso del Sistema

### Menú Principal

El menú principal del sistema permite acceder a las siguientes opciones:

1. **Registro**:
    - Registrar Camper
    - Registrar Docente
    - Crear Rutas
    - Registrar Área
    - Asignar fechas a campers

2. **Camper**:
    - Asignar Ruta
    - Ingresar Nota de selección
    - Ingresar notas del filtro
    - Listar Campers inscritos
    - Listar Campers de bajo rendimiento
    - Registrar fechas de inicio y fin

3. **Docentes**:
    - Modificar Ruta
    - Modificar Horario
    - Modificar Área
    - Listar Docentes vinculados

4. **Listas**:
    - Listar docentes y campers por ruta
    - Listar campers aprobados y reprobados por rutas

### Roles

El sistema cuenta con tres roles principales:

- **Camper**: Participa en las rutas de entrenamiento y es evaluado periódicamente.
- **Trainer**: Dirige las rutas de entrenamiento y evalúa a los campers.
- **Coordinador**: Gestiona la inscripción, notas y rutas de entrenamiento, además de generar reportes.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas colaborar, por favor abre un issue o crea un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más información.

## Contacto

Para más información, puedes contactarnos en [tu_email@dominio.com](mailto:tu_email@dominio.com).

---

Desarrollado por [Tu Nombre].
