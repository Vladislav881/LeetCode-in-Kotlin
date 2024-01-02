package g0501_0600.s0581_shortest_unsorted_continuous_subarray

// #Medium #Array #Sorting #Greedy #Two_Pointers #Stack #Monotonic_Stack
// #2024_01_04_Time_233_ms_(89.29%)_Space_39.40_MB_(92.86%)

class Solution {
    fun findUnsortedSubarray(nums: IntArray): Int {
        fun findUnsortedSubarray(nums: IntArray): Int {
            var end = -2
            var max = Int.MIN_VALUE
            var start = -1
            var min = Int.MAX_VALUE
            val lengg = nums.size - 1

            for(i in nums.indices){
                max = Math.max(max, nums[i])
                min = Math.min(min, nums[lengg - i])
                if (nums[i] < max){
                    end = i
                }
                if (nums[lengg - i] > min){
                    start = lengg - i
                }
            }
            return end - start + 1
        }
}
