/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.consultas;

public class controlGenFactura {

    consultas modelo = new consultas();
    controladorReloj ctRel=new controladorReloj();
 
    public void pdf(String nomC, DefaultTableModel tablaProd){
        try{
            String id=modelo.ticket().getString("idFacturas");
            FileOutputStream archivo;
            File file = new File("src/pdf/venta "+id+".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/vista/iconoTedemaz.jpg");
            
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Fecha: " + ctRel.calFechaISO()+"\n\n");
            
            PdfPTable encabezado = new PdfPTable(4);
            encabezado.setWidthPercentage(100);
            encabezado.getDefaultCell().setBorder(0);

            float[] colEncab = new float[]{20f, 30f, 70f, 40f};
            encabezado.setWidths(colEncab);
            encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            encabezado.addCell(img);
    
            String nom = "Tedemaz";
            String tel = "6513218913";
            String dir = "Mazatlán";

            encabezado.addCell("");
            encabezado.addCell("Nombre: " + nom + "\nTelefono: " + tel + "\nDirección: " + dir);
            encabezado.addCell(fecha);
            doc.add(encabezado);

//            Paragraph cli = new Paragraph();
//            cli.add(Chunk.NEWLINE);
//            cli.add("Datos del cliente\n\n");
//            doc.add(cli);
//
//            PdfPTable tablacli = new PdfPTable(4);
//            tablacli.setWidthPercentage(100);
//            tablacli.getDefaultCell().setBorder(0);
//            float[] colCli = new float[]{20f, 50f, 30f, 40f};
//            tablacli.setWidths(colCli);
//            tablacli.setHorizontalAlignment(Element.ALIGN_LEFT);
//            PdfPCell cl1 = new PdfPCell(new Phrase("Nombre",negrita));
//            cl1.setBorder(0);
//            tablacli.addCell(cl1);
//            String algo=nomC;
//            tablacli.addCell(algo);
//            doc.add(tablacli);

            double total = 0.0;

            PdfPTable tablaProdPDF = new PdfPTable(4);
            PdfPCell cell = new PdfPCell();
            tablaProdPDF.setWidthPercentage(100);
            tablaProdPDF.getDefaultCell().setBorder(0);
            float[] colProd = new float[]{20f, 50f, 30f, 40f};
            tablaProdPDF.setWidths(colProd);
            tablaProdPDF.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell pro2 = new PdfPCell(new Phrase("Nombre",negrita));
            PdfPCell pro3 = new PdfPCell(new Phrase("Precio",negrita));
            PdfPCell pro4 = new PdfPCell(new Phrase("Cantidad",negrita));
            PdfPCell pro5 = new PdfPCell(new Phrase("Total",negrita));
            pro2.setBorder(0);
            pro3.setBorder(0);
            pro4.setBorder(0);
            pro5.setBorder(0);
            tablaProdPDF.addCell(pro2);
            tablaProdPDF.addCell(pro3);
            tablaProdPDF.addCell(pro4);
            tablaProdPDF.addCell(pro5);
            for(int i=0;i<tablaProd.getRowCount();i++){
                String nombre=tablaProd.getValueAt(i, 1).toString();
                String Precio=tablaProd.getValueAt(i, 2).toString();
                String Cant=tablaProd.getValueAt(i, 3).toString();
                total = total + (Double.parseDouble(tablaProd.getValueAt(i, 3).toString())*(Double.parseDouble(tablaProd.getValueAt(i, 2).toString())));
                tablaProdPDF.addCell(nombre);
                tablaProdPDF.addCell(Precio);
                tablaProdPDF.addCell(Cant);
                tablaProdPDF.addCell(String.valueOf(total));
                System.out.println(total);
            }

            doc.add(tablaProdPDF);

            doc.close();
            archivo.close();
        }catch(Exception e){
            System.out.println("pdf");
        }
    }
   
}
