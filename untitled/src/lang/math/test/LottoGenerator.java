package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private int[] lottoNum;
    private final Random random = new Random();

    public int[] LottoMaker() {
        lottoNum = new int[6];
        for(int i = 0; i < lottoNum.length; i ++) {
            lottoNum[i] = random.nextInt(45) + 1;
            boolean isDuplicate = false;

            for(int j = 0; j < i; j ++) {
                if(lottoNum[i] == lottoNum[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate) {
                i --;
            }
            System.out.println(i + " , " + lottoNum[i]);
        }
        return lottoNum;
    }
}
