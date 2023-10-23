using System;

namespace u3p2
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int C1, C2, C3, C4, C5, C6, promedio;
            Console.WriteLine("Ingresa la 1ra calificación ");
            C1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("ingresa la 2da calificación ");
            C2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingresa la 3ra calificación ");
            C3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingresa la 4ta calificación ");
            C4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingresa la 5ta calificación ");
            C5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingresa la 6ta calificación ");
            C6 = Convert.ToInt32(Console.ReadLine());

            promedio = (C1 + C2 + C3 + C4 + C5 + C6) / 6;
            Console.WriteLine("Tu calificacion es de: " + promedio);
            if (promedio >= 70)
            {
                Console.WriteLine("Aprobado");
            }
            else
            {
                Console.WriteLine("Reprobado");
            }
        }
    }
}