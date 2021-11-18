static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0)
            return -1;

        if (n1 == n2)
            return 1;

        int x = 0;
        int y = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0)
                x++;
        }

        for (int j = 1; j <= n2; j++) {
            if (n2 % j == 0)
                y++;
        }

        if (x == y) return 1;
        return 0;
    }