# Array Functions
## Arrays.equals(firstArray, secondArray)
- compares values of two arrays
```
int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};
System.out.println(Arrays.equals(arr1, arr2)); // true
```
## Arrays.fill(arrayName, value); | mutates
- fills array with certain value
```
Arrays.fill(arr1, 100);
System.out.println(Arrays.toString(arr1)); // [100, 100, 100, 100, 100, 100]
```
## Arrays.fill(array, startIdx, endIdx, value)
- fill the portion of the array from [startIdx, endIdx) with value
## Arrays.sort(arrayName) | mutates
- sorts in ascending order
## Arrays.toString(arrayName)
- returns a formatted string of the array
## 
- cope the specified array with a specified length
```
int[] newArr = Arrays.copyOf(arr1, 3);
System.out.println(Arrays.toString(newArr)); // [100, 100, 100]
```
## Arrays.binarySearch(array, value)
- array must be sorted
- returns the first index where the given value is found
- if not found negative value is returned
```
int searchIndex = Arrays.binarySearch(arr2, 6);
System.out.println(searchIndex); // 5
```
## Arrays.copyof
```
int[] c = Arrays.copyOf(b, 5); // first 5 elements
System.out.println(Arrays.toString(c)); // [1, 2, 30, 31, 99]
int[] d = Arrays.copyOfRange(b, b.length - 5, b.length); // last 5 elements
System.out.println(Arrays.toString(d)); // [2, 30, 31, 99, 100]
```