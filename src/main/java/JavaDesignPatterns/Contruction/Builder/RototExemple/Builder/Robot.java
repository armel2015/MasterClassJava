package JavaDesignPatterns.Contruction.Builder.RototExemple.Builder;


public class Robot implements RobotPlan{

    private String robotTete;
    private String robotCorp;
    private String robotMains;
    private String robotPieds;

    @Override
    public void setRobotTete(String tete) {

        this.robotTete = tete;
    }

    @Override
    public void setRobotCorp(String corp) {

        this.robotCorp = corp;
    }

    @Override
    public void setRobotMains(String mains) {

        this.robotMains = mains;
    }

    @Override
    public void setRobotPieds(String pieds) {

        this.robotPieds = pieds;
    }

    public String getRobotTete() {
        return robotTete;
    }

    public String getRobotCorp() {
        return robotCorp;
    }

    public String getRobotMains() {
        return robotMains;
    }

    public String getRobotPieds() {
        return robotPieds;
    }
}
