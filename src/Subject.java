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
  
  private void computeCumulativeDoses(){
    //TODO need to compound the doses at each scan when writing them out or something
  }
  
  public String toString(){
    String output = "";
    int i = 1;
    for (Scan s : _scans){
      output += _ID + "," + i + "," + s.toString() + "/n";
      i++;
    }
    return output;
  }

}
