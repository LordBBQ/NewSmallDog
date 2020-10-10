/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

/**
 * Add your docs here.
 */



public class Shooter {

    long time = 0; //TODO

    void shoot(double power){
    if (checkSpeedThreshold(0)==true){
        //set shooter to 1
        //turn hopper on
        
    } else  {
        //turn hopper off

    }
    }
void shooterOn(){

}//turn shooter on
void shooterOff(){

}//turn shooter off
    boolean checkSpeedThreshold(long threshold) {
        if(time >= threshold) {
            return true;
        } else {
            return false;
        }
    }