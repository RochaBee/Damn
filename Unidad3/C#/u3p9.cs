using System;

class Program
{
    static void Main()
    {
        Console.Write("Ingrese la hora de entrada: ");
        int horaEntrada = int.Parse(Console.ReadLine());
        Console.Write("Ingrese la hora de salida: ");
        int horaSalida = int.Parse(Console.ReadLine());

        int horasEstacionamiento = horaSalida - horaEntrada;
        double costo = 0;

        if (horasEstacionamiento <= 2)
        {
            costo = horasEstacionamiento * 5.0;
        }
        else if (horasEstacionamiento <= 5)
        {
            costo = 2 * 5.0 + (horasEstacionamiento - 2) * 4.0;
        }
        else if (horasEstacionamiento <= 10)
        {
            costo = 2 * 5.0 + 3 * 4.0 + (horasEstacionamiento - 5) * 3.0;
        }
        else
        {
            costo = 2 * 5.0 + 3 * 4.0 + 5 * 3.0 + (horasEstacionamiento - 10) * 2.0;
        }

        Console.WriteLine("El costo de estacionamiento es: $" + costo);
    }
}