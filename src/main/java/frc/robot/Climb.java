package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

//import edu.wpi.first.wpilibj.Solenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

public class Climb {
    pcmCompressor.enableDigital();
    pcmCompressor.disable();
    //pneumatics constants
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    DoubleSolenoid controlDoublePCM = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);

    if (controller.getAButtonPressed()){controlDoublePCM.toggle();
    }

}
//This represents code if we want data from Pnuematics 
// https://docs.wpilib.org/en/stable/docs/software/hardware-apis/pneumatics/pneumatics.html
// boolean enabled = pcmCompressor.enabled();
// boolean pressureSwitch = pcmCompressor.getPressureSwitchValue();
// double current = pcmCompressor.getCompressorCurrent()