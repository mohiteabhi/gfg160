int n = arr.length;
        List<int[]> modifiedHeights = new ArrayList<>();
        int[] frequency = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] - k >= 0) {
                modifiedHeights.add(new int[]{arr[i] - k, i});
            }
            modifiedHeights.add(new int[]{arr[i] + k, i});
        }

        modifiedHeights.sort(Comparator.comparingInt(a -> a[0]));

        int left = 0, right = 0, covered = 0, minDifference = Integer.MAX_VALUE;

        while (right < modifiedHeights.size()) {
            if (frequency[modifiedHeights.get(right)[1]]++ == 0) {
                covered++;
            }

            while (covered == n) {
                minDifference = Math.min(minDifference, modifiedHeights.get(right)[0] - modifiedHeights.get(left)[0]);

                if (--frequency[modifiedHeights.get(left)[1]] == 0) {
                    covered--;
                }
                left++;
            }
            right++;
        }

        return minDifference;