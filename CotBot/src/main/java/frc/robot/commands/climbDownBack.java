package frc.robot.commands;


import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.ScissorBack;

/**
 * An example command.  You can replace me with your own command.
 */
public class climbDownBack extends Command {
  public climbDownBack() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.scissor2);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    if(ScissorBack.isLimitDownReached()){
      Robot.scissor2.backScissorStop();
      isFinished();
    }
    else{
      //the rest of the code runs
    }
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
      Robot.scissor2.backScissorDown();
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