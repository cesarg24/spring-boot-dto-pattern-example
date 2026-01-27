# Spring Boot DTO Pattern Implementation

Este repositorio demuestra la implementación del patrón **DTO (Data Transfer Object)** en un entorno de Spring Boot. El objetivo principal es desacoplar la capa de persistencia (Entidades) de la capa de presentación (API REST), mejorando la seguridad y la eficiencia en la transferencia de datos.

## 🧠 ¿Por qué usamos DTOs en este proyecto?

En el desarrollo de software profesional y ciberseguridad, el uso de DTOs es vital para:
* **Seguridad:** Evitamos exponer campos sensibles de la base de datos (como contraseñas, IDs internos o metadatos).
* **Optimización:** Enviamos solo los datos que el cliente necesita, reduciendo el tamaño de la respuesta JSON.
* **Flexibilidad:** Podemos renombrar o transformar campos sin afectar la estructura de nuestra base de datos.

## 🏗️ Estructura de la Solución

El flujo de transformación en este proyecto sigue este esquema:
`Database (Entity) -> Service (Mapeo/Lógica) -> Client (DTO)`

## 🛠️ Ejemplo de Lógica Implementada

En este proyecto, el servicio transforma la entidad `Usuario` en un `UsuarioDto` aplicando reglas dinámicas:

```java
// Este código es un Endpoint de un controlador que ilustra el proceso completo de transformación de datos (de Entidad a DTO) en una sola función.
    @GetMapping("/usuarios4")
    public List<UsuarioDto> usuarios4(){
        
        List<Usuario> body = List.of(
         new Usuario(100L, "Karol", "Moe", "18"),
         new Usuario(101L, "Maria", "Doe", "22"),
         new Usuario(102L, "Rita", "Perez", "25")
        );

         List<UsuarioDto> bodyDto = body.stream()
         //.map(UsuarioDto::new)
         .map(varlist -> new UsuarioDto(varlist))
         .collect(Collectors.toList());
        return bodyDto;
    }

##🚀 Tecnologías
Java 17

Spring Boot 3

Maven

Lombok (para reducir código repetitivo en DTOs y Entidades)
