### Most used Java methods
- `<array>.length` - returns the length of the array.
- `<str>.length()` - returns the length of the string.
- `<str>.toCharArray()` - returns a char array from a string.
- `<str>.indexOf(<str>)` - returns index of the second string in first string if it exists else -1 returned.
- `<str>.contains(<str>)` - returns true if second string exists as a substring in the first one.
- `<str>.replace(old char, new char)` - replaces old char in string with new one. Need to reassign to see changes. Doesn't do inplace mutation.
- `<str1>.concat(<str2>)` - appends str2 to str1.
- `<str>.endsWith(suffix)`
- `<str>.startsWith(prefix)`
- `<str1>.equals(<str2>)` - use it to compare strings rather than ==; "==" for chars
- `<str>.isEmpty()`
- `<str>.toLowerCase()`
- `<str>.substring(start index, end index)` - returns substring from string from index start to end-1.
- `<str>.replaceAll(regex/char, new char)` - for removing all non-alphanumeric chars regex is [^a-zA-Z0-9].
- `String.valueOf(<char>/<int>)` - returns string from the other type. Can't directly typecast like (String).
- `<str>.trim()` - trim leading and trailing whitespaces.
> trim() removes a single leading white space and a single trailing white space, but does not remove multiple leading or trailing white spaces. strip() removes both leading and trailing white spaces from a string. stripLeading() removes leading white spaces but leaves trailing white spaces.
- `<str>.split(<regex>)` - if spilt by whitespace then pass "\\s+". This will consider more than one space for split. So even for "hello  world" we will get ["hello", "world"] instead of ["hello", " world"]. LEARN REGEX!
- `<str>.split("")` - to get each char as separate string in array.
- `String.join("," <array>)` - join array elements by ',' to get string.
- `new StringBuffer()` creates a mutable string object.
- `<strbuff>.append(<str>)`
- `<strbuff>.insert(index, string)`
- `<strbuff>.delete(start index, end index)`
- `<strbuff>.deleteCharAt(index)`
- `<strbuff>.isEmpty()`
- `<strbuff>.lastIndexOf(string)` and `<strbuff>.indexOf(string)`
  > new String(<char[] array>) will return a string from a char array.
- `StringBuilder` class
- `<strbuild>.append(<str>)`
- `<strbuild>.reverse()`
- `<strbuild>.toString()`

- `Arrays.sort(<array>)` - sorts the array in ascending order.
- `Arrays.binarySearch(<array>, ele)` - searches for an element in the array and returns the index of the element if found else returns a negative value.
- `Arrays.asList(<array>)` - will treat array as list. eg; Arrays.asList(1,2,3); Just a List not arraylist. whatever changes made to this list will reflect on original array. Can create a new ArrayList from this array saying new ArrayList<>(Arrays.asList(arr));
- `Arrays.fill(<array>, value)` - fills array with given value.
- `Arrays.toString(<array>)` - to print array to screen.
- `Arrays.copyOf(original array, new length)` - returns a copy of the array with new size; bigger.
- `Arrays.copyOfRange(array, start index, end index)` - creates subarray from start to end- 1 index.

- For printing arraylist to the screen no need to call **Arrays.toString()** method. Just use `System.out.println(<arraylist>)`.
- `<arraylist>.add(ele)` - adds an element to the arraylist.
- `<arraylist>.remove(index)` - removes an element at index from the arraylist.
- `<arraylist>.get(index)` - returns the element at the specified index.
- `<arraylist>.set(index, ele)` - sets the element at the specified index.
- `<arraylist>.clear()` - removes all the elements from the arraylist.
- `<arraylist>.isEmpty()` - returns true if the arraylist is empty else returns false.
- `<arraylist>.toString()` - converts the arraylist to a string.
- `<arraylist>.clone()` - returns a copy of the arraylist.
- `<arraylist>.size()` - returns the size of the arraylist.
- `<arraylist1>.addAll(<arraylist2>)` - appends all elements of list2 to list1.
- `<arraylist>.contains(ele)` - returns true if the arraylist contains the specified element else returns false.
- `<arraylist>.indexOf(ele)` - returns the index of the specified element in the arraylist.
- `<arraylist>.lastIndexOf(ele)` - returns the last index of the specified element in the arraylist.
- `<arraylist>.toArray()` - converts the arraylist to an array of objects.
- `<arraylist>.iterator()` - returns an iterator object. Can use methods like hasNext() and next() on the object.
- `<arraylist>.replaceAll(e -> e.toLowerCase())` - pass operator to replaceAll func to replace all values with new value.

