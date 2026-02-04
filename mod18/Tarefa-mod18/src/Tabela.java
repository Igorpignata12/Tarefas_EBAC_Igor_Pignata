import java.lang.annotation.*;

/**
 * @author Igor Pignata
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Tabela{

    long value();
    String nome();

}