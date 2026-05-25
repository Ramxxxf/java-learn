# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Java 系统学习项目，从零基础到工程实战的渐进式课程。每个 Module 包含 lesson.md（课程文档）和可运行的代码示例。

## Project Structure

```
JavaLearn/
├── CLAUDE.md                  # 本文件
├── .gitignore
├── Tutorial/                  # 课程文档
│   ├── README.md              # 学习大纲总览
│   ├── Module00-Environment/  # 环境搭建
│   │   ├── lesson.md
│   │   └── examples/
│   ├── Module01-Basics/       # 语言基础
│   │   ├── lesson.md
│   │   └── examples/
│   └── ...                    # 后续 Module
└── hello-world/               # Maven 实践项目
    ├── pom.xml
    └── src/
        ├── main/java/com/example/
        │   ├── App.java
        │   └── basics/        # Module 示例代码
        └── test/java/com/example/
            └── AppTest.java
```

## Build & Run Commands

当前使用 JDK 25（兼容 JDK 21+），构建工具为 Maven。

```bash
# 编译
cd hello-world && mvn compile

# 运行主类
mvn exec:java -Dexec.mainClass="com.example.App"

# 或直接 java 命令
java -cp target/classes com.example.App

# 运行测试
mvn test

# 清理并打包
mvn clean package

# 编译独立示例文件（Tutorial 目录下）
cd Tutorial/Module01-Basics/examples
javac FileName.java && java FileName
```

## Git Workflow

- 每次修改代码后必须先 `git commit` 再 `git push`，不能有本地未推送的 commit
- 代理配置已在本地 git config 中设置

## Maven Conventions

- JDK 编译版本：21（target/source）
- 项目坐标：`com.example` / `hello-world`
- 包命名：`com.example.*`
