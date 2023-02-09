package JavaDesignPatterns.Contruction.Builder.RototExemple.Builder;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return robotBuilder.getRobot();
    }

    public void makeRobot(){
        this.robotBuilder.buildRobotTete();
        this.robotBuilder.buildRobotCorp();
        this.robotBuilder.buildRobotMains();
        this.robotBuilder.buildRobotPieds();
    }
}
