public class ExpEval implements ExpAlg<IEval> {

    public IEval lit(final int x) {
	return new IEval() {
	    public int eval() { return x; }
	};
    }
	    
    public IEval add(final IEval e1, final IEval e2) {
	return new IEval () {
	    public int eval() { return e1.eval() + e2.eval(); }
	};
    }

}
