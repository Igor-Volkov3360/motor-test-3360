package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Chassis extends SubsystemBase{
    //initializing the motors using the WPI_TalonSRX
    private final WPI_TalonSRX m_motor_left = new WPI_TalonSRX(Constants.OperatorConstants.motor_left);
    private final WPI_TalonSRX m_motor_right = new WPI_TalonSRX(Constants.OperatorConstants.motor_right);
    private final DifferentialDrive m_diffDrive = new DifferentialDrive(m_motor_left, m_motor_right);

//
    public Chassis(){
m_motor_left.configFactoryDefault();
m_motor_right.configFactoryDefault();

m_motor_left.setInverted(true);
m_motor_right.setInverted(false);
    }

@Override
public void periodic(){

}
public void driveArcade(double x, double z, boolean squaredInputs){
m_diffDrive.arcadeDrive(x, z, squaredInputs);
}
}