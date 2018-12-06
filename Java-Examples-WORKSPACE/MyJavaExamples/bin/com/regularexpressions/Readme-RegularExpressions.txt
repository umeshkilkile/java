Regular Expressions
	- Regular expressions are powerful and flexible text-processing tools. They allow you to specify, programmatically, complex patterns of text that can be discovered in an input string. Once you discover these patterns, you can then react to them any way you want. Although the syntax of regular expressions can be intimidating at first, they provide a compact and dynamic language that can be employed to solve all sorts of string processing, matching and selection, editing, and verification problems in a completely general way.
	- To describe an integer, you say that it’s one or more digits. In regular expressions, a digit is described by saying ‘\d’.
	- In Java, ‘ \ \ ‘ means "I’m inserting a regular expression backslash, so that the following character has special meaning
	- if you want to indicate a digit, your regular expression string will be ‘\\d’. If you want to insert a literal backslash, you say ‘\\\\’- However, things like newlines and tabs just use a single backslash: ‘\n\t’.
	- to say that a number might or might not be preceded by a minus sign, you put in the minus sign followed by a question mark, like this:
		-?

Quantifiers
	- A quantifier describes the way that a pattern absorbs input text
	
	• Greedy: 
		Quantifiers are greedy unless otherwise altered. A greedy expression finds as many possible matches for the pattern as possible. A typical cause of problems is to assume that your pattern will only match the first possible group of characters, when it’s actually greedy and will keep going until it’s matched the largest possible string.
	• Reluctant: 
		Specified with a question mark, this quantifier matches the minimum number of characters necessary to satisfy the pattern. Also called lazy, minimal matching, non-greedy, or ungreedy.
	• Possessive: 
		Currently this is only available in Java (not in other languages) and is more advanced, so you probably won’t use it right away. As a regular expression is applied to a string, it generates many states so that it can backtrack if the match fails. Possessive quantifiers do not keep those intermediate states, and thus prevent backtracking. They can be used to prevent a regular expression from running away and also to make it execute more efficiently.		