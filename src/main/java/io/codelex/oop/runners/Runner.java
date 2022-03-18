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
        if(timeInMinutes < 120){
            System.out.println("Are you Eliud Kipchoge?");
        } else if (timeInMinutes < 210){
            System.out.println(Runner.ADVANCED);
        } else if (timeInMinutes < 300){
            System.out.println(Runner.INTERMEDIATE);
        } else {
            System.out.println(Runner.BEGINNER);
        }
    }
}
