### 1. 为了根号组织类，Java提供包机制，用于区别类名的命名空间，
包语法为：

```
package pkg1[. pkg2[. pkg3...]];

```
### 2. 一般利用公司域名作为包名
比如公司ywyx，包名则为ywyx

### 3. 此外，为能够使用一个包的成员，我们需要在Java程序中明确导入该包，使用“import”
```
import package1[.package2...].(classname|*);
```

注意下面是表示导入该包下的所有文件
```
import com.kuang.*
```