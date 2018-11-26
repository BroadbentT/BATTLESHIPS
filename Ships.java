// *****************************************************************************
//
//  JAVA PROGRAMMER TERENCE BROADBENT - B028035c@student.staffs.ac.uk
//  DATE: 03.03.2014 VERSION 1.0
//
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