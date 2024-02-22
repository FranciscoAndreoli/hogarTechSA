/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.doo.vista;

import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.core.Robot;
import org.assertj.swing.core.matcher.DialogMatcher;
import org.assertj.swing.core.matcher.JButtonMatcher;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.finder.WindowFinder;
import org.assertj.swing.fixture.DialogFixture;
import org.assertj.swing.fixture.FrameFixture;
import static org.assertj.swing.launcher.ApplicationLauncher.application;

import org.assertj.swing.fixture.JOptionPaneFixture;
import org.assertj.swing.fixture.JTableFixture;
import org.assertj.swing.launcher.ApplicationLauncher;
import org.assertj.swing.timing.Pause;
import org.doo.App;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;


/**
 *
 * @author matiasgonzalez
 */
public class PersonaJFrameTest {
    private FrameFixture window;
    private Robot robot;

    @Before
    public void setUp() {
        robot = BasicRobot.robotWithNewAwtHierarchy();
        ApplicationLauncher.application(App.class).start();
        window = WindowFinder.findFrame(FormPrincipal.class).using(robot);
        window.show(); // Asegura que la ventana esté visible
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }

    @Test
    public void testGuardarPersona() {
        // Navega a través del menú para abrir FormPersona
        window.menuItem("menuGestion").click();
        window.menuItem("menuItemUsr").click();

        // Espera a que se abra FormPersona
        DialogFixture dialog = window.dialog("FormPersona"); // Usa el nombre de la ventana
        dialog.requireVisible(); // Asegura que la ventana está visible

        // Rellena los campos en FormPersona
        dialog.textBox("txtNombre").setText("John");
        dialog.textBox("txtApellido").setText("Doe");
        dialog.textBox("txtDni").setText("12345678");
        dialog.textBox("txtDomicilio").setText("123 Main St");

        // Asumiendo que hay un botón para guardar la persona
        dialog.button("btnGuardar").click();


        JTableFixture table = dialog.table("modeloTblPersonas");
        table.requireRowCount(1);

        JOptionPaneFixture op = dialog.optionPane();
        op.requireMessage("Operación ejecutada con éxito");

        JTableFixture tablaPersonas = dialog.table("modeloTblPersonas");
        table.requireRowCount(1);
    }

    @Test
    public void testEliminarPersona() {
        // Navega a través del menú para abrir FormPersona
        window.menuItem("menuGestion").click();
        window.menuItem("menuItemUsr").click();

        // Espera a que se abra FormPersona
        DialogFixture dialog = window.dialog(DialogMatcher.withTitle("FormPersona"));
        dialog.requireVisible();

        // Selecciona una persona de la tabla (ajusta el índice de fila según sea necesario)
        JTableFixture table = dialog.table("modeloTblPersonas");
        table.selectRows(0); // Selecciona la primera fila

        // Asumiendo que hay un botón para eliminar la persona
        dialog.button("btnEliminar").click();

        // Verificar alguna condición, como un mensaje de éxito o un cambio en una tabla
        // Verificar el mensaje de éxito
        JOptionPaneFixture op = dialog.optionPane();
        op.requireMessage("Persona eliminada con éxito");

        // Verificar que la tabla refleja el cambio
        table.requireRowCount(0); // expectedRowCount debería ser el número de filas después de eliminar
    }
   
}
