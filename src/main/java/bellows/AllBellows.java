package bellows;
import java.util.Scanner;
public class AllBellows {
    Scanner in = new Scanner(System.in);
    protected int corrugationAmount;
    protected double corrugationHeight;
    protected String material;
    protected double basicLength;
    protected AllBellows(int newCorrugtionAmount, double newCorrugationHeight, String newMaterial, double newBasicLength){
        corrugationAmount=newCorrugtionAmount;
        corrugationHeight=newCorrugationHeight;
        material=newMaterial;
        basicLength=newBasicLength;
    }

    public double getBasicLength() {
        return basicLength;
    }

    public void setBasicLength(double basicLength) {
        this.basicLength = basicLength;
    }

    public int getCorrugationAmount() {
        return corrugationAmount;
    }

    public void setCorrugationAmount(int corrugationAmount) {
        this.corrugationAmount = corrugationAmount;
    }

    public double getCorrugationHeight() {
        return corrugationHeight;
    }

    public void setCorrugationHeight(double corrugationHeight) {
        this.corrugationHeight = corrugationHeight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void explode(){
        System.out.println("boom");
    }
    public void expansion(){
        System.out.println("Enter length alteration");
        double alteration = in.nextDouble();
        System.out.println("Total length after alteration="+(basicLength+alteration));
    }
}
