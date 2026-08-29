class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int index=-1;
        int ans=Integer.MAX_VALUE; // its min manhatten  distnace we willfind
        for(int i=0;i<drones.length;i++)
        {
            int x=drones[i][0];
            int y=drones[i][1];
            int range=drones[i][2];
            
            //find manhatten distnace
            int distance= Math.abs(x-target[0])+Math.abs(y-target[1]);
            if(range>=distance) //possible
            {
                if(distance < ans) //udate answer
                {
                    ans=distance;
                    index=i;
                }
            }
        }
        return index;
    }
}