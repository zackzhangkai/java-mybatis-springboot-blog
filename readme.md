# 启动mysql
```bash
docker run --name some-mysql -p33060:3306 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql
```