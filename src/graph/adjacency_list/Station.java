package graph.adjacency_list;

import java.util.Vector;

class Station {

    public String name;
    public Vector transitions;

    public Station(String name) {
        this.name = name;
        this.transitions = new Vector();
    }

    public void addStation(Station transition) {
        for (int i = 0; i < this.transitions.size(); i++) {
            if (((Station) this.transitions.get(i)).name.equals(transition.name)) {
                return;
            }
        }
        this.transitions.add(transition);
    }

    public void printStation() {
        System.out.println(this.name + " : ");
        for (int i = 0; i < this.transitions.size(); i++) {
            System.out.println("=>" + ((Station) this.transitions.get(i)).name + "");
        }
        System.out.println();
    }
}
