/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test;

import org.junit.jupiter.api.Test;

import first.App;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() throws Exception {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}