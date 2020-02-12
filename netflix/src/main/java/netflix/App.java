package netflix;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

interface IReproducible{
    public void iniciar();
    public void pausar();
    public void Adelantar();
    public void Retroceder();
}

abstract class Contenido{
    public String Titulo;
    public String Descripcion;
    public String Fecha;
    public String Director;
    public String Productora;

    Contenido (Titulo, Descripcion, Fecha, Director, Productora){
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Director = Director;
        this.Productora = Productora;
    }
}


public class Pelicula implements IReproducible{
   
    }

}

class Series{

}

class Capitulos implements IReproducible{

}









