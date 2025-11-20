public class Game
{
    public static void main(String[] args){
        Character hero = new Character("Kamado Tanjiro ",50,50,5) ;
        Character monster = new Character("Kibutsuji Muzan",50,65,5) ;

        System.out.println("\n> -- Starting Combat -- <\n") ;

        hero.attack(monster) ;
        System.out.println(monster.getName() + " HP remaining: " + monster.getHealthPoints() + "\n") ;

        monster.attack(hero) ;
    }
}