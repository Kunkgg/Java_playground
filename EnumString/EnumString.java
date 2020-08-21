enum Size{
    SMALL {
        public String toString(){
            return "This is a small one.";
        }
    },

    LARGE {
        public String toString(){
            return "This is a large one.";
        }

        // public String name() {
        //     return "This name is LARG";
        // }
    }
}

class EnumString {
    public static void main(String[] args){
        System.out.println(Size.SMALL.toString());
        System.out.println(Size.LARGE.toString());
    }
}
