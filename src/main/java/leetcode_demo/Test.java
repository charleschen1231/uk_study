package leetcode_demo;



import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        final int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
        int[] a={2,7,12,1,58};
        System.out.println(maxProfit( a ));
        final LinkedList<Integer> integers = new LinkedList<Integer>();
        Deque<Integer> stack=new LinkedList<Integer>(  );
       integers.add( 1 );
       integers.add( 5 );
       integers.add( 9 );
        final boolean empty = stack.isEmpty();
        System.out.println(empty);
        System.out.println(integers);
        System.out.println(integers.get( 0 ));

        stack.push( 1 );
        stack.push( 5 );
        stack.push( 9 );
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
        final Integer pop = stack.pop();
        System.out.println(pop);


    }


        public static int  maxProfit(int prices[]) {
            int minprice = Integer.MAX_VALUE;
            System.out.println(minprice);
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minprice) {
                    minprice = prices[i];
                } else if (prices[i] - minprice > maxprofit) {
                    maxprofit = prices[i] - minprice;
                }
            }
            return maxprofit;
        }




}
