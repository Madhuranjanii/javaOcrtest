import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test {
    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {

            tesseract.setDatapath("C:\\Users\\YES YAMAHA\\IdeaProjects\\JavaOcr\\tessdata");

            String text
                    = tesseract.doOCR(new File("C:\\Users\\YES YAMAHA\\IdeaProjects\\JavaOcr\\src\\card.jpeg"));

            System.out.print(text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
