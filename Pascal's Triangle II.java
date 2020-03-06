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
    Integer[][] rows = new Integer[2][rowIndex +1];
    rows[0][0] = 1;
    rows[1][0] = 1;
    for(int i = 0;i<=rowIndex;i++) {
        for(int j = 1; j<i; j++) {
            rows[i%2][j] = rows[(i+1) % 2][j-1] + rows[(i+1) % 2][j];
        }
        rows[i%2][i] = 1;
    }
    List<Integer> result = Arrays.asList(rows[rowIndex % 2]);
    return result;
}


//######################################################################//
Time Complexity: O(N^2)
Space Complexity: O(n)
  
