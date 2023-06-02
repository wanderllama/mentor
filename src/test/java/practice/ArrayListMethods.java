package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        //how to declare a new arrayList of Integer objects
        //<objectType> goes between <>->Character, Boolean, Integer, String, Double...
        ArrayList<Integer> nums = new ArrayList<>();

        //add(x) method will add element x to the arraylist
        nums.add(2);//[2]

        //add(y , x) method will add element x to arraylist at index y
        nums.add(0, 1);//[1 , 2]

        nums.get(1);

        //size() method returns an integer for the number of objects in arraylist
        //the index of last element is (size() - 1)
        int size = nums.size();//2

        //contains(x) method will search an arraylist for element x -> return boolean
        boolean hasX = nums.contains(2);//true

        //convert arraylist to array
        int[] xx = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            xx[i] = nums.get(i);
        }

        System.out.println("xx = " +Arrays.toString(xx));

        //not very useful but its here anyway
        //clone() method returns a shadow copy of existing arrayList
        Object clone = nums.clone();//declare new object named clone and assign it the value of arrayList nums

        System.out.println("clone = " + clone);

        //clear() method will remove elements from arrayList -> return empty arrayList
        nums.clear();//[]

        //declare/assign new Integer object array -> {1, 2, 3}
        //arraylist does not accept primitive types so we use Integer object type array
        Integer[] arrNum = {1, 2, 3};
        //the asList(arr) will convert arr to arraylist
        Arrays.asList(arrNum);
        //create new arraylist to add regular array values to
        //the arraylist listNum is created and the values from arrNum are added to arrayList automatically
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arrNum));

        //indexOf(x) method returns integer for index of object x in num arrayList
        int index = num.indexOf(2);//1 -> Integer 2 object is located at index 1 in arrayList

        //add(2) method will add Integer object with primitive value 2 to end of arrayList
        num.add(2);

        //lastIndexOf(x) method returns integer for index of last occurring object x in arrayList
        int lastIndex = num.lastIndexOf(2);//3 -> index of last occurring Integer object with value 2

        //way to create an arrayList and assign it values at same time
        ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //extra notes below -> mostly repeats

        ArrayList<String> strs = new ArrayList<>();
        strs.add("computer");//the add(x) method will add element x to the end of the arraylist on the right
        strs.add("screen");
        strs.add("mouse");
        strs.add("keyboard");
        strs.add("headphones");
        strs.add("speakers");

        System.out.println("strs = " + strs);

        strs.remove("headphones");//the remove(x) method will remove element x from the arraylist

        strs.remove(strs.size() - 1);//the remove(index) method will remove the elements at the specified index -> in this case the index value is size() - 1 which is always the last element

        String item1 = strs.remove(0);//can store an element that has been removed from an arraylist -> element at index 0 is stored in String variable item1

        System.out.println("strs = " + strs);

        boolean removed1 = strs.remove("mouse");//can get boolean value for if an item was removed from arraylist, if the element is in arraylist the element is removed and boolean value is true
        boolean removed2 = strs.remove("mouse");//if element is not in arraylist the boolean value false is stored in variable

        System.out.println(item1);
        System.out.println("removed1 = " + removed1);
        System.out.println("strs = " + strs);
        System.out.println("removed2 = " + removed2);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(100);
        nums2.add(200);
        nums2.add(300);

        System.out.println("nums2 = " + nums2);

        nums2.remove((Integer)200);//when using the remove method on primitive -> object arraylist the parameter hast to be cast from primitive to corresponding object type -> nums2.remove(200) will not work -> need (Integer) to cast the number

        System.out.println(nums2.contains(200));//the contains(x) method will search arraylist for x and return boolean value

        System.out.println("nums2 = " + nums2);

        nums2.clear();//the clear method will remove all elements from arraylist

        boolean empty = nums2.isEmpty();
        System.out.println("empty = " + empty);

        System.out.println("nums2 = " + nums2);

        nums2.add(125);

        nums2.set(0 , 100);//the set(x , y) method will replace element y at index x
        System.out.println("nums2 = " + nums2);
        nums2.set(0 , 50);//replace element 50 to index 0
        System.out.println("nums2 = " + nums2);
        /* nums2.set(1 , 25);//replace element 25 to index 0 -> can not use set method to add element to arraylist. if the index does not have element already then you receive IndexOutOfBoundsException error*/

        nums2.add(0 , 25);//will add element 25 to index 0 and move all elements from index 0 and greater to the right

        nums2.add(1 , 75);//will add element 75 to index 1 and elements at index 1 and greater will shift to the right

        System.out.println("nums2 = " + nums2);

        int index2 = nums2.indexOf(75);//indexOf(x) method will return the index position of element x -> index 1

        System.out.println("index2 = " + index2);
    }
}
