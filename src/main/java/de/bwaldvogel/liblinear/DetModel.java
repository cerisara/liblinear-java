package de.bwaldvogel.liblinear;

/**
 * The Model class does not provide any useful interace to the outside world: e.g., impossible to set weights.
 * It's not possible to extend it neither (and I dont like it anyway).
 * So I've introduced this "interface" just not to interfere with the original Model class, but still give access to its weights from the outside
 * 
 * @author xtof
 *
 */
public class DetModel {
	Model mod;
	public DetModel(Model m) {
		mod=m;
	}
	public double getWeight(int idx) {
		return mod.w[idx];
	}
	public void setWeight(int idx, double newval) {
		mod.w[idx]=newval;
	}
	public int getNweigths() {return mod.w.length;}
	public Model getModel() {
		return mod;
	}
}
