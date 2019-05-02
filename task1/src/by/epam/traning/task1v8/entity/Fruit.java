package by.epam.traning.task1v8.entity;

/**
 */
public abstract class Fruit extends Vegetable {
    /**
     */
    private boolean isHaveStone = false;

    /**
     * @return false if dint have a stone or true if have.
     */
    public boolean isHaveStone() {
        return isHaveStone;
    }

    /**
     * @param vegetableIsHaveStone establishes the presence of bone.
     */
    public void setHaveStone(final boolean vegetableIsHaveStone) {
        isHaveStone = vegetableIsHaveStone;
    }

}
