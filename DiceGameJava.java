 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

/**
 *
 * @author camax5273
 */
public class DiceGameJava {
    // Sets the generated dice rolls to equal the variables 
    public float PlayerDiceRollOne;
    public float PlayerDiceRollTwo;
    public float PlayerDiceTotal;
    public float ComputerDiceRollOne;
    public float ComputerDiceRollTwo;
    public float ComputerDiceTotal;
    


public DiceGameJava(float PlayerDiceRollOne, float PlayerDiceRollTwo, float PlayerDiceTotal, float ComputerDiceRollOne, float ComputerDiceRollTwo, float ComputerDiceTotal){
    // Sets the generated dice rolls to equal the variables 
    this.PlayerDiceRollOne = PlayerDiceRollOne;
    this.PlayerDiceRollTwo = PlayerDiceRollTwo;
    this.PlayerDiceTotal = PlayerDiceTotal;
    this.ComputerDiceRollOne = ComputerDiceRollOne;
    this.ComputerDiceRollTwo = ComputerDiceRollTwo;
    this.ComputerDiceTotal = ComputerDiceTotal;
}
    // Outputs a header for all of the inputs to keep it organized
    public String toString(){
        String OutputArea = (+PlayerDiceRollOne+"\t\t"+PlayerDiceRollTwo+"\t\t"+PlayerDiceTotal+"\t\t"+ComputerDiceRollOne+"\t\t"+ComputerDiceRollTwo+"\t\t"+ComputerDiceTotal+"\t\n");
        return OutputArea;
    }
    
}
