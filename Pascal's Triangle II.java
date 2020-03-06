// Given an index k, return the kth row of the Pascal's triangle.
//input : 3
//Output:[1,3,3,1]
'''
                1
              1   1
            1   2   1
          1   3   3   1
        1   4   6   4   1
      1   5   10  10  5   1
'''
//#############################################//
public List<Integer> getRow(int rowIndex){
    List<Integer> result = new ArrayList<Integer>();
    result.add(1);
    if(rowIndex == 0)
        return result;
    for(int i = 1;i<=rowIndex;i++){
        for(int j = i-1;j>0;j--){
            result.set(j,result.get(j-1)+result.get(j));
        }
        result.add(1);
    }
    return result;
}


//######################################################################//
Time Complexity: O(N^2)
Space Complexity: O(n)
  
