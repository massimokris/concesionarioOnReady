package Concesionario;

public abstract class Vehiculo implements Comparable<Vehiculo>{
    private String marca;
    private String modelo;
    private Double precio;

    //constructor
    public Vehiculo(String marca, String modelo , Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }
    //fin constructor

    //getter and setter

    //marca
    public void setMarca(String marca) {
        if(marca.length() <= 0)
            System.out.println("Marca no valida");
        else
            this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    //fin marca

    //modelo
    public void setModelo(String modelo) {
        if(modelo.length() <= 0)
            System.out.println("Modelo no valido");
        else
            this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    //fin modelo

    //Precio
    public void setPrecio(Double precio) {
        if(precio <= 0){
            System.out.println("Precio no valido");
        }else{

            this.precio = precio;
        }
    }

    public Double getPrecio() {

        return precio;
    }
    //fin precio

    //fin getter and setter

    @Override
    public int compareTo(Vehiculo automotor){
        return automotor.getPrecio().compareTo(getPrecio());
    }
}