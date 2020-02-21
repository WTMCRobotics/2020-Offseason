package frc.robot.autonInstructions;

import frc.robot.Robot;

public class TurnDeg extends Instruction {

	double degrees;

	public TurnDeg(double degrees) {
		this.degrees = degrees;
	}

	@Override
	public boolean doit(Robot robot) {

		if(robot.turnDegs(degrees)){
			robot.gyro.reset();
			System.out.println("done");
			return true;
		}
		System.out.println();
		return false;
	}

}
