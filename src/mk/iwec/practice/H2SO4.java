package mk.iwec.practice;

public class H2SO4 {

    public int calculateMolecules(int hydrogen, int sulphur, int oxygen){
        int hydrogenCount = hydrogen / 2;
        int oxygenCount = oxygen / 4;
//        int smallestCount = Math.min(Math.min(hydrogenCount, oxygenCount), sulphur);
        if (hydrogenCount == oxygenCount && sulphur == hydrogenCount){
            return sulphur;
        } else{
            return Math.min(Math.min(hydrogenCount, oxygenCount), sulphur);
        }
    }

}
