# springboot integrate with swagger


<a name="overview"></a>
## Overview
API details for this demo project


### Version information
*Version* : 1.0


### Contact information
*Contact* : pluoci  
*Contact Email* : ayetony.miao@gmail.com


### URI scheme
*Host* : localhost:8080  
*BasePath* : /


### Tags

* 用户列表接口 : User Controller




<a name="paths"></a>
## Resources

<a name="65d9414ee3af852f54fee2f3d6a377a7"></a>
### 用户列表接口
User Controller


<a name="adduserusingpost"></a>
#### 添加用户
```
POST /user
```


##### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**addr**  <br>*required*|用户地址|string|
|**Query**|**userName**  <br>*required*|用户名|string|


##### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[User](#user)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


##### Consumes

* `application/json`


##### Produces

* `*/*`


##### Example HTTP request

###### Request path
```
/user
```


###### Request query
```
json :
{
  "addr" : "string",
  "userName" : "string"
}
```


##### Example HTTP response

###### Response 200
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


##### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Path**|**id**  <br>*required*|用户 id|string|`"0"`|


##### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[User](#user)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


##### Produces

* `*/*`


##### Example HTTP request

###### Request path
```
/user/string
```


##### Example HTTP response

###### Response 200
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


##### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|
|**Body**|**user**  <br>*required*|user|[User](#user)|


##### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[User](#user)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


##### Consumes

* `application/json`


##### Produces

* `*/*`


##### Example HTTP request

###### Request path
```
/user/0
```


###### Request body
```
json :
{
  "addr" : "string",
  "age" : 0,
  "userId" : 0,
  "userName" : "string"
}
```


##### Example HTTP response

###### Response 200
```
json :
{
  "addr" : "string",
  "age" : 0,
  "userId" : 0,
  "userName" : "string"
}
```




<a name="definitions"></a>
## Definitions

<a name="user"></a>
### User

|Name|Description|Schema|
|---|---|---|
|**addr**  <br>*optional*|用户地址  <br>**Example** : `"string"`|string|
|**age**  <br>*optional*|用户年龄  <br>**Example** : `0`|integer (int32)|
|**userId**  <br>*optional*|用户 ID  <br>**Example** : `0`|integer (int32)|
|**userName**  <br>*optional*|用户名  <br>**Example** : `"string"`|string|





