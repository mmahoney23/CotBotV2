package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Rhino extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static Talon rhino = new Talon(RobotMap.rhinoHorn);

  public void poke(){
      rhino.set(0.5);
  }
  public void stopRhino(){
      rhino.set(0);
  }
  public void unpoke(){
      rhino.set(-0.5);
  }

  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}