- `<hashmap>.put(key, value)` - adds a key-value pair to the hashmap.
- `<hashmap>.get(key)` - returns the value of the specified key.
- `<hashmap>.remove(key)` - removes the key-value pair from the hashmap. Returns that pair.
- `<hashmap>.containsKey(key)` - returns true if the hashmap contains the specified key else returns false.
- `<hashmap>.containsValue(value)` - returns true if the hashmap contains the specified value else returns false.
- `<hashmap>.keySet()` - returns a set of all the keys in the hashmap.
- `<hashmap>.values()` - returns a collection of all the values in the hashmap.
- `<hashmap>.entrySet()` - returns a set of all the key-value pairs in the hashmap.
- `for(Map.Entry m: <hashmap>.entrySet())` - for iterating over the hashmap.
- `<hashmap_entry>.getKey()` - returns the key of the specified key-value pair.
- `<hashmap_entry>.getValue()` - returns the value of the specified key-value pair.
- `<hashmap>.clear()` - removes all the key-value pairs from the hashmap.
- `<hashmap>.isEmpty()` - returns true if the hashmap is empty else returns false.
- `<hashmap>.size()` - returns the number of key-value pairs in the hashmap.
- `<hashmap>.replace(key, value)` - replaces the value of the specified key with the specified value.
- `<hashmap>.putIfAbsent(key, value)` - creates key value pair in map if not already present. Returns "null" if successful.
- `<hashmap>.getOrDefault(key, 0)` - gets value of key or set default as 0.
- `<hashmap>.toString()` - to print hashmap to console.

> Stack<> stack = new Stack<>();
> Queue<> queue = new LinkedList();

- `<stack>.push(ele)` - adds an element to the stack.
- `<stack>.pop()` - removes the top element from the stack.
- `<stack>.peek()` - returns the top element from the stack. Can perform only if stack not empty.
- `<stack>.isEmpty()` - returns true if the stack is empty else returns false.
- `<stack>.search(ele)` - returns the position of the specified element in the stack.
  
- `<queue>.add()` - adds an element to the queue.
- `<queue>.remove()` - removes the front element from the queue.
- `<queue>.peek()` - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
- `<queue>.poll()` - Retrieves and removes the head of this queue, or returns null if this queue is empty.
- `<queue>.isEmpty()` - returns true if the queue is empty else returns false.
- `<queue>.isFull()` - returns true if the queue is full else returns false.
- `<queue>.size()` - returns the number of elements in the queue.
- `<queue>.clear()` - Removes all the elements from the set.
- `<queue>.contains(ele)` - returns true if the queue contains the specified element else returns false.
- `<queue>.toArray(new <type>[<queue>.size()])` - converts queue to array.
- `<priorityqueue>.poll()` - returns smallest element.
- `<arraydeque>.removeFirst()`, `<arraydeque>.removeLast()`, `<arraydeque>.getFirst()`, `<arraydeque>.getLast()`, `<arraydeque>.addFirst()`, `<arraydeque>.addLast()` are some extra methods provided by `ArrayDeque` class. All above methods also present. Just make sure that the instance type is Deque not Queue or else you will get compiler error.
- `Collections.addAll(queue, array)` - creates queue from array elements.
- `Collections.sort(<arraylist>)`

> `Set<> set = new HashSet/TreeSet/LinkedHashSet<>();` to create a set. 
- 

- Random rand = new Random(). Array[rand.nextInt(Array.length)] will return a random element from the array.
- Another way is:
  -  (int)(Math.random()*Array.length) gives random index.
  -  Array[Math.floor(Math.random()*Array.length)]

- `Integer.MAX_VALUE` gives max int value.
- `Integer.toBinaryString(<int>)` - to get binary representation for an int value.
- Scanner s = new Scanner(System.in); s.nextLine() will read whole line with spaces as well. But s.next() will terminate if any space is given.

- ```java
  switch(c){
    case 1:
      ...
      break
    case 2:
      ...
      break
    default:
      ...
  }
  ```

- in LinkedList if you have a pointer pointing to null and another pointer pointing to this one then essentially the second pointer is also pointing to null.
```java
  head = null;
  current = head;
```

so current is also null. now if head = new node() then make sure to do current = head so as to keep track of the current list.

- **Reverse a LL**
  Follow the steps below to solve the problem:
  1. Initialize three pointers prev as NULL, curr as head, and next as NULL.
  2. Iterate through the linked list. In a loop, do the following:
      ```java
      next = curr -> next
      curr -> next = prev
      prev = curr 
      curr = next
      ```
