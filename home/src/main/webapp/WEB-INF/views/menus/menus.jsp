<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script src="${pageContext.request.contextPath}/js/menus/menus.js"></script>
<header class="main">
	<h2>Menu List</h2>
</header>
<h3>메뉴 목록</h3>

<div class="row">
	<div class="4u 12u$(small) box">
		<iframe src="menusZtree" name="menusZtree" width=100% height=400px></iframe>
	</div>
	<div class="8u$ 12u$(small)">
		<form id="formMenus" method="post" action="menus">
			<input type="hidden" name="_method" value="post">
			<div class="row uniform">
				<div class="6u 12u$(xsmall)">
					<label for="menuId">ID</label>
					<input type="text" name="menuId" id="menuId" value="" placeholder="The system will automatically generate an 'ID'" disabled="disabled" />
				</div>
				<div class="6u$ 12u$(xsmall)">
					<label for="menuNm">Name</label>
					<input type="text" name="menuNm" id="menuNm" value="" placeholder="Name" />
				</div>
				<div class="3u 12u$(xsmall)">
					<label for="useYn">Use</label>
					<div class="select-wrapper">
						<select name="useYn" id="useYn">
							<option value="Y">Yes</option>
							<option value="N">No</option>
						</select>
					</div>
				</div>
				<div class="9u$ 12u$(xsmall)">
					<label for="url">URL</label>
					<input type="text" name="url" id="url" value="" placeholder="URL" />
				</div>
			</div>
			<hr/>
				<!-- Break -->
				<div class="12u$">
					<ul class="actions">
						<li><input type="submit" value="submit" class="special" id="btnSubmit"/></li>
						<!-- <li><input type="reset" value="Reset" /></li> -->
					</ul>
				</div>
		</form>
	</div>
</div>