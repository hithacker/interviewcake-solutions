package interviewcake;

public class Main {
    private static final int MULT_IDENTITY = 1;

    public int getMaxProfit(int[] stockPricesYesterday) {
        if (stockPricesYesterday.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
        int minPrice = stockPricesYesterday[0];

        for (int i = 1; i < stockPricesYesterday.length; i++) {
            int currentPrice = stockPricesYesterday[i];
            int profit = currentPrice - minPrice;
            maxProfit = Math.max(profit, maxProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }
        return maxProfit;
    }

    public int[] productOfOtherNumbers(int... ints) {
        int[] productsOfAllIntsBeforeIndex = new int[ints.length];

        int totalProductSoFar = 1;
        for (int i = 0; i < ints.length; i++) {
            productsOfAllIntsBeforeIndex[i] = totalProductSoFar;
            totalProductSoFar *= ints[i];
        }

        int afterProduct = 1;
        for (int i = ints.length-1; i > -1; i--) {
            productsOfAllIntsBeforeIndex[i] = productsOfAllIntsBeforeIndex[i] * afterProduct;
            afterProduct *= ints[i];
        }

        return productsOfAllIntsBeforeIndex;
    }

    //TODO: Remove hard coding of first three ints;
    public int highestProductOfThree(int... ints) {
        int highest = 6;
        int secondHighest = 3;
        int thirdHighest = 2;

        for (int i = 3; i < ints.length; i++) {
            int n = ints[i];

            if(n > highest) {
                thirdHighest = secondHighest;
                secondHighest = highest;
                highest = n;
            } else if(n > secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = n;
            } else if(n > thirdHighest) {
                thirdHighest = n;
            }
        }

//        int highestIndex = 0, secondHighestIndex = 0;
//
//        for (int i = 0; i < ints.length; i++) {
//            if(ints[i] > highest) {
//                highest = ints[i];
//                highestIndex = i;
//            }
//        }
//
//        for (int i = 0; i < ints.length; i++) {
//            if (highestIndex != i && ints[i] > secondHighest) {
//                secondHighest = ints[i];
//                secondHighestIndex = i;
//            }
//        }
//
//        for (int i = 0; i < ints.length; i++) {
//            if (highestIndex != i && secondHighestIndex != i && ints[i] > thirdHighest) {
//                thirdHighest = ints[i];
//            }
//        }

        return highest * secondHighest * thirdHighest;
    }
}
