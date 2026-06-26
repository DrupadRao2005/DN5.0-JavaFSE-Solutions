public class DocumentFactory {

    public Document createDocument(String type) {

        if (type.equals("word")) {
            return new WordDocument();
        } else if (type.equals("pdf")) {
            return new PdfDocument();
        } else if (type.equals("excel")) {
            return new ExcelDocument();
        } else {
            System.out.println("Unknown document type!");
            return null;
        }
    }
}