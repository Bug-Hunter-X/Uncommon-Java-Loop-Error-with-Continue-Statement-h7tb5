# Uncommon Java Loop Error with Continue Statement

This repository showcases a subtle error involving the `continue` statement in a Java `while` loop. The error is that the number 5 is skipped and not printed. This is due to the `continue` statement which immediately skips to the next iteration of the loop. The solution demonstrates how to correct this behavior, ensuring that all numbers from 1 to 10 are printed.

## Bug Description:

The original code uses a `while` loop to print numbers from 1 to 10, but the `continue` statement skips the iteration where `i` is equal to 5. This results in an incomplete sequence of numbers being printed.   The solution is provided to clarify and correct the behavior.

## Bug Solution:

The solution modifies the loop to ensure the number 5 is printed correctly. The `continue` statement remains, but its functionality is appropriately integrated. 