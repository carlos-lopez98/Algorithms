package org.example;

import org.example.recursion.SwapNodesInPairs;

import java.util.List;


public class Main {
    public static void main(String[] args) {
//
//        int[][] matrix = {
//                {0, 1, 2, 3},
//                {4, 5, 6, 7},
//                {8, 9, 10, 11},
//                {12, 13, 14, 15}
//        };
//
//
//        int[] newArray = {5, 3, 15, 10, 11, 7, 0};
//        //{ 5, 3, 0, 10, 11, 7, 15}
//        //{ 5, 3, 0, 10, 7, 11, 15}
//        //{5, 3, 0, 7, 10, 11, 15}
//        //
//       BubbleSort.sortAscendingLeftToRight(newArray);
//        for(int num: newArray){
//            System.out.println(num +" ");
//        }

//        Node head = new Node(1);
//        Node one = new Node(2);
//        Node two = new Node(3);
//        Node three = new Node(4);
//        Node four = new Node(5);
//
//        Node headTwo = new Node(15);
//        Node seven = new Node(17);
//
//        headTwo.next = seven; // 15 -> 17 -> 4 -> 5
//
//        head.next = one; // 1 -> 2 -> 3 -> 4 -> 5
//        one.next = two;
//        two.next = three;
//        three.next = four;
//
//
//        Node intersecting = Intersection.intersectionLinkedList(head, headTwo);
//        System.out.println(intersecting.data);

//        int[] nums = {2, 5, 3, 4, 1,7,8,10};
//
//
//        System.out.println(Arrays.toString(nums));


//        StackNode head = new StackNode(1);
//        StackNode one = new StackNode(2);
//        StackNode two = new StackNode(3);
//        StackNode three = new StackNode(4);
//        StackNode four = new StackNode(5);
//
//        MyStack<Integer> stack = new MyStack<Integer>();
//
//        stack.push(head);
//        stack.push(one);
//        stack.push(two);
//        stack.push(three);
//        stack.push(four);
//
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop().data.toString());
//        }


//        StackMin minimumStack = new StackMin();
//
//
//
//        minimumStack.push(5);
//        minimumStack.push(33);
//        System.out.println("The minimum should be five result = " + minimumStack.peekMin());
//
//        minimumStack.push(1);
//        minimumStack.push(12);
//        System.out.println("The minimum should be one result = " + minimumStack.peekMin());
//        minimumStack.pop();
//        minimumStack.pop();
//        minimumStack.push(3);
//
//        System.out.println("The minimum should be threre result = " + minimumStack.peekMin());

//        StackOfPlates dinnerPlates = new StackOfPlates(2);
//
//        dinnerPlates.push(11);
//        dinnerPlates.push(15);
//
//        dinnerPlates.push(16);
//        dinnerPlates.push(11);
//
//        dinnerPlates.push(15);
//        dinnerPlates.push(16);
//
//        dinnerPlates.push(11);
//        dinnerPlates.push(15);
//
//        dinnerPlates.push(16);
//
//        System.out.println(dinnerPlates.popAt(0));
//        System.out.println(dinnerPlates.popAt(0));
//
//        System.out.println(dinnerPlates.topStack);
//
//        System.out.println(dinnerPlates.popAt(0));

//      Stack<Integer> intStack = new Stack<>();
//      intStack.push(10);
//      intStack.push(7);
//      intStack.push(15);
//      intStack.push(22);
//      intStack.push(3);

//
//      SortStack.sort(intStack);
//
//      while(!intStack.isEmpty()){
//          System.out.println(intStack.pop() + " ");
//      }

//        AnimalShelter shelter = new AnimalShelter();
//        Animal animal = new Animal();
//
//        Animal.Cat catOne = animal.new Cat(LocalDateTime.now());
//        Animal.Dog dogOne = animal.new Dog(LocalDateTime.now());
//
//        shelter.enQueue(catOne);
//        shelter.enQueue(dogOne);
//
//        System.out.println("Animal in front " + shelter.deQueueAny().getClass());

//        int[] array = new int[]{2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
//        CountingSort.countSort(array, 2, 10);
//        System.out.println();
//        for(int num: array){
//            System.out.print(num + " ");
//        }

//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(4);
//
//        one.next = two;
//        two.next = three;
//
//        Node secondOne = new Node(1);
//        Node secondTwo = new Node(3);
//        Node secondThree = new Node(4);
//
//        secondOne.next = secondTwo;
//        secondTwo.next = secondThree;
//
//        MergeTwoSortedLists mergeAlgo = new MergeTwoSortedLists();
//        Node newList = mergeAlgo.mergeTwoLists(one, secondOne);
//
//
//        while(newList != null){
//            System.out.print(newList.data + " ");
//            newList = newList.next;
//
//
//        }

//        int[] radixArray = {4725,4586,1330,8792,1594,5729};
//
//        RadixSort.radSort(radixArray,10,4);
//
//        System.out.println(Arrays.toString(radixArray));
//
//        BinarySearchTree intTree = new BinarySearchTree();
//        intTree.insert(25);
//        intTree.insert(20);
//        intTree.insert(15);
//        intTree.insert(27);
//        intTree.insert(30);
//        intTree.insert(29);
//        intTree.insert(26);
//        intTree.insert(22);
//        intTree.insert(32);
//
//
////
////        System.out.println(intTree.getValue(22).getData());
////        System.out.println(intTree.getValue(32).getData());
////        System.out.println(intTree.getValue(16).getData());
//
//
//        System.out.println(intTree.getMin());
//        System.out.println(intTree.getMax());


//       System.out.println(BestTimetoBuyandSellStocks.returnMaxProfit(new int[]{7,6,4,3,1}));
//
//        System.out.println(ValidParentheses.isValid("()[]{}"));
//        System.out.println(ValidParentheses.isValid("()"));
//        System.out.println(ValidParentheses.isValid("(())"));
//        System.out.println(ValidParentheses.isValid("{[]}"));
//        System.out.println(ValidParentheses.isValid("[}"));
//        System.out.println(ValidParentheses.isValid("(())("));


