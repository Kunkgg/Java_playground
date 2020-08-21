enum Size {
    SMALL, MEDIUM, LARGE;

    public String getSize(){
  // this will refer to the object SMALL
      switch(this) {
         case SMALL:
          return "small";

         case MEDIUM:
          return "medium";

         case LARGE:
          return "large";

         default:
          return null;
      }
}
}

class EnumClass{
    public static void main (String[] args){
        System.out.println("get size: " + Size.SMALL.getSize());
        System.out.println("oridinal: " + Size.SMALL.ordinal());
        System.out.println("name: " + Size.SMALL.name());
        System.out.println("toString: " + Size.SMALL.toString());
        System.out.println("SMALL campare to LARGE: " + Size.SMALL.compareTo(Size.LARGE));
        System.out.println("valueOf: " + Size.valueOf("SMALL"));
    }
}
