package programmers.level4;

public class ConstructAirport {

    public int chooseCity(int n, int [][]city)
    {
        int answer = 0;

        for (int i = 0 ; i < n ; i++ ) {
            int base = city[i][0];
            int currentDistance = 0;
            int minDistance = 0;
            for (int j = 0 ; j < n ; j++ ) {
                if (i == j) { continue; }
                else {
                    currentDistance += Math.abs(base - city[j][0]) * city[j][1];
                }
            }
            if (i == 0) {
                minDistance = currentDistance;
                answer = i;
            }
            else if (minDistance > currentDistance) {
                minDistance = currentDistance;
                answer = i;
            }
        }

        return answer+1;
    }
    public static void main(String[] args)
    {
        ConstructAirport test = new ConstructAirport();
        int tn = 3;
        int [][]tcity = {{1,5},{2,2},{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }
}