- `Pair<String, Integer> pair = new Pair<>(1, "apple");` creates a key-value pair. Can use `pair.getKey()` and `pair.getValue()`
- https://leetcode.com/problems/combination-sum/solutions/16502/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning
- `(Object(<int>/<char>)).getClass().getSimpleName()` - get type of int or char; for string just do `<str>.getClass().getSimpleName()`
- **The result of adding Java chars, shorts, or bytes is an int**
- **difference between consecutive chars will be 1; sum might be some huge integer value but for working on any binary kind of problems we can take advantage of this info like in Bit Manipulation**
- byte: Byte data type is an 8-bit signed two's complement integer.
  Short: Short data type is a 16-bit signed two's complement integer.
  int: Int data type is a 32-bit signed two's complement integer.
  long: Long data type is a 64-bit signed two's complement integer.
  float: Float data type is a single-precision 32-bit IEEE 754 floating point.
  double: double data type is a double-precision 64-bit IEEE 754 floating point.
  boolean: boolean data type represents one bit of information.
  char: char data type is a single 16-bit Unicode character.

- **Bitwise AND of any 2 numbers always results in a value that is less than or equal to the smaller of the 2 numbers.** 


### Most used Java Packages/Classes
- `Scanner` class from `java.util` package
- `Arrays` class from `java.util` package
- `ArrayList` class from `java.util` package
- `HashMap` class from `java.util` package
- `Stack` class from `java.util` package
- `Queue` class from `java.util` package 
- `Comparator` interface from `java.util` package
- `TreeSet` class from `java.util` pkg
> Just import java.util.* to import all the classes from the package.
- `Math` class from `java.lang` package (default)
- `String` class from `java.lang` package (default)
- `Integer` class from `java.lang` package (default)
- `Comparable` interface from `java.lang` package (default)

