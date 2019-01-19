
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.RobotMap;
//import frc.robot.commands.drive; //Drive command has yet to be written
//import frc.robot.commands.liftScissors; //This command needs to be written too

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public ADXRS450_Gyro gyro = new ADXRS450_Gyro();

  //encoder stuff
  public static Encoder leftDriveEncoder = new Encoder(2,3);
  public static Encoder rightDriveEncoder = new Encoder(4,5);
  
  public static int lCount;
  public static int rCount;

  public double distance;

  public static double lDriveDistance;
  public static double rDriveDistance;

  public static double distanceTraveled;


  public static Talon leftFront = new Talon(RobotMap.frontLeft);
  public static Talon leftBack = new Talon(RobotMap.backLeft);
  public static Talon rightFront = new Talon(RobotMap.frontRight);
  public static Talon rightBack = new Talon(RobotMap.backRight); 

  public static double checkLeftEncoder() {
    lCount = leftDriveEncoder.get();
    lDriveDistance = -leftDriveEncoder.getDistance() / 1440.0 * 3.1415926535 * 0.5 / 12; //let's make it inches actually
    
    SmartDashboard.putNumber("Left Motor Distance (in)", lDriveDistance);
    return lDriveDistance;
  }
  public static double checkRightEncoder() {
    rCount = rightDriveEncoder.get();
    rDriveDistance = rightDriveEncoder.getDistance() / 1440.0 * 3.1415926535 * 0.5 / 12; //let's make it inches actually
    
    SmartDashboard.putNumber("Right Motor Distance (in)", rDriveDistance);
    return rDriveDistance;
  }

  //@SuppressWarnings("deprecation")
	public DriveTrain() {
		roboD.setSafetyEnabled(false);
    }
    
  //@SuppressWarnings("deprecation")
	public static final SpeedControllerGroup left = new SpeedControllerGroup(leftFront, leftBack);
	public static final SpeedControllerGroup right = new SpeedControllerGroup(rightFront, rightBack);
	public static DifferentialDrive roboD = new DifferentialDrive(left, right);

    public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new Drive()); //drive command is called here
        leftDriveEncoder.setDistancePerPulse(4);
        rightDriveEncoder.setDistancePerPulse(4);
	}
	
  //@SuppressWarnings("deprecation")
	public static void drive(double stick1, double stick2) {
		roboD.tankDrive((0.5*stick1),(0.5* stick2));
	}
}