# Lab 3: Ascii art (week-long lab, 150 pts)

ASCII art is a graphic design technique that uses computers for presentation and consists of pictures pieced together from the 95 printable 
(from a total of 128) characters defined by the ASCII Standard. 
They can be simple


![example ascii art](https://i.pinimg.com/236x/41/9a/b2/419ab2116c5c218a3fb6adaf3e8e8400--ascii-art-keyboard.jpg)


or complex


![example ascii art](https://pbs.twimg.com/media/CIdWGtFWwAAlBu5.png)

In this lab, you will take an image represented as a 2D integer array, and then turn that array into ascii art that will be printed out in your teminal
Next, you will work on transforming the images that you outputted.

## Part 1: convert the 2D array into black/white ascii art (15 pts)

Images are composed of pixels. A pixel is the smallest unit of a digital image or graphic that can be displayed and represented on a digital device.
Pixels in a 2D array can be combined to form a complete image. The information represented in a pixel is the color. In software, we represent colors as numbers.
If you are interested in learning more about how colors are represented as integers, you can read more [here](https://web.stanford.edu/class/cs101/image-1-introduction.html)

Here is an example of an image represented by very few pixels


![pixel example](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTw3wwImjNFJTbLnhgQbLi0M9F0oz9GgGa6Ag&usqp=CAU)

1. Find a small png image (or you can use the one you provided). Download it and add it to this folder
2. In the main file, update the name of the image file to be your new image. 
3. For each value in your outputted 2D array, convert to a char array using the following conversion logic in the getBlackWhiteAscii method
 
If the integer value is less than 128, the charachter is a capital 'X'. Otherwise, it should be an empty space. 


4. print out your char array. Copy and paste it in your blackWhiteAscii.txt file

## Part 2: Greyscale ascii (15 pts)
That isn't super detailed. Let's make it a little more interesting. instead of having only two charachter values let's use getGreyAscii
* 0 to 25:‘M’
* 26 to 50:‘$’
* 51 to 76:‘o’
* 77 to 102:‘|’
* 103 to 127: ‘*’
* 128 to 152: ‘:’
* 153 to 178: ‘=’
* 179 to 204: ‘\’’ (note the escape character before the single-quote)
* 205 to 230: ‘.’
* 231 to 255: ‘ ’ (i.e., a single space)

Copy any paste your output into greyAscii.txt

## Part 3: Image rotation (35 pts)
Now let's rotate the image in the getRotatedGreyAscii method.
Here is an example of a simple rotated square


![rotated image](https://assets.leetcode.com/uploads/2020/08/28/mat1.jpg)


Before you start coding, consider the following questions (and add to reflections.txt):
* What should the size of the outputted char array be?
* what happens to the first row?
* what happens to the first column?
* if the image width is 4, and the height is 4, where does the pixel at 2,1 go? 


![4 by 4](http://theoryofprogramming.azurewebsites.net/wp-content/uploads/2017/12/rotate-1.jpg)


* in general, if a pixel in an image that is width of w and height h, where does the pixel at position i,j go to in the new array

Copy any paste your output into greyRotatedAscii.txt

## Part 4: Image resizing 
What if we have a really big image? If we try and run it through our program, 
the ascii art doesn't show up nicely because it is too big. 1000's of pixels don't show up nicely in our terminal. What can we do?

The answer is that we can resize our image to a desired size. We will do this in the getResizedGreyAscii method


![image resize](https://1mhowto.com/wp-content/uploads/2014/12/app-resizeme-512.png)


1. Ask clarifying questions (5 pts)
2. Walk through an example (5 pts)
3. List  edge cases(5 pts)
4. Describe approach as you would to a little cousin who does not know anything about computer science terms (15 pts)
5. Based off your description, identify keywords that hint what ds&a you should use in your implementation (5 pts)
6. Write Code (35 pts)
    1. Add comments describing what the code does 
    2. Handle edge cases
7. List 3 test cases based off edge cases, write tests  (15 pts)

resize your image to 100 x 100 px and copy the output into resizedAscii.txt

## Take it further: Image cropping
maybe instead of resizing the image, you only care about a certain section. Create a method that crops a given rectangle of the image

## Take it further 2: Add in color to your ascii art
[helpful link](https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println)
Note that the 2D array has been converted into a greyscale number rather than an RGB value. 
