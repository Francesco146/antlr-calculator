import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        InputStream is = cl.getResourceAsStream(args[0]);
        CharStream cs = CharStreams.fromStream(is);

        es1Lexer lexer = new es1Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        es1Parser parser = new es1Parser(tokens);

        ParseTree tree = parser.main();

        Es1 interpreter = new Es1();
        System.out.println(interpreter.visit(tree));
    }
}