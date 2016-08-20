/**
 *
 * @author Rodrigo Arriaza y Sebastian Galindo;
 */
public abstract class AbstractFactory {

    /**
     * Clase abstracta para el Factory
     * @param <E> como tipo de dato
     * @param tipoStack el tipo de Stack
     * @return Stack un stack
     */
    public abstract <E> Stack<E> makeStack(String tipoStack);
}

