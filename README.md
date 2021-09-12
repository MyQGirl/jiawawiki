# SpringBoot知识体系+Vue3 实战WIKI知识库系统

## 相关软件已传到QQ群文件中
* jdk-8u221-windows-x64.exe<br>
* ideaIU-2019.2.3.exe<br>
* Git-2.23.0-64-bit.exe<br>
* mysql-installer-community-5.7.27.0.msi<br>
* jdk-8u261-linux-x64.tar.gz<br>

## 源码下载
* 关于慕课网GIT说明：https://www.imooc.com/help/detail/111

* 使用下面的命令将源码从远程仓库拉取到本地，需要本地提前安装好git
```
git clone https://git.imooc.com/coding-474/jiawawiki.git
会配置ssh的，可以用ssh:
git clone ssh://git@git.imooc.com:80/coding-474/jiawawiki.git
```
* 数据库初始化脚本已传到QQ群中


## 项目初始化
* 需要本地安装好idea, nodejs，jdk1.8, mysql8.0/5.7, navicat（数据库可视化工具）
* 将下载好的源码，用idea打开
* 刷新maven依赖
* 安装vue cli，参照课程4-3
* 初始化web模块
```
cd web
npm install
```
* 新建数据库参照课程3-2，数据库配置在application.properties
* 数据库初始脚本从QQ群文件中下载

## 项目启动
* 启动服务端：WikiApplication
* 启动前端网站：web\package.json

## 页面访问
* 网站地址: http://localhost:8080<br>
初始用户名密码：test/test
