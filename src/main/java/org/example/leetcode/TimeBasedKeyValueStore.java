package org.example.leetcode;

import java.sql.Time;
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

        //*Can store multiple values for the same key at different timestamps
        //Each value will technically be different because it'll have a different timestamp
        //Each key can have an associated value -> with multiple timestamps
        Map<String, List<TimeValue>> keyValueStore;

        public TimeMap() {
        keyValueStore = new HashMap<>();
        }

        //This represents our value - timestamp pair
        public class TimeValue{
            //This can have a value associated with multiple timestamps
            String value;
            Integer timestamp;
            public TimeValue(String value, Integer timestamp){
                this.value = value;
                this.timestamp = timestamp;
            }
        }

        public void set(String key, String value, int timestamp) {
            TimeValue current = new TimeValue(value, timestamp);

            //Pairs of value-timestamp associated with the key
            List<TimeValue> listPair;

            if(keyValueStore.containsKey(key)){
                listPair = keyValueStore.get(key);
                //Just add the new pair to the end of the existing list
                listPair.add(current);
            }
            //If no list is associated with the key
            else{
                keyValueStore.put(key, new ArrayList<>());
                List<TimeValue> temp = keyValueStore.get(key);
                temp.add(current);
            }
        }

        public String get(String key, int timestamp) {
        //When we try to retrieve a value - key will return a list of TimeValue
            if(keyValueStore.isEmpty() || !keyValueStore.containsKey(key)){
                return "";
            }

            List<TimeValue> listOfKeyValues = keyValueStore.get(key);

            int left = 0;
            int right = listOfKeyValues.size() - 1;

            while(left <= right){
                int midpoint = left + (right - left)/2;

                if(listOfKeyValues.get(midpoint).timestamp == timestamp){
                    return listOfKeyValues.get(midpoint).value;
                }

                if(listOfKeyValues.get(midpoint).timestamp < timestamp){
                    left = midpoint + 1;
                }else{
                    //This will push past the boundary on the last iteration
                    //And give you the lower ceiling boundary - IE if you asked for 3
                    //And you got 2 & 4, and mid = 2, then left will converge onto 4,
                    //Then in the next iteration 4 > 3, so right will be midpoint - 1
                    //Giving you the correct floor value
                    right = midpoint - 1;
                }
            }

            return right >= 0 ? listOfKeyValues.get(right).value : "";
        }
    }
}