        /**
         * Test for MergedTwoSortedLists
         */

//        Node head = new Node(1);
//        Node one = new Node(2);
//        Node two = new Node(3);
//        Node three = new Node(4);
//        Node four = new Node(5);
//
//        Node headTwo = new Node(15);
//        Node seven = new Node(17);
//        headTwo.next = seven; // 15 -> 17 -> 4 -> 5
//
//        head.next = one; // 1 -> 2 -> 3 -> 4 -> 5
//        one.next = two;
//        two.next = three;
//        three.next = four;
//
//        Node newList = MergeTwoSortedLists.mergeTwoLists(headTwo, head);
//
//        while(newList != null){
//            System.out.println(newList.data + " ");
//            newList = newList.next;
//        }

        /**
         * Test for ValidPalindrome
         */

//        String one = "A man, a plan, a canal: Panama";
//        String two = "race a car";
//        String three = " ";
//
//        System.out.println(ValidPalindrome.checkIfPalindrome(one));
//        System.out.println(ValidPalindrome.checkIfPalindrome(two));
//        System.out.println( ValidPalindrome.checkIfPalindrome(three));

        /**
         * Test Area for Binary Search Trees
         */

//        BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(25);
//        tree.insert(20);
//        tree.insert(15);
//        tree.insert(27);
//        tree.insert(30);
//        tree.insert(29);
//        tree.insert(26);
//        tree.insert(22);
//        tree.insert(32);
//
//        System.out.println("Print PreOrder");
//        tree.printPreOrder();
//        System.out.println();
//        System.out.println("Print PostOrder");
//        tree.printPostOrder();
//        System.out.println();
//        System.out.println("Print InOrder");
//        tree.printInOrder();
//        System.out.println();
//        System.out.println("Print BFS");
//        tree.printBFSOrder();
//
//        System.out.println("After Inverting");
//        InvertBinaryTree.invertTree(tree.getRoot());
//        tree.printBFSOrder();
//
//        System.out.println(tree.getMax().getData());
//        System.out.println(tree.getMin().getData());


