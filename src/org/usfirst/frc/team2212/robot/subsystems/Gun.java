package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gun extends Subsystem {
    private TalonSRX t1,t2;
    public Gun(TalonSRX t1,TalonSRX t2){
    	this.t1=t1;
    	this.t2=t2;
    }
    public void charge(double speed){
    	t1.set(speed);
    	t2.set(-speed);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

