package planner;

import java.util.ArrayList;
import java.util.List;

public class WorkoutDay {
	private String dayName;
	private List<Exercise> exercises;
	
	public WorkoutDay(String dayName) {
		this.dayName = dayName;
		this.exercises = new ArrayList<>();
	}
	
	public void addExercise(Exercise exercise) {
		exercises.add(exercise);
	}
	
	public String getDayName() {
		return dayName;
	}
	
	public List<Exercise> getExercises() {
		return exercises;
	}
}
