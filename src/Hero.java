public class Hero{
    int Health;
    int Energy;
    //constructor

    public Hero(int health, int energy) {
        Health = health;
        Energy = energy;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getEnergy() {
        return Energy;
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }
}
