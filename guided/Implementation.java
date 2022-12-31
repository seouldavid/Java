package guided;

interface Implementation {
    int count(int[] a);
}

class Number implements Implementation {
    public int count(int[] a) {
        return a.length;
    }

}