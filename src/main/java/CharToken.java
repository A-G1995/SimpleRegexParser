
/**
 * @author aryan
 */
final class CharToken extends AbstractToken {

    private final char value;

    CharToken(char value) {
        this.value = value;
    }

    @Override
    public char value() {
        return value;
    }

}
