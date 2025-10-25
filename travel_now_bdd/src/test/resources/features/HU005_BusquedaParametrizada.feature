@SmokeTest
# Historia de Usuario: HU-005 Búsqueda parametrizada de vuelos
Feature: HU-005 Búsqueda parametrizada de vuelos
  Como usuario de TravelNow
  Quiero poder buscar vuelos con diferentes orígenes y destinos
  Para encontrar la mejor opción de viaje disponible.

@Busqueda @Outline

Scenario Outline: Búsqueda de vuelos con distintos orígenes y destinos
    Given que el usuario está en la sección de vuelos
    When ingresa origen "<origen>" y destino "<destino>"
    And presiona "Buscar vuelos"
    Then se muestran resultados entre "<origen>" y "<destino>"

Examples:
    | origen        | destino       |
    | Santiago      | Lima          |
    | Buenos Aires  | Madrid        |
    | Bogotá        | Miami         |
