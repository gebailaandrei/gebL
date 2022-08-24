package Visitors;

import MainPackage.gebLLexer;
import MainPackage.gebLParser;
import org.antlr.v4.runtime.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "test";
        CharStream in = CharStreams.fromFileName("./src/" + fileName + ".txt");
        gebLLexer lexer = new gebLLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gebLParser parser = new gebLParser(tokens);

        new Evaluator().visit(parser.list());
    }
}