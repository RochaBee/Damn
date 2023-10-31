using System;
class Program
{
    static void Main()
    {
        int total, num, negativos = 0, positivos = 0;
        Console.WriteLine("Ingresa el total de numeros a procesar: ");
        total = Convert.ToInt32(Console.ReadLine());

        for (int c = 1; c <= total; c++)
        {
            Console.WriteLine("Ingresa tu numero: ");
            num = Convert.ToInt32(Console.ReadLine());
            if (num > 0)
            {
                positivos++;
            }
            else if (num < 0)
            {
                negativos++;
            }
            Console.WriteLine("Cantidad de numeros Positivos=" + positivos);
            Console.WriteLine("Cantidad de numeros Negativos=" + negativos);
        }
    }
}
