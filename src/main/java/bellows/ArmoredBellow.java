package bellows;

public class ArmoredBellow extends AllBellows {
    protected ArmoredBellow(int newCorrugtionAmount, double newCorrugationHeight, String newMaterial, double newBasicLength) {
        super(newCorrugtionAmount, newCorrugationHeight, newMaterial, newBasicLength);
    }

    public static void main(String[] args) {
        ArmoredBellow newBellow = new ArmoredBellow(10,25.5,"AISI 321",320);
        newBellow.explode();
    }
}
