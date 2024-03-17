package bellows;

public class OmegaShapeBellow extends AllBellows {
    protected OmegaShapeBellow(int newCorrugtionAmount, double newCorrugationHeight, String newMaterial, double newBasicLength) {
        super(newCorrugtionAmount, newCorrugationHeight, newMaterial, newBasicLength);
    }

    public static void main(String[] args) {
        OmegaShapeBellow newBellow = new OmegaShapeBellow(9,20,"steel",200);
        newBellow.setBasicLength(250.0);
        System.out.println("Basic length="+newBellow.getBasicLength());
        newBellow.expansion();
    }
}
