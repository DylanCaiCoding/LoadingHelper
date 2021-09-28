# LoadingHelper

[English](https://github.com/DylanCaiCoding/LoadingHelper) | 中文

>**本库已经改名为 [LoadingStateView](https://github.com/DylanCaiCoding/LoadingStateView)**。

这是一个深度解耦加载界面和标题栏的工具，只用了一个 Kotlin 文件实现，不算上注释少于 300 行代码。不仅能在请求网络数据时**显示加载中、加载成功、加载失败、无数据的视图或自定义视图**，还可以**对标题栏进行管理**。

## 为什么改名

本库是包含了显示加载状态视图和管理标题栏两个功能，所以之前用了一个中性的名字 `LoadingHelper`。但这就导致有以下问题：

- 通过工具类名不容易联想到用于显示加载状态的视图。
- 容易误解是不是也能管理加载弹框。最初是有该功能，但是后来觉得功能太杂就砍了。
- 另一个管理标题栏虽然很重要，但其实算是一个添加装饰视图的辅助功能。

所以决定进行改名，提高代码的阅读性。

## 迁移指南

如果你不是强迫症，可以不用迁移，因为功能并未改变。

巧用全局替换可节省迁移的时间。通过组合键 control + shift + R 会弹出全局替换弹框，注意需要亮起输入框右侧的 `Cc` 图标来匹配大小写，否则改类名时会把变量名一起改了。

替换规则：

| 原命名                              | 新命名                               |
| ----------------------------------- | ------------------------------------ |
| com.dylanc.loadinghelper            | com.dylanc.loadingstateview          |
| LoadingHelper.Adapter               | LoadingStateView.ViewDelegate        |
| LoadingHelper.DecorAdapter          | LoadingStateView.DecorViewDelegate   |
| LoadingHelper.setDefaultAdapterPool | LoadingStateView.setViewDelegatePool |
| LoadingHelper                       | LoadingStateView                     |
| setDecorAdapter                     | setDecorView                         |
| addChildDecorAdapter                | addChildDecorView                    |

经过上述的替换后，代码应该能正常运行。然后再修改涉及到的变量名或类名即可。

