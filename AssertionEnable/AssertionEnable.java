class AssertionEnable {
  public static void main(String args[]) {
    String[] weekends = {"Friday", "Saturday", "Sunday"};
    assert weekends.length == 2 : "There are only 2 weekends in a week.";
    System.out.println("There are " + weekends.length + "  weekends in a week");
  }
}
