<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="include/header.jsp" %>


<div class="row">

    <c:forEach var="post" items="${mpData}">
        <div class="col-md-4 col-sm-6">
            <div class="thumbnail" id="post_${post.getPostId()}">
              <img src="${pageContext.request.contextPath}/resources/images/${post.getImageURL()}" >
              <div class="caption">
                <h3>${post.getUsername()}</h3>
                <p>${post.getDescription()}</p>
                <p>Лайков: ${post.getLikes()}</p>
                <p>Комментариев: ${post.getCommentsCount()}</p>
              </div>
            </div>
        </div>
    </c:forEach>

</div>

<%@ include file="include/footer.jsp" %>