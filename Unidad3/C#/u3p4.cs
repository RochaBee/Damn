using System;

namespace u3p4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int dia;
            Console.WriteLine("Programa para los meses del año.");
            Console.WriteLine("Introdusca un número para saber que mes es: ");
            dia = Convert.ToInt32(Console.ReadLine());
            switch (dia)
            {
                case 1:
                    Console.WriteLine("Es enero");
                    break;
                case 2:
                    Console.WriteLine("Es febrero");
                    break;
                case 3:
                    Console.WriteLine("Es marzo");
                    break;
                case 4:
                    Console.WriteLine("Es abril");
                    break;
                case 5:
                    Console.WriteLine("Es mayo");
                    break;
                case 6:
                    Console.WriteLine("Es junio");
                    break;
                case 7:
                    Console.WriteLine("Es julio");
                    break;
                case 8:
                    Console.WriteLine("Es agosto");
                    break;
                case 9:
                    Console.WriteLine("Es sepetiembre");
                    break;
                case 10:
                    Console.WriteLine("Es octubre");
                    break;
                case 11:
                    Console.WriteLine("Es noviembre");
                    break;
                case 12:
                    Console.WriteLine("Es diciembre");
                    break;
            }
        }
    }
}
