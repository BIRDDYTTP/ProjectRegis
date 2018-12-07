import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class PDFCreator {

    public void createPDF(ArrayList<Subject> subjects){
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 14, BaseColor.BLACK);
            String report = "";
            for(Subject sub : subjects){
                if(sub.isPassing())
                    document.add(new Paragraph(String.format("Subject: %-11s\t%-10s(%s) \n", sub.getSubID(), "Pass", sub.getSubject())));
                else
                    document.add(new Paragraph(String.format("Subject: %-11s\t%-10s(%s) \n", sub.getSubID(), "Not pass", sub.getSubject())));

                document.add(Chunk.NEWLINE);
            }
//            Chunk chunk = new Chunk(report, font);
//            document.add(chunk);
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
