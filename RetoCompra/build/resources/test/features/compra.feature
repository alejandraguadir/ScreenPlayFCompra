Feature: Comprar producto
  yo como usuario de falabella
  quiero dirigirme a la seccion de productos
  para poder comprar un producto

  Scenario: Compra de productos
    Given el usuario esta en la pagina principal
    When navega hasta la opcion de incio de sesion
    And selecciona el producto
    Then debe observar un mensaje de compra exitosa