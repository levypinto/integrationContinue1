package com;
import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Yo
 *
 */
@RunWith(Parameterized.class)
class CalculsTest2 {



    static Stream<Arguments> chargerJeuDeTest() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6,6,36),
            Arguments.of(3,2,6)
        );
    }

	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTest")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}
	void testAddition(int firstNumber, int secondNumber, int expectedResult)
	{
		// Partie paramétrée
		Calculs monCal = new Calculs(firstNumber, secondNumber);
		assertEquals(expectedResult, monCal.multiplier(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult);

		// Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
		String n = null;
		assertNull(n);
	}

}
