
public class SolutionTest {
    public static void main(String[] args) {
        assert "############5616".equals(Maskify.maskify("4556364607935616")) : "error";
        assert "############5616".equals(Maskify.maskify("4556364607935616")) : "error";
        assert "#######5616".equals(Maskify.maskify("64607935616")) : "error";
        assert "1".equals(Maskify.maskify("1")) : "error";
        assert "".equals(Maskify.maskify("")) : "error";

        // "What was the name of your first pet?"
        assert "##ippy".equals(Maskify.maskify("Skippy")) : "error";
        assert "####################################man!".equals(Maskify.maskify("Nananananananananananananananana Batman!")) : "error";
    }

}
