<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
   <link rel="styleSheet" type="text/css" href="<%= request.getContextPath()%>/resources/css/style1.css">
</head>
<a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
<div class="errors">
 ${exception}
</div>
<div id="formprod" class="cadre">
<f:form modelAttribute="produit" action="saveProd" method="post"
enctype="multipart/form-data">
<table >
 <tr>
  <td>ID Produit</td>
  <td><f:input  path="idProduit"/></td>
  <td><f:errors path="idProduit" cssClass="errors"></f:errors> </td>
 </tr>
 <tr>
  <td>Designation</td>
  <td><f:input path="designation"/></td>
  <td><f:errors path="designation" cssClass="errors"></f:errors> </td>
 </tr>
 <tr>
  <td>Categorie</td>
  <td><f:select path="categorie.idCategorie" items="${categories}" itemValue="idCategorie" itemLabel="nomCategorie"></f:select></td>
  <td><f:errors path="designation" cssClass="errors"></f:errors> </td>
 </tr>
 <tr>
  <td>Description</td>
  <td><f:textarea path="description"/></td>
  <td><f:errors path="description" cssClass="errors"></f:errors> </td>
 </tr>
  <tr>
  <td>Prix</td>
  <td><f:input path="prix"/></td>
  <td><f:errors path="prix" cssClass="errors"></f:errors> </td>
 </tr>
  <tr>
  <td>Quantité</td>
  <td><f:input path="quantite"/></td>
  <td><f:errors path="quantite" cssClass="errors"></f:errors> </td>
 </tr>
 <tr>
  <td>Sélectionner?</td>
  <td><f:checkbox path="selectionne"/></td>
  <td><f:errors path="selectionne" cssClass="errors"></f:errors> </td>
 </tr>
 <tr>
 
  <td>Photo</td>
  <td>
  <c:if test="${produit.idProduit!=null}">
  <img src="photoProd?idProd=${produit.idProduit}"/>
  </c:if>
  </td>
  <td>
  <input type="file"  name="file"/></td>
 </tr>
 <tr>
  
  <td><input type="submit"  value="save"/></td>
 </tr>
 </table>
 </f:form>
 </div>
 
 <div id="tabProduits" class="cadre">
 <table class="tab1">
 <tr>
<th>ID</th><th>Designation</th><th>DESCRIPTION</th><th>Categorie</th>
<th>Prix</th><th>Quantite</th><th>Selectionne</th><th>Photo</th>
</tr>
<c:forEach items="${produits}" var="p">
<tr>
<td>${p.idProduit}</td>
<td>${p.designation}</td>
<td>${p.description}</td>
<td>${p.categorie.nomCategorie}</td>
<td>${p.prix}</td>
<td>${p.quantite}</td>
<td>${p.selectionne}</td>
<td><img src="photoProd?idProd=${p.idProduit}"/></td>
<td><a href="suppProd?idProd=${p.idProduit}">Supp</a></td>
<td><a href="editProd?idProd=${p.idProduit}">Edit</a></td>

</tr>
</c:forEach>
</table>
 
 </div>