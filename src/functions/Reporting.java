package functions;

import configration.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Reporting.TestReportIndex("TC1","Login","Pass","10:00AM","11:00AM","TC1");
//Reporting.TestReportDetail("TS1","Open Browser","Pass","C:\\Users\\abhishek_katkojwar\\Desktop\\image001.jpg","TC1");
//Reporting.TestReportDetail("TS2","Close Browser","Pass","C:\\Users\\abhishek_katkojwar\\Desktop\\image001.jpg","TC1");

public class Reporting {
	
	public static int HeaderCnt=0;
	public static int HeaderCntIndex = 0,HeaderCntDetail = 0;
	
	public static void main(String args[]) throws IOException{
		Reporting.TestReportIndex("TC1","Login","Pass","10:00AM","11:00AM","TC1");
		Reporting.TestReportDetail("TS1","Open Browser","Pass","image001.jpg","TC1");
	}
	 public static void TestReportIndex(String TCID,String TestCaseName,String Status,String StartTime,String EndTime,String TC) throws IOException
     {
			File file = new File(Configration.ReportPath);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);

			
			
					
         
			bw.write("<html>");
			
			
			
            //bw.write("<title>AM WEB Automation Test Result</title>");
            
      		
       	 bw.write("<table width='300' border='1'>");
       	 
       	 
       	 bw.write("<style type='text/css'>");
    	 bw.write("<!--");
         bw.write(".style1 {");
         bw.write("font-size: x-large;");
         bw.write("font-weight: bold;}");
         bw.write("-->");
         bw.write("</style>");
         bw.write("<p>&nbsp;</p>");
         bw.write("<div align='center'><strong><font size='6'>AM WEB Test Result</font> </strong></div>");
         bw.write("<p>&nbsp;</p>");
       	 
       	 
       	bw.write("<tr>");
   	    bw.write("<td width='150' bgcolor='#0033FF'>Suite</td>");
   	    bw.write("<td width='150'>Smoke</td>");
   	    bw.write("</tr>");
        bw.write("<tr>");
         bw.write("<td width='150' bgcolor='#0033FF'>Run Date </td>");
       	 bw.write("<td width='150'>01-01-2015</td>");
         bw.write("</tr>");
           bw.write("<tr>");
           bw.write("<td width='150' bgcolor='#0033FF'>Run Start Time </td>");
         	 bw.write("<td width='150'>10:00 AM </td>");
         	 bw.write("</tr>");
          	 bw.write("<tr>");
          	 bw.write("<td width='150' bgcolor='#0033FF'>Run End Time </td>");
          	 bw.write("<td width='150'>11:00 AM </td>");
          	 bw.write("</tr>");
          	 bw.write("<tr>");
          	 bw.write("<td width='150' bgcolor='#0033FF'>Envirement</td>");
          	bw.write("<td width='150'>Test</td>");
          	bw.write("</tr>");
         	bw.write("<tr>");
          		bw.write("<td width='150' bgcolor='#0033FF'>Release</td>");
        		bw.write("<td width='150'>1.0</td>");
         			bw.write("</tr>");
         			bw.write("<tr>");
                 	 bw.write("<td width='150' bgcolor='#0033FF'>Machine Name</td>");
                 	bw.write("<td width='150'>Windows</td>");
                 	bw.write("</tr>");
                 	bw.write("<tr>");
                	 bw.write("<td width='150' bgcolor='#0033FF'>Browser</td>");
                	bw.write("<td width='150'>Firefox</td>");
                	bw.write("</tr>");
                	bw.write("<tr>");
                	 bw.write("<td bgcolor='#0033FF'>Platform</td>");
                	bw.write("<td width='150'>Web</td>");
                	bw.write("</tr>");
       			bw.write("</table>");
       
			
			
			
			
			
			
			
			
			bw.write("<table width='1000' border='1'>");

