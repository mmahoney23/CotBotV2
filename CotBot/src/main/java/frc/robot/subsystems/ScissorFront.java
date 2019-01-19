package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ScissorFront extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static Talon scissorFront = new Talon(RobotMap.frontUpDown);

  static DigitalInput frontActuatorLimit = new DigitalInput(RobotMap.frontScissorPort);


  public static boolean isLimitReached(){
      return !frontActuatorLimit.get();
  }

  public void frontScissorDown(){
      scissorFront.set(0.5);
  }
  public void frontScissorUp(){
      scissorFront.set(-0.5);
  }
  public void frontScissorStop(){
      scissorFront.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }
}