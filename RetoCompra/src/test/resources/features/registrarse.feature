#language:es
#encoding:UTF-8
#Author: Yolima Alejandra Guadir

Característica: Compras en pagina de falabella
  yo como usuario de la pagina falabella
  quiero iniciar sesion e ingresar
  para poder comprar productos en la página

  Antecedentes:
    Dado que el usuario esta en la pagina de inicio
    Cuando navega hasta la el formulario de inicio de sesion


  @Compra
  Escenario: Compra de productos
    Y Completa los campos para el login y selecciona producto
    Entonces el usuario debe mirar un mensaje de compra exitosa

