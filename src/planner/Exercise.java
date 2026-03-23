package planner;

public class Exercise {
	private final String name;
	private final MuscleSubgroup subgroup;

	public Exercise(String name, MuscleSubgroup subgroup) {
	    this.name = name;
	    this.subgroup = subgroup;
	}
	
	public MuscleSubgroup getSubgroup() {
		return subgroup;
	}
	
	public MuscleGroup getMuscleGroup() {
        return subgroup.getMuscleGroup();
    }
	
	public String getName() {
		return name;
	}
}