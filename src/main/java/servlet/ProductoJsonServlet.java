package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Producto;
import service.ProductoServices;
import service.ProductosServicesImplement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Clase ProductoJsonServlet.
 *
 * @author Genesis Escobar
 * @version 1.0
 * @since 2025-11-06
 *
 * Descripción:
 * Este servlet genera una respuesta en formato JSON con el listado de productos.
 * Utiliza la implementación de {ProductoServices} para obtener los datos
 * y los devuelve estructurados de forma manual en formato JSON.
 *
 * La clase está asociada a la ruta <b>/productojson</b> mediante la anotación
 * {WebServlet}, permitiendo acceder a ella desde un navegador o cliente HTTP.
 */
@WebServlet("/productojson")
public class ProductoJsonServlet extends HttpServlet {

    /**
     * Metodo que gestiona las peticiones HTTP GET.
     *
     * @param req  Objeto {HttpServletRequest} que contiene la información
     *             de la solicitud del cliente.
     * @param resp Objeto {HttpServletResponse} que permite enviar la respuesta
     *             al cliente.
     * @throws ServletException Si ocurre un error relacionado con el servlet.
     * @throws IOException Si ocurre un error de entrada o salida al procesar la respuesta.
     *
     * Descripción:
     * Este metodo obtiene la lista de productos desde el servicio
     * {ProductosServicesImplement} y construye manualmente un arreglo JSON.
     * Luego, envía este contenido al cliente estableciendo el encabezado
     * {Content-Type} como <i>application/json</i>.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Se crea un objeto del servicio que implementa la interfaz ProductoServices
        ProductoServices service = new ProductosServicesImplement();

        // Se obtiene la lista de productos
        List<Producto> productos = service.listar();

        // Indicamos que la respuesta tendrá formato JSON
        resp.setContentType("application/json;charset=UTF-8");

        // Generamos la salida JSON manualmente
        try (PrintWriter out = resp.getWriter()) {
            out.println("[");
            for (int i = 0; i < productos.size(); i++) {
                Producto p = productos.get(i);
                out.println("  {");
                out.println("    \"idProducto\": " + p.getIdProducto() + ",");
                out.println("    \"nombre\": \"" + p.getNombre() + "\",");
                out.println("    \"tipo\": \"" + p.getTipo() + "\",");
                out.println("    \"precio\": " + p.getPrecio());
                out.print("  }");
                // Si no es el último elemento, se agrega una coma
                if (i < productos.size() - 1) {
                    out.println(",");
                } else {
                    out.println();
                }
            }
            out.println("]");
        }
    }
}