        /**
         * Test Area for encode and decode strings
         */

//        List<String> strings = new ArrayList<>();
//        strings.add("Hello");
//        strings.add("World");
//
//        List<String> emptyString = new ArrayList<>();
//        emptyString.add("");
//
//        String encoded = EncodeAndDecodeStrings.encodeString(emptyString);
//        List<String> decodedList = EncodeAndDecodeStrings.decodeString(encoded);
//
//        decodedList.forEach(System.out::println);

        /**
         * Test for product except self
         */

//        int[] input = new int[]{2,3,4,5};
//
//        int[] output = ProductExceptSelf.productExceptSelf(input);
//
//        Arrays.stream(output).forEach(System.out::println);

        /**
         * Test for isPalindrome
         */

//        String one = "racecar";
//        String two = "1a a1";
//        String three = "11122111";
//        String four = "0P";
//        String five = "A man, a plan, a canal: Panama";
//
//        System.out.println(ValidPalindrome.checkIfPalindrome(one));
//        System.out.println(ValidPalindrome.checkIfPalindrome(two));
//        System.out.println(ValidPalindrome.checkIfPalindrome(three));
//        System.out.println(ValidPalindrome.checkIfPalindrome(four));
//        System.out.println(ValidPalindrome.checkIfPalindrome(five));

        /**
         * Test for reverse linked list
         */
//        Node head = new Node(1);
//        Node one = new Node(2);
//        Node two = new Node(3);
//        Node three = new Node(4);
//        Node four = new Node(5);
//
//        head.next = one;
//        one.next = two;
//        two.next = three;
//        three.next = four;
//
//        Node reversed = ReverseLinkedList.reverseList(head);
//
//        while(reversed != null){
//            System.out.print(reversed.data + " ");
//            reversed = reversed.next;
//        }

        /**
         * Test for Longest Consecutive Sequence
         */
//        int[] nums = new int[]{100,4,200,1,3,2};
//        int[] numsTwo = new int[]{0,3,7,2,5,8,4,6,0,1};
//
//        System.out.println(LongestConsecutiveSequence.returnLongestConsecutiveSequence(numsTwo));

        /**
         * Test for longest substring without repeating characters
         */

//        String s = "abcabcbb";
//        System.out.println( LongestSubstringWithoutRepeatingCharacters.getLongestSubstring(s));

        /**
         * Testing for simplify path
         */

//        SimplifyPath path = new SimplifyPath();
//
//        path.simplifyPath("Hello//World//Woop/.././...");

        /**
         * Testing for House Robber II
         */

//        HouseRobberII newRobber = new HouseRobberII();
//        int robbed = newRobber.rob(new int[]{1,2,3});
//        System.out.println(robbed);

        /**
         * Testing for Maximum Product Subarray
         */

//        MaximumProductSubarray newProduct = new MaximumProductSubarray();
//
//        int max = newProduct.maxProduct(new int[]{2,3,-2,4});
//        System.out.println(max);

        /**
         * Testing for PrintStringInReverse
         */
//
//        PrintStringInReverse reverseIt = new PrintStringInReverse();
//        reverseIt.printInReverse("Hello");

        /**
         * Testing for ReverseString
         */
//        ReverseString reverseString = new ReverseString();
//        char[] sTo = new char[]{'H', 'E', 'L','L','O'};
//        reverseString.reverseString(sTo);
//
//        for(char curr: sTo){
//            System.out.print(curr + " ");
//        }

        /**
         * Testing swap nodes in pairs
         */

//        SwapNodesInPairs pairs = new SwapNodesInPairs();
//
//        SwapNodesInPairs.ListNode head = new List
//
//        pairs.swapPairs(head);

    }
}