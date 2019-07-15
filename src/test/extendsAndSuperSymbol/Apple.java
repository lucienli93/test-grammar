package test.extendsAndSuperSymbol;

public class Apple extends Fruit {
    private String taste;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Apple [taste=" + taste + "]";
    }
}
