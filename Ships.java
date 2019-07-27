// *****************************************************************************
//                 JAVA BATTLESHIPS - YOU SUNK MY BATTLESHIP
//           BY TERENCE BROADBENT BSC CYBER SECURITY (FIRST CLASS)
// *****************************************************************************

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Load required imports.
// Modified: N/A
// *****************************************************************************

package BattleShipsProj;

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Ship variables.
// Modified: N/A
// *****************************************************************************

public class Ships {
private final String[]Ship = new String [13];

public void setShip(int Loc, String StringX){
Ship[Loc] = StringX;} 

public void BShipData(Ships StringX, String StringY){
for (int NumLoop = 0; NumLoop < 13; NumLoop++){
StringX.setShip(NumLoop, StringY);}}

public void setBShip(Ships StringX, int NumY){
StringX.setShip(NumY, "1");}    

public String getBShips(int Loc){
return Ship[Loc];} 
}
//EOF
