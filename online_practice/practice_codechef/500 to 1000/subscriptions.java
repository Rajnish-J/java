// A new TV streaming service was recently started in Chefland called the Chef-TV.

// A group of N friends in Chefland want to buy Chef-TV subscriptions. We know that 6 people can share one Chef-TV subscription. 
// Also, the cost of one Chef-TV subscription is X rupees. 
// Determine the minimum total cost that the group of N friends will incur so that everyone in the group is able to use Chef-TV.

import java.util.*;

class subscription{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int group_members = sc.nextInt();
            int subs_cost = sc.nextInt();
            int flag = 0;
            int group = group_members / 6;

            if(group_members % 6 != 0){
                flag++;
            }
            System.out.println((subs_cost) * (flag + group));
        }
    }
}