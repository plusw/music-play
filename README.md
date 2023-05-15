## 音乐播放网站
这是一个使用Java、HTML和JavaScript编写的音乐播放网站，具有从数据库读取音乐的功能，并提供自动播放、添加歌单等功能。该网站使用Python爬虫从网易云音乐爬取非VIP歌曲的原始地址。
### 网站功能
* 播放音乐：网站提供音乐播放功能，用户可以选择歌曲并播放。音乐会从数据库中读取相关信息，包括歌曲名、艺术家等。
* 添加歌单：用户可以创建自己的歌单，并将喜欢的歌曲添加到歌单中。歌单信息将保存在cookie中，以便用户可以下次访问和管理。
* 搜索功能：网站提供搜索功能，用户可以根据歌曲名、艺术家等关键词搜索歌曲，并进行播放或添加到歌单。
### 技术实现
* 前端：前端使用HTML、CSS和JavaScript构建。通过JavaScript与后端进行交互，实现音乐播放、歌单管理和搜索功能。
* 后端：后端使用Java编写，使用数据库存储音乐和歌单信息。后端与前端进行通信，提供音乐数据的读取和歌单管理功能。
* 数据库：网站使用数据库存储音乐和歌单信息。可以使用MySQL等关系型数据库管理系统。
* 爬虫：使用Python编写爬虫程序，从网易云音乐爬取非VIP歌曲的原始地址，并将这些地址存储到数据库中。

### 安装与运行
1. 确保你已经安装了Java Development Kit (JDK) 和数据库管理系统（如MySQL）。
2. 安装maven环境
3. 克隆或下载本网站的源代码到你的本地机器。
4. 在命令行窗口中，进入网站源代码所在的目录。
5. 运行以下命令启动网站：
  ``` css
  mvn tomcat7:run
  ```
  6.在浏览器中访问 http://localhost:8080/web-demo/home.html ，即可打开网站。
  ### 配置数据库
1.  在数据库管理系统中创建一个新的数据库。
2.  修改 config.ini 文件中的数据库连接信息，包括主机地址、端口号、数据库名称、用户名和密码。
 ### 贡献
 欢迎对本项目提出问题
  