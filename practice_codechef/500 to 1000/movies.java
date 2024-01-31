// Watching Movies at 2x

// Chef started watching a movie that runs for a total of X minutes.

// Chef has decided to watch the first Y minutes of the movie at twice the usual speed as he was warned by his friends,
// that the movie gets interesting only after the first Y minutes.

// How long will Chef spend watching the movie in total?

// Note: It is guaranteed that Y is even.

import java.util.*;

class movies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_time = sc.nextInt();
        int twice_speed = sc.nextInt();

        int skip_time = twice_speed / 2 ;
        int reduced_time = total_time - twice_speed;

        System.out.println(reduced_time + skip_time);
    }
}