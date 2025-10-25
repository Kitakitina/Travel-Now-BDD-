@SmokeTest
# Historia de Usuario: HU-004 Gestión de reservas
Feature: HU-004 Plataforma de Reservas TravelNow
  Como usuario de la plataforma TravelNow
  Quiero poder loguearme, buscar vuelos y hoteles, crear y cancelar reservas
  Para poder planificar mis viajes de manera rápida y segura.

@Reserva @vuelo

Scenario: Reserva de vuelo exitosa
    Given que el usuario ha iniciado sesión correctamente
    And tiene un vuelo seleccionado en la lista de resultados
    When confirma la reserva y realiza el pago con tarjeta válida
    Then el sistema muestra un mensaje "Reserva completada exitosamente"

@Reserva @Hoteles

Scenario: Reserva de hotel exitosa
    Given que el usuario ha iniciado sesión correctamente
    And tiene un hotel seleccionado en la lista de resultados
    When confirma la reserva y realiza el pago con tarjeta válida
    Then el sistema muestra un mensaje "Reserva completada exitosamente"

@Cancelacion

Scenario: Cancelación de una reserva
    Given que el usuario tiene una reserva activa
    When ingresa a "Mis reservas"
    And selecciona "Cancelar reserva"
    Then la reserva cambia su estado a "Cancelada"
