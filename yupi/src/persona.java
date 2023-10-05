public class persona {
    String nombre;
    String apellido;
    String CI;
    int edad;
    public persona (String nombre, String apellido, String CI, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.apellido=apellido;
        this.CI=CI;
        this.edad=edad;
    }
    void imrpimir(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Carnet de identidad: " +CI);
        System.out.println("Año de nacimiento: " +edad);
    }
}
