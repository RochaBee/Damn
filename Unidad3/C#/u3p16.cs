using System;

class Program
{
    static void Main()
    {
        int c = 1, hrs, pago, sueldo;
        while (c <= 20)
        {
            Console.WriteLine("Captura las horas trabajadas");
            hrs = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Captura el pago por horas");
            pago = Convert.ToInt32(Console.ReadLine());

            sueldo = hrs * pago;
            Console.WriteLine("Tu sueldo es: " + sueldo);
            c++;
        }
    }
}