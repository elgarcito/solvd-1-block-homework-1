public class Sorting {
    public static void main(String[] args) {
        int[] sortList = {2,1,2,3,4,3};
        //int actualNumber = sortList[0];
        //int pastNumber = 0;
        //insertion sort we compare the number with the predecesor
        for (int i = 0; i <= sortList.length - 1; i++) {
            for (int b = i; b <= sortList.length - 1; b++) {
                if (sortList[b]<sortList[i]){
                    //System.out.println(sortList[b]);
                    //System.out.println(sortList[i]);

                    int max =sortList[i];
                    sortList[i]=sortList[b];
                    sortList[b]=max;

                }
                // System.out.println("valor de i "+i);
                //System.out.println("valor de b "+b);
                //System.out.println("final: ");
                //for (int z:sortList) {
                //System.out.println("final: ");
                //  System.out.println(z);
                //}
            }
        }
        System.out.println("final: ");
        for (int z:sortList) {
            //System.out.println("final: ");
            System.out.println(z);
        }


    }

}


