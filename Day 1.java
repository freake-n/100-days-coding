/*  PAIR WITH GIVEN SUM (TWO SUM)

Given a array arr[] of n ontegers and a target value,
the task is to find whether there is a pair of elements in the array whose sum is equal to target.

INPUT: arr[]={0,-1,2,-3,1}, target=-2
OUTPUT: True
EXPLANATION: 1 + (-3) = -2

INPUT: arr[]={1,-2,1,0,5}, target=0
OUTPUT: False

*/


// APPROACH - 1   O(n^2)  

class Solution {
    boolean twoSum(int arr[], int target) {
        int f=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int a=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if((a+arr[j])==target)
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
            return true;
        else
            return false;
    }
}



// APPROACH - 2    O(n)     HashSet  ✅

class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet <Integer> set = new HashSet<>();
        for(int num:arr)
        {
            int x=target-num;
            if(set.contains(x))
                return true;
            set.add(num);
        }
        return false;
    }
}



// APPROACH - 3    O(n)     HashMap  ✅

class Solution {
    boolean twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int i=0;i<arr.length;i++)
        {
            int x=target-arr[i];
            if(map.containsKey(x))
            {
                if (x == arr[i]) 
                {
                    if (map.get(x) > 1)
                        return true;
                } 
                else 
                    return true;
            }
        }
        return false;
    }
}
