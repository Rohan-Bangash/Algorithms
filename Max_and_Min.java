public class MaxAndMin { 

	public static void main(String[] args) {
		
		int[] nums = {12,1,8,10,0,17};
		int max = nums[0];
        int min = nums[0];
		
		// find max	
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]>max)
			{
				max = nums[i];
			}
		}
		System.out.println("The Max number is: " + max);
		
		// find min
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]<min)
			{
				min = nums[i];
			}
		}
		
		System.out.println("The Min number is: " + min);
	}

}