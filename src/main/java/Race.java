class Race {
    String leaderName = "";
    int leaderDistance = 0;
    public static final int RACE_HOURS = 24;
    void updateLeader(Car car) {
        int distance  = RACE_HOURS * car.getSpeed();
        if (distance > leaderDistance) {
            leaderDistance = distance;
            leaderName = car.getName();
        }
    }
    public String getLeaderName() {
        return leaderName;
    }
}