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
public List<Integer> getRow(int rowIndex) {
		List<Integer> row = null, pre = null;
		for (int i = 0; i <= rowIndex; i++) {
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				row.add(j == 0 || i == j ? 1 : pre.get(j) + pre.get(j-1));
			}
			pre = row;
		}
		return row;
	}


//######################################################################//
Time Complexity: O(N^2)
Space Complexity: O(n)
  
