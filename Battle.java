// *****************************************************************************
//
//  JAVA PROGRAMMER TERENCE BROADBENT - B028035c@student.staffs.ac.uk
//  DATE: 03.03.2014 VERSION 1.0
//
// *****************************************************************************

public class Battle {

private final String[]Battle = new String [13];    

public String getGrid(int NumLoop){

return Battle[NumLoop];} 

public void setMiss(Battle StringX, int NumY){

StringX.setGrid(NumY, "X");}

public void setHit(Battle StringX, int NumY) {

StringX.setGrid(NumY, "H");}

public void setGrid(int Loc, String StringX){

Battle[Loc] = StringX;}

public void setGrids(Battle StringX, String String01){

for (int NumLoop = 0; NumLoop < 13; NumLoop++){

if (NumLoop == 0){

StringX.setGrid(NumLoop, String01);}

else{StringX.setGrid(NumLoop, ".");}}}

public void setHeader(Battle StringX){

StringX.setGrid(0, "  ");

StringX.setGrid(1, "A");

StringX.setGrid(2, "B");

StringX.setGrid(3, "C");

StringX.setGrid(4, "D");

StringX.setGrid(5, "E");

StringX.setGrid(6, "F");

StringX.setGrid(7, "G");

StringX.setGrid(8, "H");

StringX.setGrid(9, "I");

StringX.setGrid(10, "J");

StringX.setGrid(11, "K");

StringX.setGrid(12, "L");}

}

// EOF