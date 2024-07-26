package ProyectoGasolinera;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FacturaPDFGenerator {

    public static void generarPDF(String nombreCompleto, String direccion, String telefono, String cedula,
                                  String fecha, String total, String[][] tablaDatos) {
        // Definir la carpeta donde se guardará el PDF
        String carpetaFacturas = "Facturas";
        Path carpetaPath = Paths.get(carpetaFacturas);

        // Crear la carpeta si no existe
        if (!Files.exists(carpetaPath)) {
            try {
                Files.createDirectory(carpetaPath);
            } catch (IOException e) {
                e.printStackTrace();
                return; // Salir si no se puede crear la carpeta
            }
        }

        // Generar nombre de archivo único basado en timestamp
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String rutaArchivo = carpetaFacturas + "/Factura_" + timestamp + ".pdf";
        
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));
            document.open();
            
            // Agregar imagen en la esquina superior derecha
            Image imagen = Image.getInstance("C:/Users/USER/OneDrive/Escritorio/mockitt/visual/logo.png");  // Cambia esta ruta a la ubicación de tu imagen
            imagen.setAbsolutePosition(400, 650);  // Ajusta las coordenadas según el tamaño de tu imagen y documento
            document.add(imagen);
            
            // Título de la factura
            document.add(new Paragraph("DETALLES DE FACTURA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24)));
            document.add(new Paragraph(" "));
            
            // Datos del cliente
            document.add(new Paragraph("Nombre Completo: " + nombreCompleto));
            document.add(new Paragraph("Direccion: " + direccion));
            document.add(new Paragraph("Telefono: " + telefono));
            document.add(new Paragraph("Cedula: " + cedula));
            document.add(new Paragraph("Fecha: " + fecha));
            document.add(new Paragraph(" "));
            
            // Tabla de detalles de la factura
            PdfPTable table = new PdfPTable(3);
            table.setWidths(new float[]{3, 2, 2});
            table.addCell("Descripción");
            table.addCell("Cantidad en Galones");
            table.addCell("Total");
            
            // Añadir las filas en el orden correcto
            for (String[] row : tablaDatos) {
                table.addCell(row[0]);  // Descripción
                table.addCell(row[1]);  // Cantidad en Galones
                table.addCell(row[2]);  // Total
            }
            
            document.add(table);
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Total: " + total));
            
            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
