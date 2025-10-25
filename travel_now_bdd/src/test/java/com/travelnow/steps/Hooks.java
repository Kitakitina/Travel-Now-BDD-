package com.travelnow.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        System.out.println("==========================================");
        System.out.println(">>> Iniciando escenario: " + scenario.getName());
        System.out.println(">>> Configurando entorno de prueba...");
        System.out.println("==========================================");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("------------------------------------------");
        if (scenario.isFailed()) {
            System.out.println(">>> El escenario falló: " + scenario.getName());
            System.out.println(">>> Capturando evidencia simulada (consola)");
        } else {
            System.out.println(">>> Escenario finalizado correctamente: " + scenario.getName());
        }
        System.out.println(">>> Cerrando entorno de prueba...");
        System.out.println("------------------------------------------\n");
    }
}
