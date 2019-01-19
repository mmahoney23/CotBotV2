package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ScissorBack extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static Talon scissorBack = new Talon(RobotMap.backUpDown);

  static DigitalInput backActuatorLimit = new DigitalInput(RobotMap.backScissorPort);


  public static boolean isLimitReached(){
      return !backActuatorLimit.get();
  }

  public void backScissorDown(){
      scissorBack.set(0.5);
  }
  public void backScissorUp(){
      scissorBack.set(-0.5);
  }
  public void backScissorStop(){
      scissorBack.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }
}