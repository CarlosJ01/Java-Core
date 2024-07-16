package com.alfacentauri.maven.mavendemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/*
 * JUnit es un conjunto de bibliotecas creadas por Erich Gamma y Kent Beck que son utilizadas en programación 
 * para hacer pruebas unitarias de aplicaciones Java.
 * 
 * JUnit es un conjunto de clases (framework) que permite realizar la ejecución de clases Java de manera controlada, 
 * para poder evaluar si el funcionamiento de cada uno de los métodos de la clase se comporta como se espera. 
 * Es decir, en función de algún valor de entrada se evalúa el valor de retorno esperado; 
 * si la clase cumple con la especificación, entonces JUnit devolverá que el método de la clase pasó exitosamente 
 * la prueba; en caso de que el valor esperado sea diferente al que regresó el método durante la ejecución, 
 * JUnit devolverá un fallo en el método correspondiente.
 * 
 * JUnit es también un medio de controlar las pruebas de regresión, necesarias cuando una parte del código 
 * ha sido modificado y se desea ver que el nuevo código cumple con los requerimientos anteriores y que no se ha 
 * alterado su funcionalidad después de la nueva modificación.
 */
public class AppTest {
    
	@Test // Para saber que metodo es un unit test
//	@Before => Para que corra siempre antes de cada metodo test
//	@After => Para que corra siempre despues de cada metodo test
//	@BeforeClass => Para que corra antes de todos los test
//	@AfterClass => Para que corra despues de todos los test
//	@Ignore => Para que sea ignorado por maven o IDE
    public void givenNameWhenHelloThenReturnHelloNAme() {
        App app = new App();
        String hello = app.hello("Carlos");
        
        // Comprobar el resultado el test :)
        Assert.assertNotNull(hello); // Compruba que no sea nulo
        assertEquals("HelloCarlos", hello);// Comprueba que un valor es igual a otro
    }
}
