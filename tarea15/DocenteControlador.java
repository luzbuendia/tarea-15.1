package tarea15;

public class DocenteControlador 
{
    private Docente docente[];
    private int contador;
    public DocenteControlador(int size)
    
     {
         this.docente = new Docente[size];
 
         this.contador = 0;
     }
 
    public void crear(String nombre,String apellido,int dni, Integer fechaNacimiento, Integer anActual, String grado,String titulo)
    {
       this.docente[this.contador] = new Docente( nombre,apellido, dni,  fechaNacimiento,  anActual, grado,titulo );
 
       this.contador++;
    }
    public Docente buscar(int dni)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.docente[i].getDni()==(dni))
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.docente[i];
        }
    }

    
    public void listar2()
    {
        for(int i=0; i<this.contador; i++)
        {
            this.docente[i].listarDocente();
        }
    }

    
    
     
}
