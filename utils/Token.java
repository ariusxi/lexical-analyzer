package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {

    TK_MAIN ("main"),
    TK_INT ("int"),
    TK_FLOAT ("float"),
    TK_IF ("if"),
    TK_ELSE ("else"),
    TK_WHILE ("while"),
    TK_READ ("read"),
    TK_PRINT ("print"),
    TK_LBRACKET ("\\("),
    TK_RBRACKET ("\\)"),
    TK_LBRACE ("\\{"),
    TK_RBRACE ("\\}"),
    TK_COMMA (","),
    TK_QCOMMA (";"),
    TK_EQ ("=="),
    TK_NE ("!="),
    TK_LE ("<="),
    TK_GE (">="),
    TK_OR ("\\|\\|"),
    TK_AND ("&&"),
    TK_ATT ("\\="),
    TK_LT ("<"),
    TK_GT (">"),
    TK_PLUS ("\\+"),
    TK_MINUS ("-"),
    TK_MULT ("\\*"),
    TK_DIV ("\\/"),
    TK_ID ("[a-zA-Z]w*"),
    TK_FLOAT_CONST ("\\d(\\d)*\\.\\d(\\d)*"),
    TK_INTEGER_CONST ("\\d(\\d)*"),
    TK_NEWLINE ("\n"),
    TK_SKIP ("[ \t]+"),
    TK_MISMATCH (".");

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);
        if (m.find()) {
            return m.end();
        }
        return -1;
    }

}