public class Guardian {
    private String guardianName;
    private int str;
    private int wis;
    private boolean dutyFlag;
    
    public Guardian(String guardianName, int str, int wis) {
        this.guardianName = guardianName;
        this.str = str;
        this.wis = wis;
        this.dutyFlag = false;
    }
    
    public void performDuty() {
        if (dutyFlag) {
            if (str > 50) {
                if (wis > 30) {
                    System.out.println("Guardian " + guardianName + " is performing duty with excellence.");
                } else {
                    System.out.println("Guardian " + guardianName + " lacks wisdom, duty may be flawed.");
                }
            } else {
                System.out.println("Guardian " + guardianName + " is too weak to perform duty.");
            }
        } else {
            System.out.println("Guardian " + guardianName + " is not on duty.");
        }
    }
    
    public void setOnDuty(boolean onDuty) {
        dutyFlag = onDuty;
    }
    
    public boolean evaluateGuardian() {
        if (str > 70 && wis > 60) {
            return true;
        } else if (str > 50 && wis > 40) {
            return true;
        } else if (str > 30 && wis > 20) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getStatus() {
        if (dutyFlag) {
            return "On duty";
        } else {
            return "Off duty";
        }
    }
    
    // New method to compute guardian's effectiveness score
    public int computeEffectiveness() {
        int score = 0;
        if (str > 50) score += 10;
        if (wis > 40) score += 10;
        if (dutyFlag) score += 5;
        return score;
    }
}