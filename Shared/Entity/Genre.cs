using System;
using System.Security.AccessControl;
using System.ComponentModel.DataAnnotations;
namespace Sprint3.Shared.Entity
{
    public class Genre
    {
       public int Id {get;set;}
       [Required(ErrorMessage = "El campo {0} es requerido")]
       public MovieGenre MovieGenre{get;set;}
    }

    public enum MovieGenre{
        Comedia = 0,
        Suspenso = 1,
        Drama = 2,
        Terror = 3,
        Documentales = 4,
        Musicales = 5,
        Accion = 6,
        Animadas = 7,
        Aventura = 8,
        Misterio =9
    }
}