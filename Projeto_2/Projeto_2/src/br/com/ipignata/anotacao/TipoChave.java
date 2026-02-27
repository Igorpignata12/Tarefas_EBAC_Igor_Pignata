package br.com.ipignata.anotacao;

import java.lang.annotation.*;

/**
 * @author Igor Pignata
 */

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}