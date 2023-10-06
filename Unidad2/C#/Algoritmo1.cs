using System;

namespace Algoritmo1
{
    class Program
    {
        static void Main()
        {
            // Definir variables
            int promedio, calificacion1, calificacion2, calificacion3, calificacion4, calificacion5, calificacion6;

            // Solicitar al usuario que ingrese las calificaciones una por una
            Console.Write("Ingrese la calificación 1: ");
            calificacion1 = int.Parse(Console.ReadLine());

            Console.Write("Ingrese la calificación 2: ");
            calificacion2 = int.Parse(Console.ReadLine());

            Console.Write("Ingrese la calificación 3: ");
            calificacion3 = int.Parse(Console.ReadLine());

            Console.Write("Ingrese la calificación 4: ");
            calificacion4 = int.Parse(Console.ReadLine());

            Console.Write("Ingrese la calificación 5: ");
            calificacion5 = int.Parse(Console.ReadLine());

            Console.Write("Ingrese la calificación 6: ");
            calificacion6 = int.Parse(Console.ReadLine());

            // Calcular el promedio
            promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5 + calificacion6) / 6;

            // Mostrar el resultado
            Console.WriteLine("El promedio de las calificaciones es: " + promedio);

            // Esperar a que el usuario presione una tecla para salir
            Console.ReadKey();
        }
    }
}