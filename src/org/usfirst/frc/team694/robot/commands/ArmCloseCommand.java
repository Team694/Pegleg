package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ArmCloseCommand extends InstantCommand {

    public ArmCloseCommand() {
        requires(Robot.arm);
    }

    protected void initialize() {
    		Robot.arm.close();
    }

    protected void end() {
    }
    
}
