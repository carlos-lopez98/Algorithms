package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Design a time-based key-value data structure that can store multiple values for the same key at
 * different time stamps and retrieve the key's value at a certain timestamp.
 * <p>
 * Implement the TimeMap class:
 * <p>
 * TimeMap() Initializes the object of the data structure.
 * void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
 * String get(String key, int timestamp) Returns a value such that set was
 * called previously, with timestamp_prev <= timestamp. If there are multiple such values,
 * it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
 * <p>
 * Example 1:
 * Input
 * ["TimeMap", "set", "get", "get", "set", "get", "get"]
 * [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
 * Output
 * [null, null, "bar", "bar", null, "bar2", "bar2"]
 * <p>
 * Explanation
 * TimeMap timeMap = new TimeMap();
 * timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
 * timeMap.get("foo", 1);         // return "bar"
 * timeMap.get("foo", 3);         // return "bar", since there is no
 * value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
 * <p>
 * timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
 * timeMap.get("foo", 4);         // return "bar2"
 * timeMap.get("foo", 5);         // return "bar2"
 * <p>
 * Constraints:
 * 1 <= key.length, value.length <= 100
 * key and value consist of lowercase English letters and digits.
 * 1 <= timestamp <= 107
 * All the timestamps timestamp of set are strictly increasing.
 * At most 2 * 105 calls will be made to set and get.
 */
public class TimeBasedKeyValueStore {

    class TimeMap {

        Map<String, List<TimeValue>> map;


        //Create a class called TimeValue - for our value and timestamp pair
        //The input string will be the key so it'll be a Map<String, TimeValue>
        class TimeValue {
            String value;
            int timestamp;

            public TimeValue(String value, int timestamp) {
                this.value = value;
                this.timestamp = timestamp;
            }

        }


        public TimeMap() {
            this.map = new HashMap<>();
        }

        //Creates a list assigned to a key - each item in list consists of a timestamp and a value
        //As per the constraints, all timestamps will always be ascending - essentially since it's sorted
        //You can perform a binary search to retrieve the alloted time stamp
        public void set(String key, String value, int timestamp) {

            //If map doesn't have the key - create a new empty arraylist for that key
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            //It's a list of TimeValues because a value can have multiple timestamps
            List<TimeValue> temp = map.get(key);
            temp.add(new TimeValue(value, timestamp));
        }

        public String get(String key, int timestamp) {

            if (!map.containsKey(key)) {
                return "";
            }

            //If you're looking for a particular time stamp
            //First you retrieve your list

            //Since timestamps are added in a linear ascending fashion we're able to use binary search
            List<TimeValue> list = map.get(key);
            int left = 0;
            int right = list.size() - 1;


            while (left <= right) {

                int midPoint = left + (right - left) / 2;
                TimeValue current = list.get(midPoint);

                if (current.timestamp == timestamp) {
                    return current.value;
                }

                if (timestamp < current.timestamp) {
                    right = midPoint - 1;
                } else {
                    left = midPoint + 1;
                }
            }

            //You return right because if you visualize the binary search
            //When you don't have a value in your set list
            //Returning right will return the value next biggest
            //So if you're looking for 4, but 4 is not a timestamp
            //But 3 is in the timestamp, this ensures three is returned

            if(right >= 0){
                return list.get(right).value;
            }

            return "";
        }
    }
}
