当遇到springboot多模块项目的时候。

会碰到各种打包不成功的问题。

原则1: 被依赖的代码模块必须要干净，被依赖的模块不要有<build>标签。

```
    <!--依赖,被依赖的模块最好要干净-->
    <dependencies>
    </dependencies>

    <!--被依赖的项目是不能有build标签的，因为被依赖的项目仅仅是提供库-->
    <!--<build>-->
        <!--<plugins>-->
            <!--<plugin>-->
                <!--<groupId>org.springframework.boot</groupId>-->
                <!--<artifactId>spring-boot-maven-plugin</artifactId>-->
            <!--</plugin>-->
        <!--</plugins>-->
    <!--</build>-->
```

原则2: 必须要让父子模块关联起来。

parent-demo

```
    <modules>
        <module>service-demo</module>
        <module>web-demo</module>
    </modules>
```


service-demo

```
    <parent>
            <groupId>com.lanyage.multimodule</groupId>
            <artifactId>parent-demo</artifactId>
            <version>1.0-SNAPSHOT</version>
    </parent>
```


原则3: 直接安装父模块parent-demo.然后就可以启动web-demo了。

