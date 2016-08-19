/**
 *
 * @author Rodrigo Arriaza y Sebastian Galindo;
 */
public abstract class AbstractFactory {

    /**
     *
     * @param <E> como tipo de dato
     * @param tipoStack
     * @return un stack
     */
    public abstract <E> Stack<E> makeStack(String tipoStack);
}

