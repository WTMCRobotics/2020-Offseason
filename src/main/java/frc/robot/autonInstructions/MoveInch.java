package frc.robot.autonInstructions;

import frc.robot.Robot;

public class MoveInch extends Instruction {

	double inches;

	public MoveInch(double inches) {
		this.inches = inches;
	}

	@Override
	public boolean doit(Robot robot) {
			robot.moveInches(inches);
		return true;
	}

}
