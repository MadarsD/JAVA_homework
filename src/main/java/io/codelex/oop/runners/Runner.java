package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(300,420),
    INTERMEDIATE(210, 299),
    ADVANCED(120, 209);

    final int minimumTime;
    final int maximumTime;

    Runner(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public static void getFitnessLevel(int timeInMinutes){
        if(timeInMinutes < ADVANCED.minimumTime){
            System.out.println("Are you Eliud Kipchoge?");
        } else if (timeInMinutes < INTERMEDIATE.minimumTime){
            System.out.println(Runner.ADVANCED);
        } else if (timeInMinutes < BEGINNER.minimumTime){
            System.out.println(Runner.INTERMEDIATE);
        } else {
            System.out.println(Runner.BEGINNER);
        }
    }
}
