package guided;

interface Implementation {
    //public abstract method
    int count(int[] a);
}

class Number implements Implementation {
    //Abstract must be implented
    public int count(int[] a) {
        return a.length;
    }

}