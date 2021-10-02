using System;
using Sprint3.Shared.Entity;
using System.Collections.Generic;

namespace Sprint3.Client.Services
{
    public class ServiceMovie: IServiceMovie 
    {
        public List<Movie>GetMovies(){
            return new List<Movie>(){
                new Movie(){MovieName="Jungle Cruise", Image="Images/Movie1.jpg", Genre="Genero: Aventura/Acción", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Spiderman", Image="Images/Movie2.jpg", Genre="Genero: Acción ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Rapidos y furiosos 9", Image="Images/Movie3.jpg", Genre="Genero: Acción ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Vanguard ", Image="Images/Movie4.jpg", Genre="Genero: Acción ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Free Guy", Image="Images/Movie5.jpg", Genre="Genero: Comedia ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Duro de cuidar 2", Image="Images/Movie6.jpg", Genre="Genero: Acción/comedia ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Son como niños 2", Image="Images/Movie7.jpg", Genre="Genero: Comedia", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Atentado en el estadio", Image="Images/Movie8.jpg", Genre="Genero: Acción", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Bad voys for life", Image="Images/Movie9.jpg", Genre="Genero: Acción ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Origen", Image="Images/Movie10.jpg", Genre="Genero: Suspenso", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Coco", Image="Images/Movie11.jpg", Genre="Genero: Animada ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},
                new Movie(){MovieName="Raya", Image="Images/Movie12.jpg", Genre="Genero: Animada ", Synopsis="trama", Raiting = "Calificación: 4.5", MovieReleaseDate=new DateTime(2021,09,26)},

            };
        }
    }
}