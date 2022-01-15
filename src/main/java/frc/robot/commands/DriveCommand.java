package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RomiDrivetrain;

public class SpinCommand extends CommandBase {
    private final RomiDrivetrain drivetrain;

    public SpinCommand(RomiDrivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        this.drivetrain.arcadeDrive(0.5, 0);
    }

    @Override
    public boolean isFinished() {
        var distance = this.drivetrain.getRightDistanceInch();
        return Math.abs(distance) >= 20;