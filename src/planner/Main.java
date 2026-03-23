package planner;

public class Main {
	public static void main(String[] args) {
		Exercise hipthrust = new Exercise("Hip Thrust", MuscleSubgroup.gluteusMaximus);
		Exercise seatedLegCurl = new Exercise("Seated Leg Curl", MuscleSubgroup.hamstrings);
		Exercise bulgarianSplitSquads = new Exercise("bulgarian Split Squads", MuscleSubgroup.quadriceps);
		Exercise hyperExtensions = new Exercise("Hyper Extensions", MuscleSubgroup.erector);
		
		WorkoutDay day1 = new WorkoutDay("Day 1");
		
		day1.addExercise(hipthrust); 
		day1.addExercise(seatedLegCurl); 
		day1.addExercise(bulgarianSplitSquads); 
		day1.addExercise(hyperExtensions); 
		
		for(Exercise e : day1.getExercises()) {
		    System.out.println(e.getName());
		}
	}
}
