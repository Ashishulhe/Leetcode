class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        
       int shour=Integer.parseInt(startTime.substring(0,2));
       int smin=Integer.parseInt(startTime.substring(3,5));
       int ssec=Integer.parseInt(startTime.substring(6,8));

        int ehour=Integer.parseInt(endTime.substring(0,2));
        int emin=Integer.parseInt(endTime.substring(3,5));
        int esec=Integer.parseInt(endTime.substring(6,8));

        int stime=shour*3600+ smin*60 + ssec;

        int etime=ehour*3600+ emin*60 + esec;
        return etime-stime;
        
    }
}