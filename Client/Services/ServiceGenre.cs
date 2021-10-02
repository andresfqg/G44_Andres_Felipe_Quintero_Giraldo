using Sprint3.Shared.Entity;
using System.Collections.Generic;

namespace Sprint3.Client.Services
{
    public class ServiceGenre: IServiceGenre
    {
        public List<Genre>GetGenres(){
            return new List<Genre>(){
                new Genre(){MovieGenre=MovieGenre.Comedia},
                new Genre(){MovieGenre=MovieGenre.Animadas},
                new Genre(){MovieGenre=MovieGenre.Comedia},
                new Genre(){MovieGenre=MovieGenre.Animadas},
                new Genre(){MovieGenre=MovieGenre.Documentales},
                new Genre(){MovieGenre=MovieGenre.Aventura},
                new Genre(){MovieGenre=MovieGenre.Comedia},
                new Genre(){MovieGenre=MovieGenre.Aventura},
                new Genre(){MovieGenre=MovieGenre.Documentales},
                new Genre(){MovieGenre=MovieGenre.Comedia}
            };
        }
    }
}