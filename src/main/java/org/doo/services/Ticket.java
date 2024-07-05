
package org.doo.services;

import org.doo.dto.ClienteDto;
import org.doo.dto.PedidoDto;
import org.doo.dto.DetallePedidoDto;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Ticket {
    private int numTicket;
    private String fechaTransaccion;

    public Ticket() {
        this.numTicket = new Random().nextInt(1000000);
        this.fechaTransaccion = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public int getNumTicket() {
        return numTicket;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public String generarTicket(ClienteDto cliente, PedidoDto pedido, List<DetallePedidoDto> detallePedidoList, String formaPago) {
        Document document = new Document();
        String rutaC = String.format("C:\\DOO\\TicketPedido %s %s%s.pdf", cliente.getNombre(), cliente.getApellido(), pedido.getIdPedido());
        try {
            PdfWriter.getInstance(document, new FileOutputStream(rutaC));

            document.open();

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("HogarTech SA", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            document.add(new Chunk(new LineSeparator()));

            Font textoFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
            document.add(new Paragraph("Ticket de Pedido", textoFont));
            document.add(new Paragraph("Cliente: " + cliente.getNombre() + " " + cliente.getApellido(), textoFont));
            document.add(new Paragraph("DNI: " + cliente.getDni(), textoFont));
            document.add(new Paragraph("Domicilio: " + cliente.getDomicilio(), textoFont));
            document.add(new Paragraph("Fecha del Pedido: " + pedido.getFecha(), textoFont));
            document.add(new Paragraph("Forma de Pago: " + formaPago, textoFont));
            document.add(new Paragraph("Número de Ticket: " + numTicket, textoFont));
            document.add(new Paragraph("Fecha de Transacción: " + fechaTransaccion, textoFont));
            document.add(new Paragraph(" "));

            document.add(new Paragraph("Detalle del Pedido:", textoFont));
            for (DetallePedidoDto detalle : detallePedidoList) {
                document.add(new Paragraph(
                        "Producto: " + detalle.getNombreProducto() +
                                ", Cantidad: " + detalle.getCantidad() +
                                ", Precio Unitario: " + detalle.getPrecioUnitario() +
                                ", Subtotal: " + detalle.getPrecioTotal(),
                        textoFont));
            }

            document.add(new Paragraph("Total del Pedido: " + pedido.getImporte(), textoFont));

            document.close();
            return "Ticket guardado en: " + rutaC;
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
