using System;

class Program
{
    static void Main()
    {
        char opcion;
        do
        {
            Console.WriteLine("Bienvenido  a una sola ejecucion");
            Console.WriteLine("Escribe n para salir!!");
            opcion = Convert.ToChar(Console.ReadLine());
        } while (opcion != 'n');
    }
}
