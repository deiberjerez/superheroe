public class DonForce extends Hero implements Actionhuman{
    //6 atributos
    String nombre = "DonForce";
    String traje = "rojo y negro";
    int pesoQuePuedeLevantar = 1000;
    String planeta = "kakaroto";
    String debilidad = "mercurio";
    String oponente = "insectoide";
    String objeto;

    public DonForce(int health, int energy) {
        super(health, energy);
    }

    //3 metodos
    public void capacidadMaximaDeCarga(){
        System.out.println(nombre + " puede cargar cualquier cosa que pese menos de " + pesoQuePuedeLevantar);
    }
    public String romperObjeto(String objeto) {
        return "romper " + objeto + " con una fuerza de " + pesoQuePuedeLevantar + " toneladas.";
    }
    public String saltoSupersonico() {
        return nombre + " realice un salto supersónico y aterriza a kilómetros de distancia.";

    }

    //metodo de ataque
    public void ataque(){
        System.out.println(nombre + "tenia una vida de " + getHealth());
        setHealth(getHealth() - 20 );
        System.out.println("y ahora tiene " + getHealth());
    }
    //1 superpoder
    public void superPoder(){
        this.usarManos();
        this.usarPies();
        setEnergy(getEnergy() - 20);
        System.out.println("el super heroe le queda una enrgia de " + getEnergy());
    }

    @Override
    public void usarManos(){
        System.out.println("usar manos para " + romperObjeto("una pared"));
    }


    @Override
    public void usarPies() {
        System.out.println("usar pies para que " + saltoSupersonico());
    }

    @Override
    public void moverse() {

    }

    @Override
    public void saltar() {

    }

    @Override
    public void hablar() {

    }
}
