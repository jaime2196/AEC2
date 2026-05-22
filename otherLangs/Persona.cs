namespace Es.Senoret.Atraccion
{
    /// <summary>
    /// Datos básicos de una persona, de momento usada por la clase Visitante y EmpleadoEvento 
    /// </summary>
    public class Persona
    {
        public int ID { get; set; }
        
        public string Nombre { get; set; }
        
        public string Apellido { get; set; }
        
        public string Sexo { get; set; }

        // Constructor
        public Persona(int id, string nombre, string apellido, string sexo)
        {
            ID = id;
            Nombre = nombre;
            Apellido = apellido;
            Sexo = sexo;
        }
    }
}