using System;

namespace u3p3

    internal class Program
    {       
            public static void Main(String[] args)
            {
                int dia;
                Console.Write("Escribe el dia de la semana numerico ");
                dia = Convert.ToInt32(Console.ReadLine());
                switch (dia)
                {
                    case 1:
                        Console.WriteLine("Lunes");
                        break;
                    case 2:
                        Console.WriteLine("Martes");
                        break;
                    case 3:
                        Console.WriteLine("Miercoles");
                        break;
                    case 4:
                        Console.WriteLine("Jueves");
                        break;
                    case 5:
                        Console.WriteLine("Viernes");
                        break;
                    case 6:
                        Console.WriteLine("Sabado");
                        break;
                    case 7:
                        Console.WriteLine("Domingo");
                        break;
                      default:
                        Console.WriteLine("No existe el dia ingresado");
                      break;
        }
            }
}   


