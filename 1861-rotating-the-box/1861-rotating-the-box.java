class Solution {
    public char[][] rotateTheBox(char[][] box) {
        //(Neo Learns Gravity - Accio)
        int rows = box.length;
        int cols = box[0].length;
        for(int i = 0; i < rows; i++) {
            // for every row shift stones to empty boxes
            for(int j = cols - 1; j >= 0; j--) {
                if(box[i][j] == '#') {
                    // check whether next box is empty and slide
                    for(int k = j; k < cols - 1; k++) {
                        if(box[i][k + 1] == '.') {
                            box[i][k + 1] = '#';
                            box[i][k] = '.';
                        }
                        else break;
                    }
                }
            }
        }

        char[][] rotated = new char[cols][rows];
        for(int i = 0; i < cols; i++) {
            //invert the matrix
            for(int j = 0; j < rows; j++) {
                rotated[i][j] = box[j][i];
            } 

            //reverse every row
            int start = 0;
            int end = rows - 1;
            while(start < end) {
                char temp = rotated[i][start];
                rotated[i][start] = rotated[i][end];
                rotated[i][end] = temp;
                start++;
                end--;
            }
        }
        return rotated;

    }
}