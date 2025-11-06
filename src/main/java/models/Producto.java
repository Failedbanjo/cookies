package models;

public class Producto {
    //Encapsulamos y declaramos las variables del objeto producto
    private Long idProducto;
    private String nombre;
    private String tipo;
    private double precio;

    //Constructor vacio
    public Producto() {
    }

    //Contructor con parametros
    public Producto(Long idProducto, String nombre, String tipo, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    //Metodos Getters y Setters de las variables
    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

