import java.util.ArrayList;

public class ArrayQueue {
ArrayList<Person> q;

//default constructor
public ArrayQueue() {
    q = new ArrayList<>();
}
//add element to the end of the array
public void enQueue(Person P) {
    q.add(P);
}
//remove the first element in the array
public void deQueue() {
	q.remove(0);
}
//sort by last name
public void sortLastName() {
    sortQueueLastName(q, 0, q.size() - 1);
}
//sort by age
public void sortAge() {
    sortQueueAge(q, 0, q.size() - 1);
}

private int partitionName(ArrayList<Person> queue, int low, int high) {
        String pivot = queue.get(high).getLast();
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (queue.get(j).getLast().compareTo(pivot) > 0) {
                i++;
                // swap
                Person temp = queue.get(i);
                queue.set(i, queue.get(j));
                queue.set(j, temp);
            }
        }
        // swap
        Person temp = queue.get(i + 1);
        queue.set(i + 1, queue.get(high));
        queue.set(high, temp);
        return i + 1;
    }

private int partitionAge(ArrayList<Person> q, int low, int high) {
    //pivot is the last element
    double pivot = q.get(high).getAge();
    int i = (low - 1); // index of smaller element
    for (int j = low; j < high; j++) {
        // If current element is smaller than or
        // equal to pivot
        if (q.get(j).getAge() > pivot) {
            i++;
            //do swap
            Person temp = q.get(i);
            q.set(i, q.get(j));
            q.set(j, temp);
        }
    }
    //do swap
    Person temp = q.get(i + 1);
    q.set(i + 1, q.get(high));
    q.set(high, temp);
    return i + 1;
}

private void sortQueueLastName(ArrayList<Person> queue, int low, int high) {
    if (low < high) {
        int pi = partitionName(queue, low, high);
        // Recursively sort elements before
        // partition and after partition
        sortQueueLastName(queue, low, pi - 1);
        sortQueueLastName(queue, pi + 1, high);
    	}
	}

private void sortQueueAge(ArrayList<Person> queue, int low, int high) {
    if (low < high) {
        int pi = partitionAge(queue, low, high);
        // Recursively sort elements before
        // partition and after partition
        sortQueueAge(queue, low, pi - 1);
        sortQueueAge(queue, pi + 1, high);
    	}
	}

//print person list
public void displayQ() {
    for (Person p : q) {
        System.out.println(p.getFirst() + " " + p.getLast() + " - Age: " + 
        		p.getAge());
    	}
	}
}

