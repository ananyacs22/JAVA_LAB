abstract class EnergySource {
     String sourceID;
     String sourceName;
     double energyGenerated;
       public EnergySource(String sourceID, String sourceName, double energyGenerated) {
        this.sourceID = sourceID;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }
    public abstract double calculateEfficiency();
    public void displayDetails() {
        System.out.println("Source ID: " + sourceID);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.printf("Efficiency: %.2f%%\n", calculateEfficiency());
        System.out.println("------------------------------------");
    }
}
class SolarEnergy extends EnergySource {
    public SolarEnergy(String sourceID, String sourceName, double energyGenerated) {
        super(sourceID, sourceName, energyGenerated);
    }
    @Override
    public double calculateEfficiency() {
        return (energyGenerated / 5000.0) * 100.0;
    }
}
class WindEnergy extends EnergySource {
        public WindEnergy(String sourceID, String sourceName, double energyGenerated) {
        super(sourceID, sourceName, energyGenerated);
    }
    @Override
    public double calculateEfficiency() {
        return (energyGenerated / 8000.0) * 100.0;
    }
}
public class EnergyManagement {
    public static void main(String[] args) {
            EnergySource sourceRef;
    sourceRef = new SolarEnergy("SOL-101", "Sahara Solar Farm", 50000.0);
        sourceRef.displayDetails(); 
        sourceRef = new WindEnergy("WND-202", "North Sea Wind Turbine", 75000.0);
        sourceRef.displayDetails(); 
        System.out.println("ANANYA");
        System.out.println("1WA25CS033");
        
    }
}
