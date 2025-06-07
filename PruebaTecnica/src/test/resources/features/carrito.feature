Feature: Agregar productos al carrito

  Background:
    Given el usuario esta en la pagina de login "Sauce Demo Login"
    When ingresa credenciales validas
    Then deberia ver la pagina principal "Products"

  @AgregarProductos @regresion
  Scenario: Agregar productos al carrito de compras
    Given el usuario se encuentra en la pagina de productos
    When selecciona el producto deseado
    Then valida que el producto se haya agregado al carrito