## Java环境配置 & 第一个 Java 程序

## Java环境配置

> 码字不易，对你有帮助 **点赞/转发/关注** 鼓励一下作者 
>
> 更多鼓励，更多干货
>
> 微信搜公众号：**【不会编程的程序圆】**， **获取更详尽的干货合集**

## 思维导图

照着这篇文章做，你可以**轻松**配置好windows下 Java 的环境 

![](https://img-blog.csdnimg.cn/20200227171121163.png)

### 一：简介

- JDK : Java SE Development Kit   Java开发工具
- JRE : Java Runtime Environment Java运行环境

初期学习 java 下载好 JDK 然后使用一个简单编辑器即可，开始应当以 java 语法本身为重，而不是用多好或多高大上的编译器。

直接去官网下载即可，或者在我的公众号后台回复【jdk】即可获取。

![](https://img-blog.csdnimg.cn/20200227171159664.png)


**下面我一步一步手把手教你如何安装，每一步都有图**

### 二：安装JDK

以 64 位电脑为例。

![](https://img-blog.csdnimg.cn/2020022717122229.png)
点击下一步

![](https://img-blog.csdnimg.cn/2020022717123612.png)

**安装目录建议默认，避免以后出现一些问题**



![](https://img-blog.csdnimg.cn/20200227171251441.png)

![](https://img-blog.csdnimg.cn/20200227171259157.png)



### 三：配置环境

#### 1. 配置 JAVA_HOME

![](https://img-blog.csdnimg.cn/20200227171310122.png)
![](https://img-blog.csdnimg.cn/202002271713247.png)

![](https://img-blog.csdnimg.cn/20200227171332152.png)

注意新建的是**系统变量**

![](https://img-blog.csdnimg.cn/20200227171446925.png)

**路径记得改为你的安装目录**。



这是我的 JAVA_HOME 路径

> C:\Program Files\Java\jdk1.8.0_192

如图是我配置好的样子：

![](https://img-blog.csdnimg.cn/202002271713595.png)



#### 2. 配置 Path 
![](https://img-blog.csdnimg.cn/20200227171522294.png)

![](https://img-blog.csdnimg.cn/20200227171533364.png)
![](https://img-blog.csdnimg.cn/20200227171547411.png)

填写你的 JDK 安装的目录（如果你没改，就是 java 目录）中的 bin 目录的路径

我填写的路径是这个：

>C:\Program Files\Java\jdk1.8.0_192\bin

### 四：检验

![](https://img-blog.csdnimg.cn/20200227171632179.png)
打开命令行窗口。

![](https://img-blog.csdnimg.cn/2020022717164641.png)
输入 `java -version` 命令。



> 码字不易，对你有帮助 **点赞:thumbsup:/转发:arrow_right_hook:/关注 :eyes: ** 支持一下作者 
> 微信搜公众号：**不会编程的程序圆**
> **看更多干货，获取第一时间更新**

在运行第一个 java 程序之前，你需要先将 java 环境配置好。如果你还没有配置好，可以参考我的这一篇文章：[手把手教你配置 java 环境](https://blog.csdn.net/qq_44954010/article/details/104540128)

## 第一个 Java 程序

## 思维导图

跟着教程一步一步来，你可以**轻松**运行出你的第一个 java 程序！

![](https://img-blog.csdnimg.cn/20200227180405948.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)


### 一 ：下载一个编辑器

如果你觉得记事本用着比较爽或者你有其他的编辑器可以跳过这一步。

1. Sublime Text 
2. NotePad++ 

如果你觉得网上下载麻烦，关注我的公众号回复【st】即可获取 Sublime。

![](https://img-blog.csdnimg.cn/20200227180437157.png)


**下面我一步一步手把手教你如何安装，每一步都有图**

### 二：创建 .java 文件

以 sublime 为例。

#### 1 创建一个文件夹
![](https://img-blog.csdnimg.cn/20200227180448969.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)


![](https://img-blog.csdnimg.cn/20200227180457856.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)

这一步结束后就会弹出一个新的窗口，如下：

![](https://img-blog.csdnimg.cn/20200227180508476.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)



#### 2 在刚才创建的文件夹下创建 java 文件

点击新建文件，然后在导航栏内点开你新建的文件，按 **Ctrl + s（保存）** **将文件保存在你刚才创建的文件夹内**。

或者你自己在你的文件夹内创建一个 .java 文件，然后用 Sublime 打开即可。

**注意：** 文件后缀必须是 `.java`


![](https://img-blog.csdnimg.cn/20200227180602397.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)


当你完成上述步骤，应当是下面这个样子：

![](https://img-blog.csdnimg.cn/20200227180536146.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)


现在你可以在这个文件夹内写你的第一个 java 文件了！



### 三：第一个 java 程序

#### 编写

现在我们用 java 写一个 Hello World 吧！

```java
public class HelloWorld{//类，HelloWorld就是这个类的类名
	public static void main(String[] args) {//方法
		System.out.println("HelloWorld");
	}
}
```

**注意： 类名必须与你刚才创建的 .java 文件名一致**



#### 编译运行

1.我们先输入 `win + r` ，然后在弹出来的小窗口中输入 `cmd` 打开命令行窗口

![](https://img-blog.csdnimg.cn/20200227180622381.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)


2.然后我们要找到我们 java 文件所在的位置，这里给大家讲几个常用命令

`cd`: 进入文件夹

`dir`: 展示当前文件夹下的目录

`cd ..`：返回上一级文件夹

当前我们的位置是 `C:\Users\1` 我的 java 文件在 `D:\Javacode\2_29`

下来我一步一步演示如何进入我们 java 文件所在的目录

![](https://img-blog.csdnimg.cn/20200227180713445.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)
![](https://img-blog.csdnimg.cn/2020022718074658.png)

如果你觉的太麻烦，我再提供你另一个比较简单的方法：

1. 进入你的 java 文件所在的文件夹

![](https://img-blog.csdnimg.cn/20200227180800533.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)

2. `shift + 鼠标右键` （点击文件夹的空白位置）

   ![](https://img-blog.csdnimg.cn/202002271808100.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)

   

   ![](https://img-blog.csdnimg.cn/20200227180826311.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0OTU0MDEw,size_16,color_FFFFFF,t_70)

   然后就可以直接编译运行啦，不需要在命令行中寻找 java 文件的位置



3.编译和运行

编译和运行的指令：

> javac 编译
>
> java  运行



无论你第二步用的是 cmd 还是 powershell 编译和运行的命令都是一样的。我们以 cmd 打开的命令行窗口为例：
![](https://img-blog.csdnimg.cn/20200227180843864.png)
恭喜你！你已经是一个 Java 程序员啦！



>[0 基础学 java] 系列的代码可以在我的 Github 仓库查看，地址如下:
https://github.com/hairrrrr/Java_SE_EnjoyLearning
**欢迎 star ！（点一个 star 方便你下回查看）**
本系列的教学也可以在 GitHub 观看（GitHub 上所有文章的目录比较清晰，还能找到我都其他代码）。  

***
以上就是本次的内容。

如果文章有错误欢迎指正和补充，感谢！

最后，如果你还有什么问题或者想知道到的，可以在评论区告诉我呦，我可以在后面的文章加上你们的真知灼见。

**关注我**，看更多干货！

我是程序圆，我们下次再见。