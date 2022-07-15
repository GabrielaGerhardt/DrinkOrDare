package Project.interfaces;

public interface IPlayerField {

    /**
     * @return counter, which is 2 by default, because the minimum amount of players is 2.
     */

    int getCount();

    /**
     * counter gets increased by 1 every time a new Player Field is added.
     */
    void increaseCount();

    /**
     * The standard number of players is 2. This method adds a new player field, if you want to play with more than 2 players.
     */
    int addPlayerField();
}
