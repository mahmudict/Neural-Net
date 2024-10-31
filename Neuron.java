
import java.util.ArrayList;
import java.util.List;

public class Neuron{

    private String name;
    private double value;
    private double[] weights;
    private List<Neuron> prevLayer, nextLayer;


	public Neuron(String name, double value, double[] weights) {
		this.name = name;
		this.value = value;
		this.weights = weights;
		this.prevLayer = null;
		this.nextLayer = new ArrayList<Neuron>();
	}



    public Neuron(String name, double[] weights) {
	this.name = name;
	this.weights = weights;
	this.value = 0;
	this.prevLayer = new ArrayList<Neuron>();
	this.nextLayer = new ArrayList<Neuron>();
    }


    public Neuron(String name) {
	this.name = name;
	this.value = 0;  // default initial value
	this.prevLayer = new ArrayList<Neuron>();
	this.nextLayer = null;
    }


	public void connectLayers(List<Neuron> layerNeuronList, Direction direction) {

		for (Neuron n : layerNeuronList) {
			if (direction == Direction.PREV_LAYER) {
				prevLayer.add(n);
			} else {
				nextLayer.add(n);
			}
		}
	}


	public final String getName() {
		return this.name;
	}

	public final void setName(final String argName) {
		this.name = argName;
	}

	public final double getValue() {
		return this.value;
	}

	public final void setValue(final double argValue) {
		this.value = argValue;
	}

	public final double[] getWeights() {
		return this.weights;
	}

	public final void setWeights(final double[] argWeights) {
		this.weights = argWeights;
	}

	public final List<Neuron> getNextLayer() {
		return this.nextLayer;
	}

	public final void setNextLayer(final List<Neuron> argNextLayer) {
		this.nextLayer = argNextLayer;
	}

	public final List<Neuron> getPrevLayer() {
		return this.prevLayer;
	}

	public final void setPrevLayer(final List<Neuron> argPrevLayer) {
		this.prevLayer = argPrevLayer;
	}


}

