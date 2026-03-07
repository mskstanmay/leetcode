class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        if(numRows == 1){
            List<Integer> R1 = new ArrayList<>();
            R1.add(1);
            res.add(R1);
            return res;
        }

        res = generate(numRows -1);
        List<Integer> prevR = res.get(numRows-2);
        List<Integer> currentR = new ArrayList<>();
        
        currentR.add(1); // Rows 1st element
        for(int i = 1; i < numRows-1;i++)
             currentR.add(prevR.get(i-1) + prevR.get(i)); // Row middle elements
        currentR.add(1); // Rows last element
        res.add(currentR);
        
        return res;
    }
}