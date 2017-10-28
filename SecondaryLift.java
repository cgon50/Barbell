import java.lang.Math;

public class SecondaryLift{

	private String name;
	private int repMax;
	private int[] numReps;
	private float[] weightScales;
	private final double T_MAX = .9;
	
	public SecondaryLift(String name, int repMax, int[] numReps, float[] weightScales){
		this.name = name;
		this.repMax = repMax;
		this.numReps = numReps;
		this.weightScales = weightScales;
	}
	
	public String getName(){
		return name;
	}
	
	public int getRepMax(){
		return repMax;
	}
	
	public void setMax(int n){
		repMax = n;
	}
	
	public int getTMax(){
		return (int)(T_MAX * repMax);
	}
	
	public int[] getPrimaryDay(){
		int[] weights = new int[weightScales.length];
		
		for(int i = 0; i < weights.length; i++){
			weights[i] = (int) (getTMax() * weightScales[i]);
		}
		return weights;
	}
	
	public int[] getPrimaryReps(){
		return numReps;
	}
}