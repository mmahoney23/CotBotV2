/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  
  //motors
    //drivetrain
    public static int frontLeft = 1;
    public static int backLeft = 2;
    public static int frontRight = 3;
    public static int backRight = 4;
    //arm
    public static int leftArm = 5;
    public static int rightArm = 6;
    public static int armUpDown = 7;
    //scissorlift
    public static int frontUpDown = 8;
    public static int backUpDown = 9;
    public static int backForwardLeft = 10;
    public static int backForwardRight = 11;
    //wheels on front
    public static int frontWheels = 12;
    //rhino
    public static int rhinoHorn = 13;
  //sensors
    //actuators
    public static int frontScissorPortOut = 1;
    public static int frontScissorPortIn = 2;
    public static int backScissorPortOut = 3;
    public static int backScissorPortIn = 4;

}
