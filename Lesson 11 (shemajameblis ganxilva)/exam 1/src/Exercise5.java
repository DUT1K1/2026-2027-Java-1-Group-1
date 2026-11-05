void main() {
    int[][] matrix = {
            {3, 1, 2},
            {7, 0, 4},
            {1, 1, 1}
    };

    int maxSum = -2_000_000_000;
    int maxRow = 0;

    for (int i = 0; i < matrix.length; i++) {
        int rowSum = 0;
        for (int j = 0; j < matrix[i].length; j++) {
            rowSum += matrix[i][j];
        }
        System.out.println("რიგი " + i + ": " + rowSum);

        // maxSum = 11
        // maxRow = 1
        if (rowSum > maxSum) {
            maxSum = rowSum;
            maxRow = i;
        }
    }

    System.out.println("ყველაზე დიდი ჯამი აქვს რიგს: " + maxRow);
}