namespace RPG.src.Entities
{
    public class Ninja : Hero
    {
        public Ninja(string Name, int Level, string HeroType, int Hp, int Sp){
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;
            this.Hp = Hp;
            this.Sp = Sp;
        }
    }
}