using System;

class program
{
    static void Main()
    {
        Console.Write("Ingrese un número entero: ");
        int numero = int.Parse(Console.ReadLine());

        if (numero % 2 == 0)
        {
            Console.WriteLine("Es un número par.");
        }
        else
        {
            Console.WriteLine("Es un número impar.");
        }
    }
}
