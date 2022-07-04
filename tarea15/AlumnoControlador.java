package tarea15;

public class AlumnoControlador 
{
   private Alumno alumno[];
   private int contador;
   public AlumnoControlador(int size)
   
    {
        this.alumno = new Alumno[size];

        this.contador = 0;
    }

    public void crear1(String nombre,String apellido,int dni, Integer fechaNacimiento, Integer anActual, int codigo)
    {
        this.alumno[this.contador] = new Alumno( nombre,apellido, dni,fechaNacimiento,  anActual, codigo );

        this.contador++;
    }

    public Alumno buscar(int dni)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.alumno[i].getDni()==(dni))
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.alumno[i];
        }
    }

    
    public void listar2()
    {
        for(int i=0; i<this.contador; i++)
        {
            //System.out.println(this.cliente[i].getNombres());

            this.alumno[i].listarAlumno();
        }
    }
   
    
}


   