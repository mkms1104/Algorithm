package exam.tmap;

public class Test02 {
    public int solution(int N, String S) {
        int result = 0;

        boolean[][] map = new boolean[N][10];
        String[] reserveList = S.split(" ");

        if (!S.equals("")) {
            for (String reserve : reserveList) {
                char colAlpha = reserve.charAt(reserve.length() - 1);
                int row = Integer.parseInt(reserve.substring(0, reserve.length() - 1)) - 1;
                int col = (colAlpha > 'G') ? colAlpha - 'A' - 1 : colAlpha - 'A';
                map[row][col] = true;
            }
        }

        for (boolean[] rows : map) {
            result += calculateReserveCount(rows);
        }

        return result;
    }

    private int calculateReserveCount(boolean[] row) {
        if (((row[1] || row[2]) && (row[5] || row[6])) || (row[1] || row[2]) && (row[5] || row[6])) return 0;

        boolean isPossibleTwoReserve = true;
        for (int i=1; i<row.length-1; i++) {
            if (row[i]) isPossibleTwoReserve = false;
        }
        return isPossibleTwoReserve ? 2 : 1;
    }
}
