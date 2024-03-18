# Demo API 실행 방법

해당 프로젝트를 git clone 한 후에, 루트 디렉토리에서 다음 명령을 실행한다.
```
$ yarn install 또는 npn install
```
의존성 라이브러리가 모두 성공적으로 node_modules 폴더 하위에 다운로드 된 이후, 다음 명령을 실행한다.
```
$ yarn start 또는 npm run start
```
어플리케이션이 성공적으로 구동 된 이후에, 아래의 경로로 테스트한다.
```
$ curl -X GET http://< Hostname | IP >:8080/
```