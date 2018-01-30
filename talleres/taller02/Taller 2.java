

public class Taller2
{
    public static int MCD(int a, int b){
      
        if(a%b ==0) return b;
        
        else return MCD(b,a%b);
        
    }
    
  
   
   public static boolean groupSum(int start, int[] nums, int target) {
   if(start >= nums.length) 
   return target == 0;
   
   else
         return groupSum(start + 1, nums, target - nums[start])
         || (groupSum(start + 1, nums, target));
   }
