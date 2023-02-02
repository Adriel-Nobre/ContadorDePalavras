import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //por caminho do arquivo
        String filePath = "/Users/Adriel/Documents/ContadorDePalavras/teste.txt";

        String regexPattern = "([a-zA-Z]+'?-?[a-zA-Z]+(-?[a-zA-Z])?)|[a-zA-Z]";

        WordConfig wordConfig = new WordConfig(filePath, regexPattern);

        wordConfig.createListOfWords();
        wordConfig.createWordsFrequency();
        wordConfig.printListOfWords();

    }

}