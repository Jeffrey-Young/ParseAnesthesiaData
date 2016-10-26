import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Runner {

  public static void main(String[] args) {
    ArrayList<Subject> subjects = new ArrayList<Subject>();
    String line = "";
    try {
      BufferedReader reader = new BufferedReader(new FileReader("data/ScanMonksAnesthesia.csv"));
      reader.readLine(); //throw away index helper line
      reader.readLine(); //throw away header line
      while (reader.ready()){
        line = reader.readLine();
        Subject s = new Subject(line.split(",")[1]);
        Scan s1 = new Scan(line.split(",")[5], Double.parseDouble(line.split(",")[7]) + Double.parseDouble(line.split(",")[8]) + Double.parseDouble(line.split(",")[9]), Double.parseDouble(line.split(",")[10]), Double.parseDouble(line.split(",")[11]), Double.parseDouble(line.split(",")[12]));
        s.addScan(s1);
        if (!line.split(",")[13].equals("no scan")){ //there was 1 subj with only 4 scans
          Scan s2 = new Scan(line.split(",")[13], Double.parseDouble(line.split(",")[15]) + Double.parseDouble(line.split(",")[16]) + Double.parseDouble(line.split(",")[17]), Double.parseDouble(line.split(",")[18]), Double.parseDouble(line.split(",")[19]), Double.parseDouble(line.split(",")[20]));
          s.addScan(s2);
        }
        Scan s3 = new Scan(line.split(",")[21], Double.parseDouble(line.split(",")[23]) + Double.parseDouble(line.split(",")[24]) + Double.parseDouble(line.split(",")[25]), Double.parseDouble(line.split(",")[26]), Double.parseDouble(line.split(",")[27]), Double.parseDouble(line.split(",")[28]));
        s.addScan(s3);
        Scan s4 = new Scan(line.split(",")[29], Double.parseDouble(line.split(",")[31]) + Double.parseDouble(line.split(",")[32]) + Double.parseDouble(line.split(",")[33]), Double.parseDouble(line.split(",")[34]), Double.parseDouble(line.split(",")[35]), Double.parseDouble(line.split(",")[36]));
        s.addScan(s4);
        Scan s5 = new Scan(line.split(",")[37], Double.parseDouble(line.split(",")[39]) + Double.parseDouble(line.split(",")[40]) + Double.parseDouble(line.split(",")[41]), Double.parseDouble(line.split(",")[42]), Double.parseDouble(line.split(",")[43]), Double.parseDouble(line.split(",")[44]));
        s.addScan(s5);
        
        //now read in extra data and add it at the appropriate place
        SimpleDateFormat format = new SimpleDateFormat("d-MMM-yy");
        if (!line.split(",")[46].equals("")){
          Date d1 = format.parse(line.split(",")[46]);
          for (Scan scan : s.getScans()){
            if (d1.before(scan.getDate())){
              scan.setKetamineDosage(scan.getKetamineDosage() + Double.parseDouble(line.split(",")[48]) + Double.parseDouble(line.split(",")[49]) + Double.parseDouble(line.split(",")[50]));
              scan.setDexdomitorDosage(scan.getDexdomitorDosage() + Double.parseDouble(line.split(",")[51]));
              scan.setAtipamezoleDosage(scan.getAtipamezoleDosage() + Double.parseDouble(line.split(",")[52]));
              scan.setIsofluraneDosage(scan.getIsofluraneDosage() + Double.parseDouble(line.split(",")[53]));
              break;
            }
          }
        }
        
        if (!line.split(",")[54].equals("")){
          Date d2 = format.parse(line.split(",")[54]);
          for (Scan scan : s.getScans()){
            if (d2.before(scan.getDate())){
              scan.setKetamineDosage(scan.getKetamineDosage() + Double.parseDouble(line.split(",")[55]));
              break;
            }
          }
        }
        
        if (!line.split(",")[56].equals("")){
          Date d3 = format.parse(line.split(",")[56]);
          for (Scan scan : s.getScans()){
            if (d3.before(scan.getDate())){
              scan.setKetamineDosage(scan.getKetamineDosage() + Double.parseDouble(line.split(",")[57]));
              break;
            }
          }
        }
        //last thing to do is add subject to array
        subjects.add(s);
      }
    } catch (Exception e) {
      System.err.println(line);
      e.printStackTrace();
    }
    
    //TODO write out the data
    
  }

}
