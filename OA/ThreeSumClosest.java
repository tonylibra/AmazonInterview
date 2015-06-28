public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
        if(nums == null && nums.length < 3) {
			return Integer.MAX_VALUE;
		}
		
		Arrays.sort(nums);
		int closest = Integer.MAX_VALUE / 2; // Integer.MAX_VALUE + 1 = Integer.MIN_VALUE, otherwise it will overflow for operation
		for(int i = 0; i < nums.length-2; i++) {
			int start = i+1;
			int end = nums.length-1;
			while(start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if(sum == target) {
					return target;
				} else if(sum > target) {
					end--;
				} else {
					start++;
				}
				closest = Math.abs(sum - target) < Math.abs(closest - target) ? sum : closest;
			}
		}
		return closest;
    }
}