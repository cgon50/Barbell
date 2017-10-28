
import java.lang.Math;

public class PrimaryLift{

	private String name;
	private int repMax;
	private final double T_MAX = .9;

	
	public PrimaryLift(String name, int repMax){
		this.name = name;
		this.repMax = (int) (5 * Math.round(repMax/5.0));
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
		return (int) (5 * Math.ceil((T_MAX * repMax)/5.0));
	}
	
	public int[] getPrimaryDay(){
		
		int[] weights = new int[9];
		
		double factor = .75;
		
		for(int i = 0; i < 3; i++){
			weights[i] =  (int) ((5 * Math.round(Math.round(factor * getTMax()* 10)/50.0)));
			factor += .1;
		}
		
		factor -= .15;
		for(int i = 3; i < weights.length; i++){
			weights[i] = (int) ((5 * Math.round(Math.round(factor * getTMax()* 10)/50.0)));
			factor -= .05;
		}
		
		return weights;
	}
	
	public int[] getSecondaryDays(){
		
		int[] weights = new int[8];
		
		double factor;
		if(name.equals("Bench"))
			factor = .4;
		else if(name.equals("Press") || name.equals("Deadlift"))
			factor = .5;
		else
			factor = .35;
		
		for(int i = 0; i < 3; i++){
			weights[i] =  (int) ((5 * Math.round(Math.round(factor * getTMax()* 10)/50.0)));
			factor += .1;
		}
		
		factor -= .1;
		for(int i = 3; i < weights.length; i++){
			weights[i] =  (int) ((5 * Math.round(Math.round(factor * getTMax()* 10)/50.0)));
		}
		return weights;
	}
	
	public int[] getPrimaryReps(){
		
		int[] primaryReps = new int[9];
		int reps = 5;
		for(int i = 0; i < 3; i++){
			primaryReps[i] = reps;
			reps = reps - 2;
		}
		
		if(!name.equals("Bench")){
			for(int i = 3; i < 6; i++){
				primaryReps[i] = 3;
			}
			
			if(!name.equals("Deadlift")){
				for(int i = 6; i < 9; i++){
					primaryReps[i] = 5;
				}
			}else{
				for(int i = 6; i < 9; i++){
					primaryReps[i] = 3;
				}
			}
		}else{
			for(int i = 3; i < 9; i++){
				if(i % 2 == 1)
					primaryReps[i] = 3;
				else
					primaryReps[i] = 5;
			}
		}
		
		return primaryReps;
	}
	
	public int[] getSecondaryReps(){
		
		int[] secondaryReps = new int[8];
		
		if(name.equals("Squat") || name.equals("Deadlift")){
			secondaryReps[0] = 5;
		}else{
			secondaryReps[0] = 6;
		}
		secondaryReps[1] = 5;
		
		for(int i = 2; i < 5; i++){
			secondaryReps[i] = (i - 1) * 2 + 1;
		}
		
		for(int i = 5; i < 8; i++){
			secondaryReps[i] = (i - 3) * 2;
		}
		
		return secondaryReps;
	}
	
}