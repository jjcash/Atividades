using System;
using RPG.src.Entities;
namespace RPG{
    class Program{
        static void Main(string[] args){
            Knight knight = new Knight("Gladio", 15, "Knight", 100, 100);
            Wizard wizard = new Wizard("Ignis", 18, "White Wizard", 100, 100);
            Ninja ninja = new Ninja("Prompto", 1, "Ninja", 100, 60);
            Bwizard bwizard = new Bwizard("Noctis", 25, "Black Wizard", 100, 75); 
            Console.WriteLine(knight.Attack());
            Console.WriteLine(wizard.Attack(15));
            Console.WriteLine(bwizard.Attack(5));
            Console.WriteLine(ninja.Attack());
        }
    }
}