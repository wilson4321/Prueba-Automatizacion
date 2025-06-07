Feature: Realizar Checkout de la compra

  Background:
    #login
    Given el usuario esta en la pagina de login "Sauce Demo Login"
    When ingresa credenciales validas
    Then deberia ver la pagina principal "Products"

    #Agregar producto
    Given el usuario se encuentra en la pagina de productos
    When selecciona el producto deseado
    Then valida que el producto se haya agregado al carrito

  @RealizarCheckout @regresion
  Scenario: Realizar el proceso de checkout
    Given el usuario se encuentra en la pagina del carrito
    When realiza click en checkout y completa la informacion
    Then validar que se haya completado la compra