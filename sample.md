## 설치
블로그 내용을 작성하고, 배포하기전 로컬 환경에서 작성된 글 내용을 확인 해야합니다. 작성된 글 내용을 확인 하기 위해서는 로컬에 `jekyll` 블로그 환경을 다음과 같이 구성합니다.
1. ruby install

    ```
    공통:
        https://www.ruby-lang.org/ko/documentation/installation/
    osx:
        https://www.digitalocean.com/community/tutorials/how-to-install-ruby-on-rails-with-rbenv-on-macos
    ```

1. git clone https://github.com/somma-inc/somma-inc.github.io
1. bundle install

## 실행(로컬)

1. bundle exec jekyll serve
1. open http://localhost:4000 or 브라우저에서 http://localhost:4000 입력

## 배포(발행)

> Note: 로컬 상에서 작성 중인 블로그 내용을 절대 master branch에 push 하지 않도록 주의 할 것 필요하다면 별도 branch를 만들고 push하는 것을 권장함.

```
git commit -m '...'
git push origin master
```

## 새 글 작성
1. _draft 디렉토리에 `적당한이름.md` 이름으로 파일을 만들고
1. 글을 마크다운 형식으로 작성

    > [gfm](https://github.com/biospin/BigBio/blob/master/reference/%EB%A7%88%ED%81%AC%EB%8B%A4%EC%9A%B4.md) 문법, [kramdown] 파서, [rouge] 문법강조기 사용

## 글 쓰기
1. `_posts` 디렉토리에 `yyyy-mm-dd-slug.md` 파일로 복사(or 이동)

   > slug: 해당 포스트의 고유 키로 `url`의 일부로 사용됨. 왠만하면 특수문자 없이 영문자, 숫자, 하이픈(-), 점(.)만 사용해야함

2. 파일 상단에 `front matter` 작성

   ```
   ---
   layout: post #레이아웃 (필수)
   author: `필자` (필수)
   title: `제목` (필수)
   date: `YYYY-MM-DD HH:MM:SS` # 발행일 (필수)
   description: `post 설명` (선택)
   tags: [tag1, tag2, tag3, ...] # 태그 목록(선택). 웬만하면 특수문자 없이 영문자,숫자,하이픈(-), 점(.)만 사용
   ---
   ```

3. 처음 글을 쓰는 필자라면 `_data/authors.yml` 파일에 글쓴이를 다음과 같이 등록(필수)

    ```
    ...
    authorname:
    name: 필자이름
    ```


4. 글에 들어가는 이미지들은 `assets\img\post\{yyyy-mm-dd-slug}`폴더에 업로드 해야함

## branch 관리

1. 만약 로컬 상에서 작성한 글을 `git`에 커밋하면서 관리 하고 싶다면 다음과 같은 `branch`를 별도 생성한다.

   > draft/{post_name}

2. 해당 branch에는 자유롭게 커밋을 해도 되고, 최종적으로 `pull request`를 통해 발행(배포)한다.

   > 주의: pull request를 merge할 때는 `squash merge`해야한다.

## 커밋 메시지 작성

커밋 컨벤션은 이 [주소]([https://github.com/somma-inc/docs/wiki/SOMMA-%EC%BB%A4%EB%B0%8B-%EC%BB%A8%EB%B2%A4%EC%85%98](https://github.com/somma-inc/docs/wiki/SOMMA-커밋-컨벤션))에 작성된 내용을 참고한다.

## 블로그 개발 관련 내용
1. index.html을 수정하면 포스트 리스트가 보이는 부분을 개발 하게 되는 것임
1. 블로그 초기 테마 개발자의 의도는 sass 파일 수정/추가 등의 작업을 한 후 컴파일하여 블로그에 적용 되도록 작업 했던거 같음. 그러나, 우린 `main.css` 파일을 수정하여 배포 하면됨
