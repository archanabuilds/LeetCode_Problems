class Solution {
    public boolean canShip(int[] weights,int days,int capacity)
    {
        int daysNeeded = 1;
        int currentWeight = 0;
        for(int i = 0; i < weights.length; i++)
        {
            if(currentWeight + weights[i] <= capacity)
            {
                currentWeight += weights[i];
            }
            else{
                daysNeeded += 1;   
                currentWeight = weights[i];
            }
        }
       return daysNeeded <= days;
    }
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high  = 0;
        for(int i = 0; i < weights.length; i++)
        {
            low = Math.max(low,weights[i]);
            high += weights[i];
        }

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(canShip(weights,days,mid))
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}