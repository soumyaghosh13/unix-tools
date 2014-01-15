Unix Tools
====================
Basic Unix Tools like WordCount,Head,Tail,Uniq,Cut,Sort Done. ReduceSpace is Done.

## wc :
##### Stands for word count, wc displays a count of lines, words, and characters in a file.
    * sg_wc.sh filename

## head:
#### Head gives the first `n` lines from the given files.
    * sg_head.sh filename -[Number of lines]

## tail:
#### Tail gives the first `n` lines from the given files.
    * sg_tail.sh filename -[Number of lines]

## uniq:
#### Filters out the adjacent  repeated lines in a file.
    * sg_uniq.sh Filename

## cut :
#### Filters and gives the asked columns in given file.
    * sg_cut.sh filename FieldNumber [OPTIONS .. delimeter]

## sort:
#### Sorts the lines in a file according to given options: -r for reverse; -n for numeric sort. without options sort default by alphabet.
    * sg_sort.sh Filename [OPTIONS..]

## reduceSpaces:
#### Reduces more than one occurrences of blank spaces into one. Takes a input file and writes into another file.
    * sg_reduceSpaces.sh InputFile outputFile
