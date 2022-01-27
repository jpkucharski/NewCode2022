package main;

public class Main {

    public static void main(String[] args) {

        TextFileOperationExecutor textFileOperationExecutor_referenceSymbol
                = new TextFileOperationExecutor();
        TextFile textFile = new TextFile("file1.txt");
        textFileOperationExecutor_referenceSymbol.executeOperation(textFile::open);
        textFileOperationExecutor_referenceSymbol.executeOperation(textFile::save);

        for (TextFileOperation tfo : textFileOperationExecutor_referenceSymbol.getTextFileOperations()) {
            System.out.println(tfo.execute());
        }
    }
}
