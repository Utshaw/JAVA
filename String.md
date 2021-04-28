# String
- immutable
- every time it's modified a new object is created
- optimized to StringBuilder when many Strings are added together, except in loops

## Usage
- Use String when you don't concatenate a lot of strings together on a loop
- Use StringBuilder when you concatenate strings in a loop and threadsafety is not an issue
- Use StringBuffer when you concatenate strings in a loop and threadsafety is important