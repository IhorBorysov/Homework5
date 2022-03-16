public class Warrior_3 extends Warrior {
    public Warrior_3(String fname, int hp, String arsenal, int damag) {
        setFname(fname);
        setHp(hp);
        setArsenal(arsenal);
        setDamag(damag);
    }

    void voin() {
        System.out.println(getFname() + '\n' + "Hp: " + getHp() + '\n' + "Зброя: " + getArsenal() + "(" + getDamag() + ")" + '\n');
    }
}
