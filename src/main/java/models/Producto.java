package models;

/**
 * Clase Producto que representa un objeto con sus atributos básicos:
 * id del producto, nombre, tipo y precio.
 *
 * @author Jair Patiño
 * @version 1.0
 * @since 2025-11-06
 *
 * Descripción:
 * Esta clase se utiliza para modelar los datos de un producto dentro del sistema,
 * permitiendo almacenar y acceder a su información de manera encapsulada mediante
 * métodos getters y setters.
 */
public class Producto {
    /** Identificador único del producto */
    private Long idProducto;
    /** Nombre del producto */
    private String nombre;
    /** Tipo o categoría del producto */
    private String tipo;
    /** Precio del producto */
    private double precio;

    /**
     * Constructor vacío de la clase Producto.
     *
     * Se utiliza cuando se requiere crear un objeto sin inicializar sus atributos
     * de manera inmediata.
     */
    public Producto() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param idProducto Identificador del producto.
     * @param nombre Nombre del producto.
     * @param tipo Tipo o categoría del producto.
     * @param precio Precio del producto.
     *
     * Este constructor permite inicializar todos los atributos de la clase
     * en el momento de la creación del objeto.
     */
    public Producto(Long idProducto, String nombre, String tipo, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    /**
     * Obtiene el ID del producto.
     * @return idProducto
     */
    public Long getIdProducto() {
        return idProducto;
    }

    /**
     * Asigna un nuevo ID al producto.
     * @param idProducto Identificador único del producto.
     */
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Obtiene el nombre del producto.
     * @return nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nombre al producto.
     * @param nombre Nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo o categoría del producto.
     * @return tipo del producto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Asigna el tipo o categoría del producto.
     * @param tipo Tipo del producto.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el precio del producto.
     * @return precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Asigna un precio al producto.
     * @param precio Precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}