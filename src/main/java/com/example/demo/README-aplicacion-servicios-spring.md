# Aplicación de servicios de Spring

1. Generamos el esqueleto del programa en `start.spring.io` (Dependencias: WEB y Developer Tools (`spring boot devtools`)). Descomprimirlo en un directorio.
2. Creamos el proyecto git en github 
    1. Le damos al menú **+** 
    2. Dentro del menú a *New Repository*
3. Subir el proyecto a nuestro proyecto git.
   1. Con el sourcetree: Menú File -> Clone/New
   2. Arriba hay tres opciones: Clone, Add, Create
   3. Nos vamos a la carpeta donde vemos el src (donde está nuestro `pom.xml`. Ese es nuestro directorio. NO marquemos lo de crear repo.
   4. Te pregunta si quieres crear un repo en una carpeta existente, contestar "yes"
   5. Tenemos todos los archivos en 'unstaged' (pendientes). Le damos a 'Stage All' y nos los pone en el stage.
   6. Le damos a commit (arriba a la izquierda). Le ponemos un nombre (abajo) y le damos al commit.
   7. Vamos al github y copiamos la dirección del repositorio
   8. En Repository - > Repository Settings creamos uno nuevo con nombre origin y dirección la copiada. 
   9. Ya podemos hacer el push
3. Crear una propiedad en `application.properties` que sea mi.nombre con nuestro nombre
4. Crear un controlador que responda a /time. Por el momento que nos devuelva "hola"
    1.  Los controladores usan la anotación @Controller
    2. Devolveremos String con @ResponseBody




5. Creamos un servicio que nos devuelva la hora. Devolverlo en `/time`

6. El servicio recuperará el nombre y lo devolverá junto con la hora, usando `@Value('mi.nombre')`

```java
    @Value('mi.nombre')
    private String miNombre;
```
6. Creamos otro servicio 'singleton' que se guarda la hora y la devuelve, lo usamos desde el mismo controlador con /timesingle
7. Explicar las diferencias

Requisitos:

- Comentar las líneas de código
