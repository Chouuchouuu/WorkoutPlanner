package planner;

public enum MuscleSubgroup {
	
	quadriceps(MuscleGroup.legs),
	hamstrings(MuscleGroup.legs),
	adductors(MuscleGroup.legs),
	abductors(MuscleGroup.legs),
	calves(MuscleGroup.legs),
	
	gluteusMaximus(MuscleGroup.glutes),
	gluteusMedius(MuscleGroup.glutes),
	gluteusMinimus(MuscleGroup.glutes),
	
	pectoralis(MuscleGroup.chest),
	
	latissimus(MuscleGroup.back),
	trapezius(MuscleGroup.back),
	rhomboids(MuscleGroup.back),
	erector(MuscleGroup.back),
	
	AnteriorDeltoid(MuscleGroup.shoulders),
	leterlDeltoid(MuscleGroup.shoulders),
	posteriorDeltoid(MuscleGroup.shoulders),
	
	biceps(MuscleGroup.arms),
	triceps(MuscleGroup.arms),
	forearms(MuscleGroup.arms),
	
	rectusAbdominis(MuscleGroup.core),
	obliques(MuscleGroup.core),
	transversusAbdominis(MuscleGroup.core),
	lowerBack(MuscleGroup.core);
	
	private final MuscleGroup muscleGroup;
	
	MuscleSubgroup(MuscleGroup muscleGroup) {
		this.muscleGroup = muscleGroup;
	}
	
	public MuscleGroup getMuscleGroup() {
		return muscleGroup;
	}
}
