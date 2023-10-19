using System;

namespace U3p5
{
    class Program
    {
        static void Main(string[] args)
        {
            double p1, p2, p3, total;
            Console.WriteLine("Ingrsa el valor del producto 1: ");
            p1 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingrsa el valor del producto 3: ");
            p2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingrsa el valor del producto 4: ");
            p3 = Convert.ToDouble(Console.ReadLine());
            total = p1 + p2 + p3;
            if (total >= 1500)
            {
                total = total - (total * 0.30);
                Console.WriteLine("El total de su compra (-30%): " + total);
            }
            else if (total < 1500 && total > 1000)
            {
                total = total - (total * 0.20);
                Console.WriteLine("El total de su compra (-20%): " + total);
            }
            else if (total < 1000 && total > 700)
            {
                total = total - (total * 0.10);
                Console.WriteLine("El total de su compra (-10%): " + total);
            }
            else
            {
                Console.WriteLine("El total de su compra (-0%): " + total);
            }
        }
    }
}
