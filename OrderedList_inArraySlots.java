public class OrderedList_inArraySlots {
	//fields
	private List_inArraySlots orderedList;
	//contructor
	public OrderedList_inArraySlots() {
		orderedList = new List_inArraySlots();
	}
	//methods
	public String toString() {
		return orderedList.toString();
	}

	public int size() {
		return orderedList.size();
	}

	public int get( int index) {
		return orderedList.get(index);
	}

	public void add( int value) {
		int index = 0;
		if (size() == 0) {
			System.out.println("yeah");
			orderedList.add(index, value);
		}
		else {
			for (int element = 0; element < size(); element ++) {
				if (get(element) > value) {
					System.out.println("yeah");
					index ++;
				}
				else {
					orderedList.add(index, value);
					break;
				}
			}
		}
	}

	public int remove( int index) {
		return orderedList.remove(index);
	}
}