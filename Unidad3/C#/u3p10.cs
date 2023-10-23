using System;

class Program
{
    static void Main()
    {
        Console.Write("Ingrese las horas trabajadas: ");
        double horasTrabajadas = double.Parse(Console.ReadLine());
        Console.Write("Ingrese el pago por hora: $");
        double pagoPorHora = double.Parse(Console.ReadLine());

        double sueldo = horasTrabajadas * pagoPorHora;
        if (horasTrabajadas > 40)
        {
            double horasExtras = horasTrabajadas - 40;
            double pagoHorasExtras = horasExtras * (pagoPorHora * 2);
            sueldo += pagoHorasExtras;
        }

        Console.WriteLine("El sueldo semanal es: $" + sueldo);
    }
}
