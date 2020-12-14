public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static double movieAvgRating(int[][] ratings, int movie) {
        double add;
        double sum = 0;
        for (int c = 0; c<= ratings.length - 1; c++) {
            add = ratings[c][movie];
            sum = sum + add;
   
        }
        sum = sum / ratings.length;
        return sum;
    }

    //Question 2
    public static double reviewerAvgRating(int[][] ratings,int reviewer) {
           double add;
        double sum = 0.0;
    for (int r = 0; r<= ratings[reviewer].length - 1; r++) {
      add = ratings[reviewer][r];
      sum = sum + add;
    }
    sum = sum / ratings[reviewer].length;
    return sum;  
    }

    //Question 3
    public static double avgRating2018(int[][] ratings) {
        double add;
        double sum = 0.0;
    for (int r = 0; r<= ratings.length - 1; r++) {
      for (int c = 0;c <= ratings[0].length-1; c++) {
          add = ratings[r][c];
          sum = sum + add;      
        }
    }
    sum = sum / (ratings[0].length * ratings.length);
    return sum;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        int add;
        int sum = 0;
        int lowest = 0;
        int hardest = 0;

        for (int r = 0; r<= ratings.length - 1; r++) {
            for (int c = 0; c <= ratings[0].length - 1; c++) {
                add = ratings[r][c];
                sum = sum + add;
                if (r == 0) {
                    lowest = sum;  
                }
            }
            if (sum < lowest) {
                hardest = r;
            }
            if (r != 0) {
                sum = 0;
                
            }
        }
        sum = sum / (ratings[0].length * ratings.length);
        return hardest;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
         double add;
        double sum = 0.0;
        double lowest = 0.0;
        int worst = 0;
        
    for (int c = 0; c<= ratings[0].length - 1; c++) {
      for (int r = 0; r <= ratings.length - 1; r++) {
          add = ratings[r][c];
          sum = sum + add;
          if (c == 0) {
            lowest = sum;
            }
        }
        if (sum < lowest) {
         worst = c;   
        }
        if (c != 0) {
         sum = 0;   
        }
    }
    sum = sum / (ratings[0].length * ratings.length);
    return worst;
    }   
}