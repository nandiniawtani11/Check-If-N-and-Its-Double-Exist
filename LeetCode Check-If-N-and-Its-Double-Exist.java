class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                count=count+1;
            list.add(arr[i]);
        }
        System.out.print(list);
        for(int i:arr)
        {
            if(list.contains(2*i))
            {
                if(i==0 && count>1)
                    return true;
                else if(i!=0)
                    return true;    
            }
        }
        return false;
    }
}
