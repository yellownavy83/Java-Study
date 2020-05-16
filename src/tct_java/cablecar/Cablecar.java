package tct_java.cablecar;

import java.util.ArrayList;
import java.util.List;

public class Cablecar {


    /**
     * 정해진 케이블카를 탑승했을 때, 도보 이동거리를 구하는 기능
     * @param       inputData         탑승한 케이블카 정보
     * @return      int               도보 이동 거
     */
    public int getWalkDistance(List<CablecarInfo> inputData ) {

        int distance = 0;

        //////////////////여기부터 코딩 (1) ///////////////////////
        int goal = 10000;
        int current = 0;
        for (CablecarInfo car : inputData) {
            if(car.getStart() != current) {
                distance += Math.abs(car.getStart() - current);
            }
            current = car.getEnd();
        }
        if(current < goal) {
            distance += goal - current;
        }


        //////////////////<------------------------여기까지 코딩 (1)

        return distance;
    }

    /**
     * 케이블카 중 일부를 선택하여 탑승할 때, 최소 도보 이동 거리를 구하는 기능
     * @param                   inputData           모든 케이블카 정보
     * @return                  int                 도보 이동 거리
     */
    public int getMinWalkDistance( List<CablecarInfo> inputData ){

        int minDistance = 0;

        //////////////////여기부터 코딩 (2) ///////////////////////

        minDistance = function(inputData, 0, 0);
        //////////////////<------------------------여기까지 코딩 (2)

        return minDistance;
    }
    private int function(List<CablecarInfo> data, int idx, int position) {

        if (idx == data.size()) {
            return Math.abs(10000 - position);
        } else if (idx > data.size()) return 0;
        else {
            CablecarInfo here = data.get(idx);
            int include = function(data, idx + 1, here.getEnd()) + Math.abs(here.getStart() - position);
            int notin = function(data, idx + 1, position);
            if (notin < include) {
                return notin;
            } else {
                return include;
            }
        }

    }
}
