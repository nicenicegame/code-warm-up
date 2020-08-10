"""
Read one or more files given as command line arguments
and print the running total for all files.
"""
from counter import Counter
import sys

if __name__ == '__main__':
    c = Counter()
    for arg in sys.argv[1:]:
        print("Read data from", arg)
        c.readfile(arg)
        print(f"Total of {c.count} values is {c.total:,.2f}")
