/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaLowercase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static javaLowercase.App.CAPITAL_ESZETT;

class AppTest {
   @Test
   void localeDependentLowercase() {
       Assertions.assertNotEquals(
        CAPITAL_ESZETT.toLowerCase(new Locale("de", "DE")),
        CAPITAL_ESZETT.toLowerCase(new Locale("de", "CH"))
       );
   }
}
