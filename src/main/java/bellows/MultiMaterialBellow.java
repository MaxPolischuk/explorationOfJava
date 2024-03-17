package bellows;

public class MultiMaterialBellow extends AllBellows {
    public String secondMaterial;
    protected MultiMaterialBellow(int newCorrugtionAmount, double newCorrugationHeight, String newMaterial, double newBasicLength,String secondMaterial) {
        super(newCorrugtionAmount, newCorrugationHeight, newMaterial, newBasicLength);
    }

    public static void main(String[] args) {
        MultiMaterialBellow newBellow = new MultiMaterialBellow(7,16.7,"AISI 321",320,"Titanium");
        newBellow.setCorrugationAmount(11);
        System.out.println("Corrugation amount = "+newBellow.getCorrugationAmount());
    }
}