             if (HeaderCntIndex == 0)
             {
            	 bw.write("<style type='text/css'>");
            	 bw.write("<!--");
                 bw.write(".style1 {");
                 bw.write("font-size: x-large;");
                 bw.write("font-weight: bold;}");
                 bw.write("-->");
                 bw.write("</style>");
                 bw.write("<p>&nbsp;</p>");
                 bw.write("<div align='center'><strong><font size='6'>Automation Test Result</font> </strong></div>");
                 bw.write("<p>&nbsp;</p>");
                 bw.write("<tr>");
                 bw.write("<td width='60'  bgcolor='#0033CC' font color='white'><div align='center'>TCID</td>");
                 bw.write("<td width='200' bgcolor='#0033CC' font color='white'><div align='center'>TestCase Name </td>");
                 bw.write("<td width='100' bgcolor='#0033CC' font color='white'><div align='center'>Status</td>");
                 bw.write("<td width='100' bgcolor='#0033CC' font color='white'><div align='center'>Start Time </td>");
                 bw.write("<td width='100' bgcolor='#0033CC' font color='white'><div align='center'>End Time </td>");
                 bw.write("</tr>");
                 HeaderCntIndex++;
             }

            bw.write("<tr>");
            bw.write("<td width='60'><div align='center'><a href='"+TC+".html'>"+TCID+"</a></div></td>");
            bw.write("<td width='200'><div align='center'>" + TestCaseName + "</div></td>");

            if(Status == "Pass")
            {
                bw.write("<td width='100'><div align='center'><font color='Green'>" + Status + "</font></div></td>");
            }
            else
            {
                bw.write("<td width='100'><div align='center'><font color='Red'>" + Status + "</font></div></td>");
            }
            
            bw.write("<td width='100'><div align='center'>" + StartTime + "</div></td>");
            bw.write("<td width='100'><div align='center'>" + EndTime + "</div></td>");
            bw.write("</tr>");
            bw.write("</table>");
            bw.write("</body>");
            bw.write("</html>");
            
  
            bw.close();
     }
	 
	 public static void TestReportDetail(String Step, String Description, String Status, String ScreenShot,String TC) throws IOException
     {
			File file = new File(Configration.ReportPath_detail);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);

         
             bw.write("<html>");
             bw.write("<body>");
                               
             bw.write("<table width='1000' border='1'>");

             if(HeaderCntDetail == 0)
             {
                 bw.write("<style type='text/css'>");
                 bw.write("<!--");
                 bw.write(".style1 {");
                 bw.write("font-size: x-large;");
                 bw.write("font-weight: bold;}");
                 bw.write("-->");
                 bw.write("</style>");
                 bw.write("<p>&nbsp;</p>");
                 bw.write("<div align='center'><strong><font size='6'>Detail Report for " + TC + "</font> </strong></div>");
                 bw.write("<p>&nbsp;</p>");                  
                 bw.write("<tr>");
                 bw.write("<td width='60' bgcolor='#0033CC'><div align='center'>Step</td>");
                 bw.write("<td width='200' bgcolor='#0033CC'><div align='center'>Description</td>");
                 bw.write("<td width='100' bgcolor='#0033CC'><div align='center'>Status</td>");
                 bw.write("<td width='100' bgcolor='#0033CC'><div align='center'>Screen Shot </td>");
                 bw.write("</tr>");
                 HeaderCntDetail++;
             }
              bw.write("<tr>");
              bw.write("<td width='60'><div align='center'>" + Step + "</td>");
              bw.write("<td width='200'><div align='center'>" + Description + "</td>");

              if (Status == "Pass")
              {
                  bw.write("<td width='100'><div align='center'><font color='Green'>" + Status + "</font></div></td>");
              }
              else
              {
                  bw.write("<td width='100'><div align='center'><font color='Red'>" + Status + "</font></div></td>");
              }
              bw.write("<td width='100'><div align='center'><a href=" + ScreenShot + ">screen shot</a></td>");
              bw.write("</tr>");
              bw.write("</table>");
              bw.write("</body>");
              bw.write("</html>");
              bw.close();
         }
}
