

/**
 * @author aryan
 */
final class EscapeCharacter extends AbstractToken {

    static final char SYMBOL = '\\';

    @Override
    public char value() {
        return SYMBOL;
    }

}
