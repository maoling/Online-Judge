package com.jobdu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.NEW;
/*
hs_10000_p   2007-01-17 19:22:53,315     253.035(s)
hs_10001_p   2007-01-17 19:22:53,315     253.846(s)
 * 
hs_10000_p   2007-01-17 19:22:53,315     253.035(s)
 hs_10001_p   2007-01-17 19:22:53,315     253.846(s)
hs_10002_m    2007-01-17 19:22:53,315     129.574(s)
hs_10002_p   2007-01-17 19:22:53,315     262.531(s)
 hs_10003_m   2007-01-17 19:22:53,318     126.622(s)
hs_10003_p   2007-01-17 19:22:53,318    136.962(s)
hs_10005_m   2007-01-17 19:22:53,318     130.487(s)
 hs_10005_p   2007-01-17 19:22:53,318     253.035(s)
hs_10006_m   2007-01-17 19:22:53,318     248.548(s)
hs_10006_p    2007-01-17 19:25:23,367   253.035(s)

 * */
public class Main_1130 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Log> list=null;
		Map<Log, String> map = null;
		Log log = null;		
		
						
		
        while(cin.hasNext()){
        	String s = cin.nextLine();
        	list = new ArrayList<Log>();
        	map = new HashMap<Log, String>();
        	
    		while (!(s.equals("")||s.length()==0)) {			       		
			    log = new Log();
				try {
					String taskName = s.split("\\s+")[0];
					String startTime_1 = s.split("\\s+")[1];
					String startTime_2= s.split("\\s+")[2];
					String runTime= s.split("\\s+")[3];
					
					if(taskName.equals("")){
						
						log.setTaskName(startTime_1);
						log.setStartTime(startTime_2+" "+runTime);
						log.setRunTime(Double.parseDouble(s.split("\\s+")[4].split("\\(")[0]));
					}else{
						
						log.setTaskName(taskName);
						log.setStartTime(startTime_1+" "+startTime_2);
						log.setRunTime(Double.parseDouble(runTime.split("\\(")[0]));
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			list.add(log);
	        map.put(log, s);	
	        s = cin.nextLine();
				
		}
			
					
        Collections.sort(list,new Comparator<Log>() {
				@Override
				public int compare(Log o1, Log o2) {
					if(o1.getRunTime()<o2.getRunTime()){
						return -1;
					}else if(o1.getRunTime()>o2.getRunTime()){
						return 1;											
					}else{	
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
						Date acceptTime1=null;
					    Date acceptTime2=null;
						try {
							acceptTime1 = sdf.parse(o1.getStartTime());
							acceptTime2 = sdf.parse(o2.getStartTime());
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					        
					    //对日期字段进行升序，如果欲降序可采用before方法
					    if(acceptTime1.after(acceptTime2)){
					    	return 1;
					    }else{
					    	return -1;
					    }					    						   
					}					 
				}        	           	          	   
		});
	
        for(Log l:list){
        	 System.out.println(map.get(l));  
        }
       
      }
           
		
	}
}





class Log{
	private String taskName;
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	private String startTime;
	private double runTime;
	public double getRunTime() {
		return runTime;
	}
	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}

}