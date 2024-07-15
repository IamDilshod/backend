package main

import "fmt"

func main() {
	var x int = 3
	var y int = 4;
	var sum = x+y
	fmt.Println(sum)

	var a, b int = 2,6
	fmt.Println(a+b)

	n,m:= 7,9
	fmt.Println(n+m)

	var str string = "salom"
	fmt.Println(len(str))

	if m>n {
		fmt.Println(" m > n")
	} else{
		fmt.Println("xato")
	}
}