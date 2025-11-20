# 项目说明

此项目是用于 **生成 SDK** 和 **SDK-Connector** 的模板项目。

---

## 使用方法

执行以下命令以生成新项目：

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
