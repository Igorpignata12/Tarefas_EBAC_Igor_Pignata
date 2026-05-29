package br.com.ipignata.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Igor Pignata
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class})
public class AllTests {
}