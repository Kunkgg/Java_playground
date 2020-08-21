class Square {
    public static boolean isSquare(int n) {
      if (n < 0) {
        return false;
      }

      double sqr = Math.sqrt(n);
      if (sqr == (int) sqr) {
        return true;
      } else {
        return false;
      }
    }
}

class IsSquare {
    public static void main(String[] args){
        System.out.println("4 is square: " + Square.isSquare(4));
        System.out.println("16 is square: " + Square.isSquare(16));
        System.out.println("25 is square: " + Square.isSquare(25));
        System.out.println("38 is square: " + Square.isSquare(38));
        System.out.println("60 is square: " + Square.isSquare(60));
    }
}
