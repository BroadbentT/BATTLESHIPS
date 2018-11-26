// *****************************************************************************
//
//  JAVA PROGRAMMER TERENCE BROADBENT - B028035c@student.staffs.ac.uk
//  DATE: 03.03.2014 VERSION 1.0
//
// *****************************************************************************



// *****************************************************************************
// Call any imports to be used by the program
// *****************************************************************************

import java.util.*;

// *****************************************************************************
// Main - BattleShips Game
// *****************************************************************************

public class BattleShips {
public static void main(String[] args) {

// *****************************************************************************
// Create the sea geographical area.
// *****************************************************************************

Battle Grid00 = new Battle();
Battle Grid01 = new Battle();
Battle Grid02 = new Battle();
Battle Grid03 = new Battle();
Battle Grid04 = new Battle();
Battle Grid05 = new Battle();
Battle Grid06 = new Battle();
Battle Grid07 = new Battle();
Battle Grid08 = new Battle();
Battle Grid09 = new Battle();
Battle Grid10 = new Battle();
Battle Grid11 = new Battle();
Battle Grid12 = new Battle();

// *****************************************************************************
// Create the battle ships geographical area.
// *****************************************************************************

Ships BShip00 = new Ships();
Ships BShip01 = new Ships();
Ships BShip02 = new Ships();
Ships BShip03 = new Ships();
Ships BShip04 = new Ships();
Ships BShip05 = new Ships();
Ships BShip06 = new Ships();
Ships BShip07 = new Ships();
Ships BShip08 = new Ships();
Ships BShip09 = new Ships();
Ships BShip10 = new Ships();
Ships BShip11 = new Ships();
Ships BShip12 = new Ships();

// *****************************************************************************
// Create the two arrays to hold all the data and other variables
// *****************************************************************************

Battle[] BattleArray = {Grid00, Grid01, Grid02, Grid03, Grid04, Grid05, Grid06,
                        Grid07, Grid08, Grid09, Grid10, Grid11, Grid12};

Ships [] ShipArray   = {BShip00, BShip01, BShip02, BShip03, BShip04, BShip05,
                        BShip06, BShip07, BShip08, BShip09, BShip10, BShip11,
                        BShip12};
int GridX = 0;
int GridY = 0;
int NumAllSunk = 25;

// *****************************************************************************
// Populate the battlefield grid with appropriate clean data
// *****************************************************************************

Grid00.setHeader(Grid00);
for (int NumLoop = 1; NumLoop < 13; NumLoop++){
String StrString = "";
if (NumLoop < 10){StrString = " " + NumLoop ;}
if (NumLoop > 9){StrString = NumLoop + "";}
BattleArray[NumLoop].setGrids(BattleArray[NumLoop], StrString);}

// *****************************************************************************
// Populate all the ships geographical locations with '0's
// *****************************************************************************

for (int NumLoop = 0; NumLoop < 13; NumLoop++){
ShipArray[NumLoop].BShipData(ShipArray[NumLoop], "0");}

// *****************************************************************************
// Now place the 5 battle ships (length 5) by populating the locations with '1's
// *****************************************************************************

for (int NumLoop = 7; NumLoop < 12; NumLoop++){
BShip01.setBShip(BShip01, NumLoop);}
for (int NumLoop = 2;NumLoop < 7; NumLoop++){
BShip04.setBShip(BShip04, NumLoop);}
for (int NumLoop = 7; NumLoop < 12; NumLoop++){
ShipArray[NumLoop].setBShip(ShipArray[NumLoop], 1);}
for (int NumLoop = 6; NumLoop < 11; NumLoop++){
for (int NumLoop2 = 8; NumLoop2 > 3; NumLoop2--){
ShipArray[NumLoop].setBShip(ShipArray[NumLoop], NumLoop2);}}
for (int NumLoop = 8; NumLoop < 13;NumLoop++){
ShipArray[NumLoop].setBShip(ShipArray[NumLoop], 11);}

// *****************************************************************************
// Now start the Game!!!
// *****************************************************************************

while (NumAllSunk != 0) {                         //End game when all ships sunk

// *****************************************************************************
// Display the battlefield grid to the player via the screen
// *****************************************************************************
     
ShowGameHeader();
for (int NumLoop = 0; NumLoop <13; NumLoop++){
ShowBattleField(BattleArray[NumLoop]);}

// *****************************************************************************
// Obtain the x,y coordinates of the shot from the user via the keyboard
// *****************************************************************************

GridX = GetX(GridX);
GridY = GetY(GridY);

// *****************************************************************************
// Refresh the grid data with updated shot for a miss or hit
// *****************************************************************************

for (int NumLoop = 0; NumLoop < 13; NumLoop++){
if (GridY == NumLoop )
{BattleArray[NumLoop].setMiss(BattleArray[NumLoop], GridX);}}
for (int NumLoop = 0; NumLoop < 13; NumLoop++){
String StrCheckData = ShipArray[NumLoop].getBShips(GridX);
if (GridY == NumLoop && "1".equals(StrCheckData))
{BattleArray[NumLoop].setHit(BattleArray[NumLoop], GridX);NumAllSunk--;}}}
}

// *****************************************************************************
//  End of program - Job well done!
// *****************************************************************************   

// *****************************************************************************
// Print the battlefield geographical area to the screen
// *****************************************************************************

public static void ShowBattleField(Battle StrString){
for (int NumLoop = 0; NumLoop < 13; NumLoop++){
System.out.printf(StrString.getGrid(NumLoop) + "     ");}
System.out.println("\n");
}

public static void ShowGameHeader(){
System.out.println("\n\n\n\n\n\n\t\t\t    B A T T L E  S H I P S");
System.out.println("\t\t\t    - - - - - -  - - - - -\n");
System.out.println("\t      There are five enemy ships for you to hunt and sink\n\n");
}

public static int GetX(int NumX)
{
Scanner myKeyboard = new Scanner(System.in);   
int NumCheck = 0;
while (NumCheck == 0){
System.out.print("Please enter the X Coordinate (A - L): ");
String StrInput = myKeyboard.next();
char StrChar = StrInput.toUpperCase().charAt(0);
if  (StrChar == 'A'){NumCheck = 1;NumX = 1;}
if  (StrChar == 'B'){NumCheck = 1;NumX = 2;}
if  (StrChar == 'C'){NumCheck = 1;NumX = 3;}
if  (StrChar == 'D'){NumCheck = 1;NumX = 4;}
if  (StrChar == 'E'){NumCheck = 1;NumX = 5;}
if  (StrChar == 'F'){NumCheck = 1;NumX = 6;}
if  (StrChar == 'G'){NumCheck = 1;NumX = 7;}
if  (StrChar == 'H'){NumCheck = 1;NumX = 8;}
if  (StrChar == 'I'){NumCheck = 1;NumX = 9;}
if  (StrChar == 'J'){NumCheck = 1;NumX = 10;}
if  (StrChar == 'K'){NumCheck = 1;NumX = 11;}
if  (StrChar == 'L'){NumCheck = 1;NumX = 12;}}    
return NumX;    
}

public static int GetY(int NumY){
Scanner myKeyboard = new Scanner(System.in);   
int NumCheck = 0;
while (NumCheck == 0){
System.out.print("Please enter the Y Coordinate (1 - 12): ");
int NumInput = myKeyboard.nextInt();
String StrDummy = myKeyboard.nextLine();                   // Buffer Flush
if (NumInput > 0 && NumInput < 13){NumY = NumInput;NumCheck = 1;}}    
return NumY;}
}
// EOF