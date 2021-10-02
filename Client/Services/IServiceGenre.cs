using Sprint3.Shared.Entity;
using System.Collections.Generic;

namespace Sprint3.Client.Services
{
    public interface IServiceGenre
    {
         List <Genre> GetGenres();
    }
}