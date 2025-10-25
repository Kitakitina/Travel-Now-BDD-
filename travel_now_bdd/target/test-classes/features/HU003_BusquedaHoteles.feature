@SmokeTest
# Historia de Usuario: HU-003 Búsqueda de hoteles
Feature: HU-002 Búsqueda de vuelos en TravelNow
  Como usuario registrado en TravelNow
  Quiero buscar vuelos en una ciudad específica
  Para comparar precios y horarios disponibles

@Busqueda @Vuelos

Scenario: Búsqueda simple de vuelos
    Given que el usuario está en la página principal
    When ingresa origen "Santiago" y destino "Buenos Aires"
    And presiona "Buscar vuelos"
    Then se muestran vuelos disponibles en pantalla
