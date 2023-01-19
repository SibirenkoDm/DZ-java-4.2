public class BmiService {
    public int calculate(int massa, int height) {
        //int result;
        int height_sm = (height * height);
        int height_sm2 = (height_sm / 10000);

        int result = (massa / height_sm2);
        return result;
    }

}
