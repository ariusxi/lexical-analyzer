import utils.LexicalAnalyzer;

public class Main {
    
    public static void main(String[] args) {
        LexicalAnalyzer analyzer = new LexicalAnalyzer("program.c");

        System.out.println("Análise Léxica");
        System.out.println("-----------------");
        while (!analyzer.isExausthed()) {
            System.out.printf("%-18s :  %s \n",analyzer.currentLexema() , analyzer.currentToken());
            analyzer.moveAhead();
        }

        if (analyzer.isSuccessful()) {
            System.out.println("Tudo certo!");
        } else {
            System.out.println(analyzer.errorMessage());
        }
    }

}