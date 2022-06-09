
## 올바른 URL 설계

1) Query string 과 path Variable


1) Query string
/users?id=123 # Fetch a user who has id of 123 
:users에 담긴 정보 중 id 123번의 자료를 달라는 요청이다.

2) Path Variable
/users/123 # Fetch a user who has id 123

) Query string과 Path variable은 각각 언제 쓰면 좋은가?
일반적으로 우리가 어떤 자원(데이터)의 위치를 특정해서 보여줘야 할 경우 Path variable을 쓰고, 정렬하거나 필터해서 보여줘야 할 경우에 Query parameter를 쓴다. 아래가 바로 그렇게 적용한 사례이다.

/users # Fetch a list of users
/users?occupation=programer # Fetch a list of programer user
/users/123 # Fetch a user who has id 123

즉, Query string과 Path variable이 이들 메소드와 결합함으로써 "특정 데이터"에 대한 CRUD 프로세스를 추가의 엔드포인트 없이 완결 지울 수 있게 되는 것인다.
(가령, users/create 혹은 users?action=create를 굳이 명시해 줄 필요가 없다.)

/users [GET] # Fetch a list of users
/users [POST] # Create new user
/users/123 [PUT] # Update user
/users/123 [DELETE] # remove user