package JavaDesignPatterns.Contruction.Builder.RototExemple.Builder;

public interface RobotBuilder {

    public void buildRobotTete();
    public void buildRobotCorp();
    public void buildRobotMains();
    public void buildRobotPieds();

    public Robot getRobot();
}
