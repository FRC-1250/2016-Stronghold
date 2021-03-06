package org.usfirst.frc.team1250.robot.commands;

import org.usfirst.frc.team1250.robot.Robot;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1250.formulas.Convert;

/**
 *
 */
public class ShoulderSetpoint extends Command {

	private double setpoint;
	private double heightWheel;
	private char c;
	
    public ShoulderSetpoint(char c, double setpoint) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shoulder);
    	this.setpoint = setpoint;
    	this.c = c;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	heightWheel = Convert.ArmToWheelHeight(setpoint);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
