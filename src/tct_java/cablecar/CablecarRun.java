package tct_java.cablecar;

import java.util.Arrays;
import java.util.List;

public class CablecarRun {

    public static void main(String[] args) {

        List<List<CablecarInfo>> inputData = loadData();
        printInput( inputData.get(1), inputData.get(0) );

        Cablecar cablecar = new Cablecar();

        // 1. 정해진 케이블카를 탑승했을 때 도보 이동 거리를 구하는 기능
        int distance = cablecar.getWalkDistance( inputData.get(0) );
        printDistance(distance) ;

        // 2. 케이블카 중 일부를 선택하여 탑승할 때, 최소 도보 이동 거리를 구하는 기능
        int minDistance = cablecar.getMinWalkDistance( inputData.get(1) );
        printMinDistance(minDistance);
    }

    private static List<List<CablecarInfo>> loadData() {

        // 제공 데이터 세트 1
        List<CablecarInfo> fixCablecar = Arrays.asList(
                new CablecarInfo( 0, 2000 ),
                new CablecarInfo( 3000, 7000 ),
                new CablecarInfo( 6000, 9000)
        );
        List<CablecarInfo> allCablecar = Arrays.asList(
                new CablecarInfo( 0, 2000 ),
                new CablecarInfo( 1000, 5000 ),
                new CablecarInfo( 3000, 7000 ),
                new CablecarInfo( 4500, 9500 ),
                new CablecarInfo( 6000, 9000 )
        );

        List<List<CablecarInfo>> inputData = Arrays.asList(
                fixCablecar, allCablecar
        );

        return inputData;
    }

    private static void printInput( List<CablecarInfo> allCablecar, List<CablecarInfo> fixCablecar) {
        System.out.print( "[케이블카 정보]" );
        for ( int inx = 0 ; inx < allCablecar.size() ; inx++) {
            System.out.print( allCablecar.get(inx) );
            if ( inx < allCablecar.size() - 1 ) {
                System.out.print( ", " );
            }
        }
        System.out.println();
        System.out.print( "[정해진 케이블카 탑승]" );
        for ( int inx = 0 ; inx < fixCablecar.size() ; inx++ ) {
            System.out.print( fixCablecar.get(inx) );
            if ( inx < fixCablecar.size() - 1 ) {
                System.out.print( ", " );
            }
        }
        System.out.println();
    }

    private static void printDistance( int distance ) {
        System.out.println();
        System.out.println( "[정해진 케이블카 답승 결과] 도보이동 = " + distance );
    }

    private static void printMinDistance( int minDistance ) {
        System.out.println( "[최소 도보이동] 도보이동 = " + minDistance );
    }
}
