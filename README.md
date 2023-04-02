## Prueba automatizada del flujo de compra con Screenplay y Serenity
Esta prueba automatizada utiliza el patrón de automatización Screenplay junto con la herramienta de automatización de pruebas Serenity para probar el flujo de compra de un sitio web de comercio electrónico.
### El flujo de compra consta de los siguientes pasos:

1.	Iniciar sesión en el sitio web con un usuario y contraseña válidos.
2.	Buscar un producto.
3.	Seleccionar el mejor producto evaluado.
4.	Agregar el producto a la bolsa de compras.
5.	Seleccionar el medio de pago.

### Para ejecutar esta prueba automatizada, se requiere lo siguiente:
1.	JDK 11
2. 	Gradle 5.2.1 o posterior
3.	Chrome o Firefox instalado en la máquina local
4. 	Entorno de desarrollo preferiblemente Intellij IDEA
### Configuración
Antes de ejecutar la prueba automatizada, es necesario agregar usuario y contraseña de registro asociado al comercio electrónico en el artchivo files.
### Ejecución
Para ejecutar la prueba automatizada, sigue los siguientes pasos:
Abre el proyecto y ejecuta el runner/compraTest
### Resultados
Los resultados de la prueba automatizada se generarán en la carpeta target/site/serenity/. Abre el archivo index.html en un navegador.

