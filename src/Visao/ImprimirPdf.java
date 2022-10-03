package Visao;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImprimirPdf {

    public void imprime(String pdf) throws FileNotFoundException, DocumentException, IOException, InterruptedException {
        Document doc = null;
        OutputStream os = null;

        try {
            
            doc = new Document(PageSize.A4, 72, 72, 72, 72);            
            os = new FileOutputStream("preview.pdf");           
            PdfWriter.getInstance(doc, os);            
            doc.open();
            
            Paragraph p1 = new Paragraph("Minhas citações!", FontFactory.getFont(FontFactory.HELVETICA, 20,Font.BOLD));
            doc.add(p1);
            
            Paragraph p2 = new Paragraph("_____________________________________________________");
            doc.add(p2);

            Paragraph p = new Paragraph(pdf);
            doc.add(p);
        } finally {
            if (doc != null) {
                
                doc.close();
            }
            if (os != null) {
                
                os.close();
            }
        }
        Process pro = Runtime.getRuntime().exec("cmd.exe /c  preview.pdf");
        pro.waitFor();
    }
}
