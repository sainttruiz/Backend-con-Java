Problema: Sistema de Gestión de Estudiantes
Descripción:

Desarrolla un programa para gestionar una lista de estudiantes en una escuela. El programa debe permitir al usuario agregar, eliminar y buscar estudiantes. Cada estudiante tiene un nombre, una edad y un número de identificación único. El programa debe ser robusto y manejar correctamente las excepciones.

Requerimientos:
Clase Estudiante:

Atributos: nombre (String), edad (int), id (String).
Constructor que inicializa estos atributos.
Método toString() que devuelva una representación en formato String del estudiante.
Clase GestorEstudiantes:

Lista de estudiantes (puedes usar ArrayList).
Métodos para:
Agregar Estudiante:
Debe lanzar una IllegalArgumentException si la edad es menor a 0 o si el nombre está vacío.
Debe verificar que el ID no se repita; si se repite, debe lanzar una IllegalArgumentException.
Eliminar Estudiante:
Debe lanzar una NoSuchElementException si no se encuentra el estudiante con el ID proporcionado.
Buscar Estudiante:
Debe lanzar una NoSuchElementException si no se encuentra el estudiante con el ID proporcionado.
Listar Estudiantes:
Imprimir la lista de estudiantes.
Clase Main:

Proporcionar un menú al usuario para:
Agregar estudiante.
Eliminar estudiante.
Buscar estudiante por ID.
Listar todos los estudiantes.
Manejar excepciones adecuadamente:
Usar try-catch para manejar IllegalArgumentException y NoSuchElementException al llamar a los métodos de GestorEstudiantes.
Mostrar mensajes de error amigables al usuario.
Consideraciones:
Asegúrate de validar las entradas del usuario (por ejemplo, asegurarte de que la edad sea un número válido).
Utiliza throw para lanzar excepciones donde sea necesario.
Declara excepciones verificadas en la firma de los métodos si decides utilizar excepciones que lo requieran.
Haz que tu programa sea fácil de usar y comprensible, mostrando mensajes claros al usuario.
Objetivo:
Este ejercicio te permitirá poner en práctica:

Creación y manejo de excepciones.
Validaciones de entradas.
Estructuración de código en clases.
Uso de listas y manejo de datos.
Intenta implementar el programa siguiendo estos lineamientos y aplicando las mejores prácticas en el manejo de excepciones. ¡Buena suerte!