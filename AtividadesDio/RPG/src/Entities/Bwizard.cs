namespace RPG.src.Entities
{
    public class Bwizard : Hero
    {
        public Bwizard(string Name, int Level, string HeroType, int Hp, int Mp)
        {
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;
            this.Hp = Hp;
            this.Mp = Mp; 
        }

        public int Mp;
        public string Attack(int bonus){

            if (bonus > 6){
                return this.Name+" Lançou uma magia super efetiva com bonus de "+ bonus;
            }else{
                return this.Name+" Lançou uma magia mais fraca com bonus de "+ bonus;
            }   
        } 
    }
}