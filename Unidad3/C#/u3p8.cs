using System;

class Program
{
    static void Main()
    {
        Console.Write("Ingrese el primer número: ");
        double numero1 = double.Parse(Console.ReadLine());
        Console.Write("Ingrese el segundo número: ");
        double numero2 = double.Parse(Console.ReadLine());

        if (numero1 > numero2)
        {
            Console.WriteLine("El primer número es mayor.");
        }
        else if (numero2 > numero1)
        {
            Console.WriteLine("El segundo número es mayor.");
        }
        else
        {
            Console.WriteLine("Ambos números son iguales.");
        }
    }
}
