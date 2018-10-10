package HomeTask_03_10;

import java.util.*;

public class lesson_03_10 {

    public static void main(String[] args) {

		String s = "";
		for(int i = 1; i < 9; i++) {
			s = s + i;
		}
		System.out.println(s);

		StringBuilder str = new StringBuilder();
		for(int i = 1; i < 9; i++) {
			str.append(i);
		}
		System.out.println(str);


        //Красное черное дерео!
		List<String> list = new LinkedList<String>();
		list.add("d");
		list.add("u");
		list.add("p");

		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			}

		for(String it : list)
			System.out.println(it);


		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Мама");
		map.put(2, "Мыла");
		map.put(3, "Раму");

		for(Map.Entry<Integer, String> pair : map.entrySet()) {
			Integer key = pair.getKey();
			String value = pair.getValue();
			System.out.println(key + " : " + value);
		}




        Set<Person> treeSet = new TreeSet<Person>();
        treeSet.add(new Person("Agi", 17));
        treeSet.add(new Person("Fh", 16));
        treeSet.add(new Person("Gogi", 17));
        treeSet.add(new Person("Aai", 17));
        treeSet.add(new Person("dd", 5));

        for(Person per : treeSet)
        {
            System.out.println(per.name + " " + per.age);
        }

    }


    //ДЗ
    //Сделать красиво, посмотреть как Числа Фибоначи через рекурсию
    //Создать класс OurLinkedList
    //Лист из классов Container
    //Реализовать add, find и remove

    //implements compareble
}
