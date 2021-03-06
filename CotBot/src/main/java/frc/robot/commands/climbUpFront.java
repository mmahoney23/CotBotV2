package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.ScissorFront;

/**
 * An example command.  You can replace me with your own command.
 */
public class climbUpFront extends Command {
  public climbUpFront() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.scissor1);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
      if(ScissorFront.isLimitUpReached()){
        Robot.scissor1.frontScissorStop();
        isFinished();
      }
      else{
        //the rest of the code runs
      }
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
      Robot.scissor1.frontScissorUp();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