### Notes on Java
- Java is a procedural as well as an object-oriented language.
- It's a statically typed language.
![Java Intro](https://github.com/Ananya2001-an/java-practice/assets/55504616/59a0f088-b300-4a7c-b8be-d2608a6c6507)
- Every file name ending with extension ".java" is a class itself.
- Class names should start with capital letters. Though you can also start with small letters, it's not considered a good practice.
- each line has to end with a semicolon.
- **Character literals are enclosed in single quotes.** String literals are enclosed in double quotes.
- The public class name should be the same name as the file name.
- java. lang packages are by default imported in the java class by the JVM
- One can use wrapper classes like Integer instead of primitive datatype like int to add more functionality to the variables.
- Java supports unicode values meaning that it can support any language in the world.
- "==" is used to compare the values of two variables. It is used to compare the reference of two objects. To compare the values of two objects, we use the `equals()` method. Like `str1.equals(str2)`.
- Any function inside a static function also has to be static. Basically, a static function can only call other static functions. And even variables inside a static function have to be static. Else create an object of the class and call the function using that object.
- Primitive datatypes are stored in the stack while objects are stored in the heap.
- **Primitive datatypes are passed by value while objects are passed by reference.**
- References in Java abstract memory management, providing safety and simplicity by preventing common memory-related issues.
- Java abstracts away memory management. You create objects using the new keyword, and Java's garbage collector automatically reclaims memory when objects are no longer reachable.
- A reference points to an object in memory, but you don't directly manipulate memory addresses like in C.
- Shadowing is when a variable in a local scope has the same name as a variable in an outer scope. The local variable shadows the outer variable.
- Variable Arguments (varargs) are a feature that allows you to pass an arbitrary number of arguments to a method. Denoted by three dots (...), varargs are used when you don't know how many arguments will be passed to a method, or if you don't want to create a separate parameter for each argument.
- varargs should be the last parameter in a method's parameter list.
- array objects are in heap and heap objects are not continuous in memory. So array objects may not be continuous in memory.
- Reference variables are created at compile time but the objects are created at runtime i.e. dynamic memory allocation(DMA).
- "null" can be only assigned to reference variables and not primitive variables.
- Math class is available in java.lang package that means it's available by default.
- int[] arr can be also written as int arr[]. But the first one is preferred.
- Constructors are used to initialize the instance variables of a class. They are written as `<class_name_as_return_type>() {}`.
- final keyword is used to make a variable constant. It can't be changed once initialized.
- if an object is declared final then it can't be changed once initialized. Meaning the values of its properties can be changed but the object itself can't be changed. Can't be reassigned.
- if a method is declared final then it can't be overridden in the child class.
- file with same name can be used in different packages.
- static variables and methods in class are independent of objects. They can be accessed using class name.
- static blocks are executed to initialize static variables. They are executed when the class is loaded for the first time.
- static variables are resolved during compile time since they are not dependent on objects.
- If we want to create an instance of an inner class we have to declare it static or create an instance of the outer class first to access the inner class.
- files in same package can access each other without importing.
- call to super() must be the first statement in the constructor.
- super keyword is used to access the parent class members.
- `Multiple inheritance` is not supported in Java. But `Multilevel inheritance` is supported. Because let's say there are 2 classes A and B that are getting inherited by class C and both have a common prop like maybe name. So if we try to access name prop in class C then it will be ambiguous as to which name prop to access. So to avoid this, Java doesn't support multiple inheritance. 
- Since `Hybrid inheritance` is a combination of multiple and multilevel inheritance, it is also not supported in Java.
- **But using interfaces we can achieve multiple inheritance in Java.**
- There are 2 types of polymorphism in Java: `compile-time polymorphism` and `run-time polymorphism`.
  - Compile-time polymorphism is achieved using **method overloading**. It is also called `static polymorphism` or `early binding`. It is achieved by having multiple methods with the same name but different parameters. The compiler decides which method to call based on the parameters passed to the method. Example: multiple constructors.
  - Runtime polymorphism is achieved using **method overriding**. It is also called `dynamic polymorphism` or `late binding`. It is achieved by having a method in the parent class and the child class with the same name and same parameters. The compiler decides which method to call based on the object used to call the method (since object gets created at runtime). Example: toString() method.
- if a parent method is `final` then it can't be overridden in the child class.
- if a class is final then one can't inherit it.
- **you can inherit static methods, but you can't override them.** Because overriding depends on objects and static methods have no relation with objects, so they can't be overridden. Thus, the parent method would be called even if the child class has the same method.
- `Encapsulation` is the process of wrapping code and data together into a single unit. It is achieved by making the variables private and providing public getter and setter methods to access and update the variables. It's also called `data hiding`. Encapsulation helps in achieving abstraction. It's more of an implementation detail.
- `Abstraction` is the process of hiding the implementation details and showing only the functionality to the user. It is achieved by using abstract classes and interfaces. It's more of a design decision.
- classes, methods, variables, and constructors can't be accessed outside the package if they are not declared public.
![Access modifiers](https://github.com/Ananya2001-an/java-practice/assets/55504616/fe0f0c26-aef8-42e3-80a9-f6225847bcd4)
- `<object> instanceOf <Class>` - returns true if the object is an instance of the specified class else returns false.
- Abstract classes can have both abstract and non-abstract methods but interfaces can only have abstract methods.
- Abstract classes can have constructors but interfaces can't have constructors.
- Abstract classes can have static methods but interfaces can't have static methods.
- Abstract classes can have static variables but interfaces can't have static variables.
- Abstract classes can have final methods but interfaces can't have final methods.
- **We can't create an object of an abstract class since it's incomplete.** But we can create a reference variable of an abstract class.
- Constructors of abstract classes are called when the child class object is created.
- Multiple inheritance is not supported in abstract classes. Only with **interfaces**.
- **static methods inside interfaces need to have a body.**
- **Default methods are methods that can have a body.** The most important use of default methods in interfaces is to provide additional functionality to a given type without breaking down the implementing classes. Before Java 8, if a new method was introduced in an interface then all the implementing classes used to break.
- Since interface doesn't have a direct object, the only way to access them is by using a class/interface and hence that is why if interface variable exists, it should be static otherwise it wont be accessible at all to outside world. Now since it is static, it can hold only one value and any classes that implements it can change it and hence it will be all mess. Hence if at all there is an interface variable, it will be implicitly static, final and obviously public!!!
- **We can't create an object of an interface since it's incomplete.** But we can create a reference variable of an interface.
- Comparable interface is used to sort the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else. Can be used for defining custom comparison logic for 2 objects.
- catch block for a particular exception should be written before the catch block for its parent exception. Else it will give an error.
- `throw` keyword is used to throw an exception explicitly.
- `throws` keyword is used to declare an exception.
- `finally` block is used to execute important code such as closing connection, stream etc. It is executed whether an exception is handled or not.
- `Shallow copy` means that if we do any changes to the clone, the same are reflected in the original object as well. It is done using `clone()` method. So it's not a true copy.

### DSA points
-  **`TreeSet` allows you to only add unique elements and all those elements are stored in ascending order.**
-  You cant access elements directly from a TreeSet. Convert it to an arraylist to get element by index. Can also copy all elements to an array.
-  A **HashSet** is an unordered collection of unique elements. It is one of the most commonly used implementations of the Set interface.
- A **TreeSet** is an ordered collection of unique elements. It sorts the elements in natural order or according to a specified comparator.
- A **LinkedHashSet** is an ordered collection of unique elements. It maintains the order in which elements were inserted.
- **inplace** means no extra space used. **Stable** sort means original placement of duplicate elements should not be changed.  
