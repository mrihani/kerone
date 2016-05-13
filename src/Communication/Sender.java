/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

/**
 *
 * @author Fadel
 */
public class Sender {

    public String StartStop(int startstop) {
        if (startstop == 0) {
            return "CMD r END";
        } else {
            return "CMD s END";
        }
    }

    public String SendCommand(String Commmand) {
        String command = "";
        switch (Commmand) {
            case "VM_SCH_EN":
                command = "c01";
                break;
            case "VM_SCH_DIS":
                command = "c00";
                break;
            case "TA_SCH_EN":
                command = "c11";
                break;
            case "TA_SCH_DIS":
                command = "c10";
                break;
            case "PL_ALL_EN":
                command = "c21";
                break;
            case "PL_ALL_DIS":
                command = "c20";
                break;
            case "SLOW_EN":
                command = "c31";
                break;
            case "SLOW_DIS":
                command = "c30";
                break;
        }
        return "CMD " + command + " END";
    }
}
