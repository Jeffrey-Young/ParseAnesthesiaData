import java.util.ArrayList;

public class Subject {
  
  private String _ID;
  private ArrayList<Scan> _scans;
  
  public Subject (String ID){
    _ID = ID;
    _scans = new ArrayList<Scan>();
  }
  
  public void addScan(Scan s){
    _scans.add(s);
  }
  
  public ArrayList<Scan> getScans(){
    return _scans;
  }
  
  public void computeCumulativeDoses(){
    for (int i = _scans.size() - 1; i > 0; i--){
      for (int j = i - 1; j >= 0 ; j--){
        _scans.get(i).setKetamineDosage(_scans.get(i).getKetamineDosage() + _scans.get(j).getKetamineDosage());
        _scans.get(i).setDexdomitorDosage(_scans.get(i).getDexdomitorDosage() + _scans.get(j).getDexdomitorDosage());
        _scans.get(i).setAtipamezoleDosage(_scans.get(i).getAtipamezoleDosage() + _scans.get(j).getAtipamezoleDosage());
        _scans.get(i).setIsofluraneDosage(_scans.get(i).getIsofluraneDosage() + _scans.get(j).getIsofluraneDosage());
      }
    }
  }
  
  public String toString(){
    String output = "";
    int i = 1;
    for (Scan s : _scans){
      output += _ID + "," + i + "," + s.toString() + "\n";
      i++;
    }
    return output;
  }

}
