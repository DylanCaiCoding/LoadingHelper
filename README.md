# LoadingHelper

English | [中文](README_CN.md)

>**This library was renamed [LoadingStateView](https://github.com/DylanCaiCoding/LoadingStateView).**

It is a highly expandable Android library for showing loading status view on the low-coupling way, the core function is implemented with a Kotlin file of over 200 lines. it not only shows different view like loading, content, error, empty and customized view when loading network data, but also manages title bar.

## Why rename

This library contains two functions for displaying loading status view and managing title bar, so it used a neutral name `LoadingHelper`. However, there are the following questions: 

- The name is not easily associated with the function of displaying loading status view
- It is also easy to misunderstand whether it is also possible to manage loading dialog. 
- While another function to manage the title bar is important, it's actually a secondary function to add decorative views

So decided to change the name to improve the readability of the code.
