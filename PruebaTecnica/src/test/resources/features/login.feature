Feature: Login de usuario

  @LoginExitoso @regresion
  Scenario: Login exitoso con credenciales validas
    Given el usuario esta en la pagina de login "Sauce Demo Login"
    When ingresa credenciales validas
    Then deberia ver la pagina principal "Products"


  @LoginFallido @regresion
  Scenario: Login fallido con credenciales invalidas
    Given el usuario esta en la pagina de login "Sauce Demo Login"
    When ingresa credenciales invalidas
    Then deberia ver un mensaje de error "Mensaje Error"