# 项目说明

此项目是用于 **生成 SDK** 和 **SDK-Connector** 的模板项目。

---

## 使用方法

执行以下命令以生成新项目：

先确保已经安装了 **Maven** ,并且拉取了 **ceta-archetype-plugin** 项目,然后在项目根目录下执行以下命令：

step1
```bash
mvn install
```
step2
```bash
mvn archetype:generate \
    -DgroupId=xxx \
    -DartifactId=xxx \
    -Dversion=xxx \
    -Dpackage=xxx \
    -DarchetypeArtifactId=ceta-archetype-plugin \
    -DarchetypeGroupId=com.ceta \
    -DarchetypeVersion=1.0-SNAPSHOT
```

---

## 参数说明

| 参数 | 说明 |
|------|------|
| `-DgroupId` | 要生成项目的 **groupId** |
| `-DartifactId` | 要生成项目的 **artifactId** |
| `-Dversion` | 要生成项目的 **版本号** |
| `-Dpackage` | 要生成项目的 **包名**<br>⚠️ **注意：`package` 不能以 `com.ceta` 开头，否则生成的项目在编译和运行时都会报错。** |


---

## 示例

```bash
mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=my-plugin \
    -Dversion=1.0.0  \
    -Dpackage=com.example.plugin \
    -DarchetypeArtifactId=ceta-archetype-plugin \
    -DarchetypeGroupId=com.ceta \
    -DarchetypeVersion=1.0-SNAPSHOT
```

step3\
执行了上述命令后，会在当前目录下生成一个名为 `my-plugin` 的项目,然后可以在该项目中进行开发。

如图
![my-plugin](./my-plugin.png)

step4\
开发完成后,在`my-plugin`项目根目录下执行以下命令，编译并安装项目：
```bash
mvn clean package
```
在target目录下会生成一个名为 `my-plugin-1.0.0-with-dependencies.jar` 的文件，这就是编译后的插件。\
如图
![my-plugin-jar](./my-plugin-jar.png)
