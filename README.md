# jqSystem

## gradle 相关
## git 相关
GIT工具是依靠文件来识别文件夹的，对于空的文件夹是不能识别的。
因此如果需要在代码中增加一个空文件夹，同时需要在文件夹中增加一个空文件.gitkeep
当批量增加空文件夹时，可以在GIT库的根目录下输入命令行
```
sudo find . -type  d -empty -and -not -regex ./\.git.* -exec touch {}/.gitkeep \;
```
该语句可以在所有的空文件夹下增加.gitkeep文件
