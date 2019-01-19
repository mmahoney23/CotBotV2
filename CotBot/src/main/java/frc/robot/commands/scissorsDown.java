package frc.robot.commands;


import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class scissorsDown extends Command {
  public scissorsDown() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.scissor1);
    requires(Robot.scissor2);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
      setTimeout(2);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
      Robot.scissor1.frontScissorDown();
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