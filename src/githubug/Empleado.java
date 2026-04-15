/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubug;

/**
 *
 * @author UMG
 */
public class Empleado {
    int id;
    String nombre;
    String apellido;
    String direccion;
    double salario;

    public Empleado() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.salario = 0;
        
        
                
    }

    public Empleado(int id, String nombre, String apellido, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

 
    
    public void CalcularSalario(){
        if (salario < 5000){
        System.out.println("Gana bien :)");
    }
    }
    
}
