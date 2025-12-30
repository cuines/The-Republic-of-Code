public class Guardian {
    private String name;
    private int strength;
    private int wisdom;
    private boolean isOnDuty;
    
    public Guardian(String name, int strength, int wisdom) {
        this.name = name;
        this.strength = strength;
        this.wisdom = wisdom;
        this.isOnDuty = false;
    }
    
    public void performDuty() {
        if (isOnDuty) {
            if (strength > 50) {
                if (wisdom > 30) {
                    System.out.println("Guardian " + name + " is performing duty with excellence.");
                } else {
                    System.out.println("Guardian " + name + " lacks wisdom, duty may be flawed.");
                }
            } else {
                System.out.println("Guardian " + name + " is too weak to perform duty.");
            }
        } else {
            System.out.println("Guardian " + name + " is not on duty.");
        }
    }
    
    public void setOnDuty(boolean onDuty) {
        isOnDuty = onDuty;
    }
    
    public boolean evaluateGuardian() {
        if (strength > 70 && wisdom > 60) {
            return true;
        } else if (strength > 50 && wisdom > 40) {
            return true;
        } else if (strength > 30 && wisdom > 20) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getStatus() {
        if (isOnDuty) {
            return "On duty";
        } else {
            return "Off duty";
        }
    }
}