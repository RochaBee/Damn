using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Ingrese la cantidad de números a evaluar:");
        int cantidadNumeros = Convert.ToInt32(Console.ReadLine());
        int cero = 0, mayores = 0, menores = 0;
        for (int i = 0; i < cantidadNumeros; i++)
        {
            Console.WriteLine("Ingrese un número:");
            int numero = Convert.ToInt32(Console.ReadLine());
            if (numero == 0)
            {
                cero++;
            }
            else if (numero > 0)
            {
                mayores++;
            }
            else
            {
                menores++;
            }
        }
        Console.WriteLine("Cantidad de ceros: " + cero);
        Console.WriteLine("Cantidad mayores a cero: " + mayores);
        Console.WriteLine("Cantidad menores a cero: " + menores);
    }
}