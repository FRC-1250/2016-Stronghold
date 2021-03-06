package org.usfirst.frc.team1250.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1250.robot.Robot;

/**
 *
 */
public class ManualModeShoulder extends Command {
	
	private double stickPosition;

    public ManualModeShoulder() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shoulder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	stickPosition = Robot.oi.manualStick.getY();
    	Robot.shoulder.manualMode(stickPosition);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.oi.getManualShoulderButton();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shoulder.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
