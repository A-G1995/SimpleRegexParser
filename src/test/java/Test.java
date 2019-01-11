public class Test {


    public static void main(String[] args) {
        String regex = "£*(ab+|ca*(€$+|a)+c)";
        ParseTree tree = Parser.parse(regex);
        System.out.println(tree);
    }


}
