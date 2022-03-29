
<a name="paths"></a>
## 资源

<a name="65d9414ee3af852f54fee2f3d6a377a7"></a>
### 用户列表接口
User Controller


<a name="adduserusingpost"></a>
#### 添加用户
```
POST /user
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**addr**  <br>*必填*|用户地址|string|
|**Query**|**userName**  <br>*必填*|用户名|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[User](#user)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user
```


###### 请求 query
```
json :
{
  "addr" : "string",
  "userName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "addr" : "string",
  "age" : 0,
  "userId" : 0,
  "userName" : "string"
}
```


<a name="getuserbyidusingget"></a>
#### 根据 ID 查询用户信息
```
GET /user/{id}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Path**|**id**  <br>*必填*|用户 id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[User](#user)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/string
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "addr" : "string",
  "age" : 0,
  "userId" : 0,
  "userName" : "string"
}
```


<a name="updateuserbyidusingput"></a>
#### 根据用户id更新用户的接口
```
PUT /user/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**user**  <br>*必填*|user|[User](#user)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[User](#user)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/0
```


###### 请求 body
```
json :
{
  "addr" : "string",
  "age" : 0,
  "userId" : 0,
  "userName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "addr" : "string",
  "age" : 0,
  "userId" : 0,
  "userName" : "string"
}
```



