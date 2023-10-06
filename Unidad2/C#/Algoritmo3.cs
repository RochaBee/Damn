using System;

class Program
{
    static void Main()
    {
        int baseTriangulo, alturaTriangulo, areaTriangulo, perimetroTriangulo;
        // Solicitar al usuario la base y la altura del triángulo
        Console.Write("Ingrese la base del triángulo: ");
        baseTriangulo = int.Parse(Console.ReadLine());

        Console.Write("Ingrese la altura del triángulo: ");
        alturaTriangulo = int.Parse(Console.ReadLine());

        // Calcular el área del triángulo
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        // Calcular el perímetro del triángulo
        perimetroTriangulo = 3 * baseTriangulo;

        // Mostrar los resultados
        Console.WriteLine("El área del triángulo es: " + areaTriangulo);
        Console.WriteLine("El perímetro del triángulo (suponiendo equilátero) es: " + perimetroTriangulo);

        //Presione una tecla para salir
        Console.ReadKey();
    }

    private static void Write(string v)
    {
        throw new NotImplementedException();
    }
}
