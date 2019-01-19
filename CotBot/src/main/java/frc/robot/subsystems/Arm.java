package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static Talon cargoLeft = new Talon(RobotMap.leftArm);
  public static Talon cargoRight = new Talon(RobotMap.rightArm);
  public static Talon cargoPivot = new Talon(RobotMap.armUpDown);

  public void armUp(){
      cargoPivot.set(0.5);
  }
  public void armDown(){
      cargoPivot.set(-0.5);
  }
  public void armStop(){
      cargoPivot.set(0);
  }
  public void inhale(){
      cargoLeft.set(0.5);
      cargoRight.set(-0.5);
  }
  public void exhale(){
      cargoLeft.set(-0.5);
      cargoRight.set(0.5);
  }
  public void dontBreathe(){
      cargoLeft.set(0);
      cargoRight.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}