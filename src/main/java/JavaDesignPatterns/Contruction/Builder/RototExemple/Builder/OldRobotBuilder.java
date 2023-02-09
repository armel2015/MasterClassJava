package JavaDesignPatterns.Contruction.Builder.RototExemple.Builder;

public class OldRobotBuilder implements RobotBuilder{

    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotTete() {
        robot.setRobotTete("Head");
    }

    @Override
    public void buildRobotCorp() {
        robot.setRobotCorp("Body");
    }

    @Override
    public void buildRobotMains() {
        robot.setRobotMains("Hands");
    }

    @Override
    public void buildRobotPieds() {
        robot.setRobotPieds("Foots");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
