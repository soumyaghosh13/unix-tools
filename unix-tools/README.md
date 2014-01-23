Unix Tools
====================
Basic Unix Tools like WordCount,Head,Tail,Uniq,Cut,Sort Done and ReduceSpace is Done with Java.

## wc :
##### Stands for word count, wc displays a count of lines, words, and characters in a file.
    * sgWc.sh filename

## head:
#### Head gives the first `n` lines from the given files.
    * sgHead.sh filename -[Number of lines]

## tail:
#### Tail gives the first `n` lines from the given files.
    * sgTail.sh filename -[Number of lines]

## uniq:
#### Filters out the adjacent  repeated lines in a file.
    * sgUniq.sh Filename

## cut :
#### Filters and gives the asked columns in given file.
    * sgCut.sh filename FieldNumber [OPTIONS .. delimeter]

## sort:
#### Sorts the lines in a file according to given options: -r for reverse; -n for numeric sort. without options sort default by alphabet.
    * sgSort.sh Filename [OPTIONS..]

## reduceSpaces:
#### Reduces more than one occurrences of blank spaces into one. Takes a input file and writes into another file.
    * sgReduceSpace.sh InputFile outputFile
