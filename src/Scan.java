import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Scan {
  
  private Date _date;
  private double _ketamineDosage;
  private double _dexdomitorDosage;
  private double _atipamezoleDosage;
  private double _isofluraneDosage;
  
  private double _cumulativeKetamineDosage;
  private double _cumulativeDexdomitorDosage;
  private double _cumulativeAtipamezoleDosage;
  private double _cumulativeIsofluraneDosage;
  
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
    
    _cumulativeKetamineDosage = 0;
    _cumulativeDexdomitorDosage = 0;
    _cumulativeAtipamezoleDosage = 0;
    _cumulativeIsofluraneDosage = 0;
  }
  
  public double getCumulativeKetamineDosage() {
	return _cumulativeKetamineDosage;
}

public void setCumulativeKetamineDosage(double _cumulativeKetamineDosage) {
	this._cumulativeKetamineDosage = _cumulativeKetamineDosage;
}

public double getCumulativeDexdomitorDosage() {
	return _cumulativeDexdomitorDosage;
}

public void setCumulativeDexdomitorDosage(double _cumulativeDexdomitorDosage) {
	this._cumulativeDexdomitorDosage = _cumulativeDexdomitorDosage;
}

public double getCumulativeAtipamezoleDosage() {
	return _cumulativeAtipamezoleDosage;
}

public void setCumulativeAtipamezoleDosage(double _cumulativeAtipamezoleDosage) {
	this._cumulativeAtipamezoleDosage = _cumulativeAtipamezoleDosage;
}

public double getCumulativeIsofluraneDosage() {
	return _cumulativeIsofluraneDosage;
}

public void setCumulativeIsofluraneDosage(double _cumulativeIsofluraneDosage) {
	this._cumulativeIsofluraneDosage = _cumulativeIsofluraneDosage;
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
  
  public String toString(){
    return _cumulativeKetamineDosage + "," + _cumulativeDexdomitorDosage + "," + _cumulativeAtipamezoleDosage + "," + _cumulativeIsofluraneDosage;
  }
}
