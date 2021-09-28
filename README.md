# LoadingHelper

English | [中文](README_CN.md)

>**This library was renamed [LoadingStateView](https://github.com/DylanCaiCoding/LoadingStateView).**

It is a highly expandable Android library for showing loading status view on the low-coupling way, it is implemented with a Kotlin code of less than 300 lines without comment statement . it not only **shows different view like loading, content, error, empty or customized view** when loading network data, but also **manages title bar.**

## Why rename

This library contains two functions for displaying loading status view and managing title bar, so it used a neutral name `LoadingHelper`. However, there are the following questions: 

- The name is not easily associated with the function of displaying loading status view
- It is also easy to misunderstand whether it is also possible to manage loading dialog. 
- While another function to manage the title bar is important, it's actually a secondary function to add decorative views

So decided to change the name to improve the readability of the code.

## Migration Guide

If you're not obsessive-compulsive, you don't need to migrate because the feature has not been changed.

Replace the rule：

| Old name                            | New name                             |
| ----------------------------------- | ------------------------------------ |
| com.dylanc.loadinghelper            | com.dylanc.loadingstateview          |
| LoadingHelper.Adapter               | LoadingStateView.ViewDelegate        |
| LoadingHelper.DecorAdapter          | LoadingStateView.DecorViewDelegate   |
| LoadingHelper.setDefaultAdapterPool | LoadingStateView.setViewDelegatePool |
| LoadingHelper                       | LoadingStateView                     |
| setDecorAdapter                     | setDecorView                         |
| addChildDecorAdapter                | addChildDecorView                    |

After the above replacement, the code should work fine and then change the variable or class names involved.

