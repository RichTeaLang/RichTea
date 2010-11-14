import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import richTea.antlr.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        RichTeaLexer lex = new RichTeaLexer(new ANTLRFileStream("C:\\Users\\Richard\\Documents\\RichTea\\src\\richTea\\antlr\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        RichTeaParser g = new RichTeaParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}