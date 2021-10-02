using System.Security.AccessControl;
using Sprint3.Shared.Entity;
using System.Collections.Generic;
using System;

namespace Sprint3.Client.Services
{
    public class ServiceActor: IServiceActor
    {
        public List<Actor>GetActors(){
            return new List<Actor>(){
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)},
            new Actor(){ActorName = "Actor1", Gender =Gender.Masculino, Nationality = "Colombiano", Biography= "biografia", DateOfBirth=new DateTime(1950,12,03)}
        };
      }
    }
}