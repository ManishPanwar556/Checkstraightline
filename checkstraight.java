class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
      float x=coordinates[0][0]-coordinates[1][0];
        float y=coordinates[0][1]-coordinates[1][1];
        float slope;
        if(x==0){
            slope=100000;
        }
        else{
            slope=y/x;
        }
        for(int i=2;i<coordinates.length-1;i++){
            float slope1;
            float x2=coordinates[i][0]-coordinates[i+1][0];
            
            float y2=coordinates[i][1]-coordinates[i+1][1];
            if(x2==0){
                slope1=100000;
            }
            else{
            slope1=y2/x2;
            }
            if(slope!=slope1){
                return false;
            }
        }
        return true;
      
        
    }
    
}