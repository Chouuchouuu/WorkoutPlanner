package planner;

import java.util.List;

public class TrainingPlan {
	private List<WorkoutDay> workoutDays;
	
	public void addWorkoutDay(WorkoutDay workoutDay) {
		workoutDays.add(workoutDay);
	}
	
	public List<WorkoutDay> getWorkoutDays() {
		return workoutDays;
	}
}
