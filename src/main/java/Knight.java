public class Knight extends Warrior {
    final int ATTACK = 7;

    @Override
    public int getAttack() {
        return this.ATTACK;
    }

    @Override
    public int getHealth() {
        return this.health;
    }
}
