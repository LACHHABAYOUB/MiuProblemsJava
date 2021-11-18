static int hasNValues(int[] a, int n) {

        if (a.length < n)
            return 0;

        int[] specialArray = new int[n];
        int totalNumAdd = 0;
        boolean Flag;

        for (int x : a) {
            Flag = false;
            for (int y : specialArray) {
                if (x == y) {
                    Flag = true;
                    break;
                }
            }
            if (!Flag) {
                if (totalNumAdd >= n) return 0;
                specialArray[totalNumAdd] = x;
                totalNumAdd++;
            }
        }

        if (totalNumAdd == n) return 1;
        return 0;
    }