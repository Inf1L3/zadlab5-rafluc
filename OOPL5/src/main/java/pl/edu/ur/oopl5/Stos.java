/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

public class Stos {

    private int[] stosTab = new int[50];
    private int i;

    public Stos() {
        for (int i = 0; i < this.stosTab.length; i++) {
            this.stosTab[i] = 0;
        }
        this.i = 0;
    }

    public double Pop() {
        if (this.i >= 1) {
            this.i--;
            return this.stosTab[this.i + 1];
        } else {
            return this.stosTab[this.i];
        }
    }

    public void Push(int nr) {
        if (this.i < this.stosTab.length - 1) {
            this.stosTab[this.i] = nr;
            this.stosTab[this.i] = nr;
            this.i++;
        } else if (this.i == this.stosTab.length - 1) {
            this.stosTab[this.i] = nr;
        } else {
            System.err.println("Stos jest pełny");
        }
    }
}
