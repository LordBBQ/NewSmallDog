package frc.robot.subsystem;

public class Driver {
    void calculateDrive(double speed, double direction){
        // add joystick input into speed and direction

        public double right = speed + direction;
        public double left = speed - direction;

    }

    void fixDeadspot(){
        if(power => -0.05 && power =< 0.05){
            power = 0;
        }

        if(steering => -0.05 && steering =< 0.05){
            steering = 0;
        }
        
    }

    void drive(double left, double right){

        // set power, velocity
        // placeholder, set stuff later
        
    }
}
