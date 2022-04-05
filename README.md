# 꿈꾸는 도서관

## 노션 
### [이동](https://paint-request-606.notion.site/b90a7002f86c4a91b88dd17c62e783fe)

<br><br>

## #0. 최종 목표
<ol>
    <li>MVC 패턴 적용</li>
    <li>회원가입으로 회원 추가</li>
    <li>회원탈퇴로 회원 삭제</li>
    <li>적절한 redirect/forward 사용으로 페이지 이동간 데이터 전송 및 숨김</li>
    <li>쿠키/세션 적용</li>
    <li>유효성 검사</li>
    <li>MyBatis <-> DB</li>
    <li>CRUD 구현 (꿈꾸는 수다방)</li>
    <li>페이징, 검색 기능 추가</li>
    <li>댓글/대댓글 구현</li>
    <li>AWS 배포</li>
    <li>DB변경 (현.MySQL -> Oracle)</li>



</ol>


<br>

## #1. 페이지별 기능
### `store.jsp`
#### 도서 검색
#### 도서 추가

<br>

### `read.jsp`
#### 도서 삭제
#### 도서 수정
#### 도서 대여

<br>

### `register.jsp`
#### 사용자 회원가입

<br>

### `login.jsp`
#### 로그인 페이지

### `community.jsp`
#### 꿈꾸는 수다방

<br>
<br>

## #2. 기능 세부사항
### 2-1. 도서
### ㄴ 1. 도서 검색
#### 검색 조건, 검색 후 페이징

<br>

### ㄴ 2. 도서 추가
<ol>
    <li>bno >> auto_increment</li>
    <li>bname >> 사용자 입력 </li>
    <li>bwriter >> 로그인한 사용자로 기본값</li>
    <li>breg_date >> 도서 등록 일자</li>
    <li>도서 수정 일자</li>
</ol>

<br>

### 2-2. 사용자
### ㄴ 1. 회원 가입
<ol>
    <li>uno >> auto_increment</li>
    <li>uid >> 사용자 입력 </li>
    <li>upwd >> 사용자 입력</li>
    <li>uname >> 사용자 입력</li>
    <li>ubirth >> 사용자 입력</li>
    <li>unickname >> 사용자 입력</li>
    <li>rentalCnt >> 대여 시 +1, 반납 시 -1</li>
</ol>

<br>

### ㄴ 2. 회원 탈퇴
#### 메인 화면에 '화면 탈퇴' 버튼 생성
<ol>
    <li>로그인시 confirm으로 재확인</li>
    <li>미로그인시 로그인 페이지로 이동</li>
</ol>

<br>

### 2-3. 수다 게시물
### 도서와 유서하지만 자유도가 더 높은 도서 페이지
