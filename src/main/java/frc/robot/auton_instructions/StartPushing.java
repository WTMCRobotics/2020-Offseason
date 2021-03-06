package frc.robot.auton_instructions;

import com.ctre.phoenix.motorcontrol.ControlMode;

import frc.robot.Robot;

/**
 * sets the robot pushing lightly forward to keep it on the wall while dumping powercells
 */
public class StartPushing extends Instruction {

    public StartPushing() { }

    @Override
    public boolean doit(Robot robot) {
        System.out.println("pushing");
		robot.rightMaster.set(ControlMode.PercentOutput, -0.2);
        robot.leftMaster.set(ControlMode.PercentOutput, -0.2);
		return true;
    }
    
}