using System;

namespace u3p1
{
    internal class program
    {
        static void Main(string[] args)
        {
            int edad;
            Console.WriteLine("¿Qué edad tienes?");
            edad = Convert.ToInt32(Console.ReadLine());
            if (edad >= 18)
                Console.WriteLine("Eres mayor de edad");
            else
                Console.WriteLine("Eres menor de edad");

        }
    }
}