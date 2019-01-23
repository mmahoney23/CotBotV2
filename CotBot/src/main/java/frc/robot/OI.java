/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  static Joystick stick1 = new Joystick(0);
  static Joystick stick2 = new Joystick(1);
  static Joystick gamepad = new Joystick(2);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  static double deadzone = 0.1;

  public OI(){
    JoystickButton leftTrigger = new JoystickButton(stick1, 1);
		JoystickButton rightTrigger = new JoystickButton(stick2, 1);
		
		JoystickButton leftThree = new JoystickButton(stick1, 3);
		JoystickButton rightThree = new JoystickButton(stick2, 3);
		
		JoystickButton button5 = new JoystickButton(stick1, 5);
		JoystickButton button6 = new JoystickButton(stick2, 4);
		
		JoystickButton button7 = new JoystickButton(stick1, 2);
		JoystickButton button8 = new JoystickButton(stick2, 2);
		
		JoystickButton joy8 = new JoystickButton(stick1,8);
		JoystickButton joy9 = new JoystickButton(stick1,9);
		
		JoystickButton y = new JoystickButton(gamepad, 4);
		JoystickButton a = new JoystickButton(gamepad, 2);
		
		JoystickButton x = new JoystickButton(gamepad, 1);
		JoystickButton b = new JoystickButton(gamepad, 3);
		
		JoystickButton leftBumper = new JoystickButton(gamepad, 5);
		JoystickButton rightBumper = new JoystickButton(gamepad, 6);

		JoystickButton gameLeftTrigger = new JoystickButton(gamepad, 7);
    JoystickButton gameRightTrigger = new JoystickButton(gamepad, 8);

    leftTrigger.whenPressed(new rhinoIn());
    leftTrigger.whenReleased(new rhinoStop());
    
    rightTrigger.whenPressed(new rhinoOut());
    rightTrigger.whenReleased(new rhinoStop());

    leftThree.whenPressed(new cargoOut());
    leftThree.whenPressed(new cargoInStop());

    rightThree.whenPressed(new cargoIn());
    rightThree.whenReleased(new cargoInStop());

    a.whenPressed(new cargoDown());
    a.whenReleased(new cargoUpStop());

    y.whenPressed(new cargoUp());
    y.whenReleased(new cargoUpStop());

    x.whenPressed(new cargoOut());
    x.whenReleased(new cargoInStop());

    b.whenPressed(new cargoIn());
    b.whenReleased(new cargoInStop());

    rightBumper.whenPressed(new climbDownFront());
    rightBumper.whenReleased(new climbFrontStop());

    leftBumper.whenPressed(new climbDownBack());
    leftBumper.whenReleased(new climbBackStop());

    gameRightTrigger.whenPressed(new climbUpFront());
    gameRightTrigger.whenReleased(new climbFrontStop());

    gameLeftTrigger.whenPressed(new climbUpBack());
    gameLeftTrigger.whenReleased(new climbBackStop());
  }

  public static double getYInput() {
		if (Math.abs(stick1.getY()) > deadzone) {
			return -stick1.getY();
		}
		return 0;
	}
	public static double getYInput2() {
		if (Math.abs(stick2.getY()) > deadzone) {
			return -stick2.getY();
		}
		return 0;
	}

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
