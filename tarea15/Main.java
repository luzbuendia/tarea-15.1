package tarea15;
public class Main 
{
    public static void main(String args[])
    {
    DocenteControlador  docenteControlador = new DocenteControlador(3);
     docenteControlador.crear("alejandra","Perez", 56985666, 1999, 2022, "doctorado", " programador");
     docenteControlador.crear("Pablo","Ramirez", 65546672, 1997, 2022, "licenciado", "diseñador web");
     docenteControlador.crear("Robert","Lino", 78598623, 1991, 2022, "Magister", "fisico");
     
     System.out.println("------------- Lista de Docente -------------");
     docenteControlador.listar2();

      System.out.println("------------- Buscar Docente -------------");

        int dni = 65546672;

        Docente encontrado;

        encontrado = docenteControlador.buscar(dni);

        if(encontrado != null)
        {
            System.out.println("docente encontrado: "+encontrado.getNombre());
        }
        else {

            System.out.println("No se encontro: "+dni);
        }

     AlumnoControlador  alumnoControlador = new AlumnoControlador(2);
     alumnoControlador.crear1("Jose", "Rojas", 656275783, 1998,2022, 201956768 );
     alumnoControlador.crear1("Maria", "Palacios", 256985987, 1995,2022, 201656768 );
     
     System.out.println("------------- Lista de Alumno-------------");
     alumnoControlador.listar2();

     System.out.println("------------- Buscar Alumno-------------");

        int dni1 = 656275783;

        Alumno eureka;

        eureka = alumnoControlador.buscar(dni1);

        if(eureka != null)
        {
            System.out.println("Alumno encontrado: "+eureka.getNombre());
        }
        else {

            System.out.println("No se encontro: "+dni1);
        }
    }
}
