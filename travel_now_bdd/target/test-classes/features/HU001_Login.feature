@SmokeTest
# Historia de Usuario: HU-001 Validación de usuario
Feature: HU-001 Validación de usuario TravelNow
  Como usuario registrado en TravelNow
  Quiero iniciar sesión en la plataforma
  Para realizar búsquedas y ver mis reservas

  @login
  Scenario: Inicio de sesión exitoso
    Given que el usuario está en la página de inicio de sesión
    When ingresa credenciales válidas
    Then el sistema lo manda a la página principal

  Scenario: Inicio de sesión fallido
    Given que el usuario está en la página de inicio de sesión
    When ingresa credenciales incorrectas
    Then el sistema muestra un mensaje de "usuario o contraseña incorrecta"
