# LoadingHelper

[English](https://github.com/DylanCaiCoding/LoadingHelper) | 中文

>**本库已经改名为 [LoadingStateView](https://github.com/DylanCaiCoding/LoadingStateView)**。

这是一个深度解耦加载界面和标题栏的工具，核心功能只用了一个 Kotlin 文件实现，200 多行代码。不仅能在请求网络数据时**显示加载中、加载成功、加载失败、无数据的视图或自定义视图**，还可以**对标题栏进行管理**。

## 为什么改名

本库是包含了显示加载状态视图和管理标题栏两个功能，所以之前用了一个中性的名字 `LoadingHelper`。但这就导致有以下问题：

- 通过工具类名不容易联想到用于显示加载状态的视图。
- 容易误解是不是也能管理加载弹框。最初是有该功能，但是后来觉得功能太杂就砍了。
- 另一个管理标题栏虽然很重要，但其实算是一个添加装饰视图的辅助功能。

所以决定进行改名，提高代码的阅读性。

