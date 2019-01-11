
/**
 * @author aryan
 */
abstract class AbstractToken implements Token {

    @Override
    public String toString() {
        return String.valueOf(value());
    }

}
