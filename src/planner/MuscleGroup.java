package planner;

public enum MuscleGroup {
	legs(Bodypart.LOWER_BODY),
	glutes(Bodypart.LOWER_BODY),
	chest(Bodypart.UPPER_BODY),
	back(Bodypart.UPPER_BODY),
	shoulders(Bodypart.UPPER_BODY),
	arms(Bodypart.UPPER_BODY),
	core(Bodypart.UPPER_BODY);
	
	private final Bodypart bodyPart;

    MuscleGroup(Bodypart bodyPart) {
        this.bodyPart = bodyPart;
    }

    public Bodypart getBodyPart() {
        return bodyPart;
    }
}