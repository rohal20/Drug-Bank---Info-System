package Drugs;

/** the binary node class created nodes for
 * the item named Drug to perform certain
 * operations upon those.
 *
 */

public class BinaryNode {
    Drug item;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode (BinaryNode left, Drug item, BinaryNode right){
        this.item = item;
        this.left = left;
        this.right = right;
    }

    public void displayNode() {
        item.displayDrug();
    }
}
