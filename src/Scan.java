import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Scan {
  
  private Date _date;
  private double _ketamineDosage;
  private double _dexdomitorDosage;
  private double _atipamezoleDosage;
  private double _isofluraneDosage;
  
  public Scan (String date, double ketamineDosage, double dexdomitorDosage, double atipamezoleDosage, double isofluraneDosage){

    SimpleDateFormat format = new SimpleDateFormat("d-MMM-yy");
    try {
      _date = format.parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    _ketamineDosage = ketamineDosage;
    _dexdomitorDosage = dexdomitorDosage;
    _atipamezoleDosage = atipamezoleDosage;
    _isofluraneDosage = isofluraneDosage;
  }
  
  public Date getDate(){
    return _date;
  }
  
  public double getKetamineDosage(){
    return _ketamineDosage;
  }
  
  public void setKetamineDosage(double dosage){
    _ketamineDosage = dosage;
  }
  
  public double getDexdomitorDosage(){
    return _dexdomitorDosage;
  }
  
  public void setDexdomitorDosage(double dosage){
    _dexdomitorDosage = dosage;
  }
  
  public double getAtipamezoleDosage(){
    return _atipamezoleDosage;
  }

  public void setAtipamezoleDosage(double dosage){
    _atipamezoleDosage = dosage;
  }
  
  public double getIsofluraneDosage(){
    return _isofluraneDosage;
  }
  
  public void setIsofluraneDosage(double dosage){
    _isofluraneDosage = dosage;
  }
}
