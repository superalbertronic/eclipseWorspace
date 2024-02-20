package mvc;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Restricciones extends GridBagConstraints {

	public Restricciones() {
		super();
	}

	public Restricciones addGridx(int gridx) {
		this.gridx = gridx;
		return this;
	}

	public Restricciones addGridy(int gridy) {
		this.gridy = gridy;
		return this;
	}

	public Restricciones addgridwidth(int gridwidth) {
		this.gridwidth = gridwidth;
		return this;
	}

	public Restricciones addgridheight(int gridheight) {
		this.gridheight = gridheight;
		return this;
	}

	public Restricciones addweightx(double weightx) {
		this.weightx = weightx;
		return this;
	}

	public Restricciones addweighty(double weighty) {
		this.weighty = weighty;
		return this;
	}

	public Restricciones addanchor(int anchor) {
		this.anchor = anchor;
		return this;
	}

	public Restricciones addfill(int fill) {
		this.fill = fill;
		return this;
	}

	public Restricciones addinsets(int insets) {
		this.insets = new Insets(insets, insets, insets, insets);
		return this;
	}

	public Restricciones addinsets(Insets insets) {
		this.insets = insets;
		return this;
	}

	public Restricciones addipadx(int ipadx) {
		this.ipadx = ipadx;
		return this;
	}

	public Restricciones addipady(int ipady) {
		this.ipady = ipady;
		return this;
	}
	
	public Restricciones getRestriccion( int pos){
		if(pos == 0 || pos == 4 || pos == 15){
			this.addgridwidth(1);
		}else if(pos == 3){
			this.addgridwidth(GridBagConstraints.REMAINDER);
		}else if(pos == 7){
			this.addGridy(3);
		}else if(pos == 10 || pos == 16){
			this.addgridheight(2).addGridy(GridBagConstraints.RELATIVE).addgridwidth(GridBagConstraints.REMAINDER);
		}else if(pos == 11){
			this.addgridheight(1).addgridwidth(1);
		}else if(pos == 14){
			this.addgridwidth(2).addGridy(5);
		}
		
		return this;
	}
}