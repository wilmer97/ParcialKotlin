fun main() {
    /*

    Nombre: Wilmer Moncada Parra
    ID: 702523
    Materia: CP II
    Ingenieria de sistemas

Sistema Gestión Facultad:

Se pretende realizar una aplicación para una facultad que gestione la información sobre las personas vinculadas
con la misma y que se pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio.
A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A continuación,
debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
1.	Cambio del estado civil de una persona.
2.	Reasignación de despacho a un empleado.
3.	Matricula de un estudiante en un nuevo curso.
4.	Cambio de departamento de un profesor.
5.	Traslado de sección de un empleado del personal de servicio.
6.	Imprimir toda la información de cada tipo de individuo.
     */

    open class Persona(
        val Nombre: String,
        val Apellidos: String,
        val Num_Identificacion: String,
        var Estado_Civil: String
    ) {
        fun cambiarEstadoCivil(nuevoEstadoCivil: String) {
            Estado_Civil = nuevoEstadoCivil
        }
    }

    open class Empleado(
        Nombre: String,
        Apellidos: String,
        Num_Identificacion: String,
        Estado_Civil: String,
        val añoIncorporacion: Int,
        var NumeroDespacho: String
    ) : Persona(Nombre, Apellidos, Num_Identificacion, Estado_Civil) {
        fun reasignarDespacho(nuevoDespacho: String) {
            NumeroDespacho = nuevoDespacho
        }
    }

    class Estudiante(
        Nombre: String,
        Apellidos: String,
        Num_Identificacion: String,
        Estado_Civil: String,
        var curso: String
    ) : Persona(Nombre, Apellidos, Num_Identificacion, Estado_Civil) {
        fun matricularEnCurso(nuevoCurso: String) {
            curso = nuevoCurso
        }
    }

    class Profesor(
        Nombre: String,
        Apellidos: String,
        Num_Identificacion: String,
        Estado_Civil: String,
        var departamento: String
    ) : Persona(Nombre, Apellidos, Num_Identificacion, Estado_Civil) {
        fun cambio_departemento(nuevoDepartamento: String) {
            departamento = nuevoDepartamento
        }

        fun cambiarDepartamento(s: String) {

        }
    }

    class PersonalServicio(
        nombre: String,
        apellidos: String,
        numeroIdentificacion: String,
        estadoCivil: String,
        anioIncorporacion: Int,
        numeroDespacho: String,
        var seccion: String
    ) : Empleado(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho) {

        fun cambiarSeccion(nuevaSeccion: String) {
            seccion = nuevaSeccion
        }
    }

    fun imprimirInformacion(estudiante: Persona) {
        return imprimirInformacion()
    }

    fun main() {

        val Estudiante = Estudiante("Juan", "Perez", "123456789", "Soltero", "Curso 1")
        Estudiante.matricularEnCurso("Curso 2")

        val Profesor = Profesor("Maria", "Gomez", "987654321", "Casado", 2010, "Despacho 1", "Lenguajes")
        Profesor.cambiarDepartamento("Matemáticas")

        val PersonalServicio = PersonalServicio("Pedro", "Lopez", "456789123", "Soltero", 2015, "Despacho 2", "Biblioteca")
        PersonalServicio.cambiarSeccion("Decanato")

        imprimirInformacion(Estudiante)
        imprimirInformacion(Profesor)
        imprimirInformacion(PersonalServicio)
    }

    // Función para imprimir la información de una persona
    fun imprimirInformacion(persona: Persona) {
        println("Nombre: ${persona.Nombre}")
        println("Apellidos: ${persona.Apellidos}")
        println("Número de identificación: ${persona.Num_Identificacion}")
        println("Estado civil: ${persona.Estado_Civil}")
        println()
    }













}