package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Producto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
//Ponemos las 2 rutas que se van a implementar
@WebServlet ("/producto.xls")
public class ProductoXlsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Se crea un nuevo objeto llamado service con la clase que implementó la interfaz
        ProductoServices service = new ProductosServicesImplement();

        //se crea una lista llamando al metodo listar de mi interfaz
        List<Producto>productos = service.listar();
        resp.setContentType("text/html;charset=UTF-8");
        //String servletPath = req.getServletPath();
        //boolean esXls = servletPath.endsWith();

        try(PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='utf-8'>");
            out.println("<title>listado producto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listado de Productos</h1>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>ID PRODUCTO</th>");
            out.println("<th>NOMBRE</th>");
            out.println("<th>TIPO</th>");
            out.println("<th>PRECIO</th>");
            out.println("</tr>");
            productos.forEach(p ->{
                out.println("<tr>");
                out.print("<td>" + p.getIdProducto() + "</td>");
                out.print("<td>" + p.getNombre() + "</td>");
                out.print("<td>" + p.getTipo() + "</td>");
                out.print("<td>" + p.getPrecio() + "</td>");
                out.println("</tr>");
            });
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
