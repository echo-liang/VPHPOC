<%@ include file="/WEB-INF/tiles/global-include.jsp"%>

<div class="container">
	
	<div class="panel panel-default login-panel">
		<div class="panel-body">
			<div class="row">
				<div class="col-xs-5 vcenter-xs">
					<h1>${greeting}</h1>
					<h1>Current date time: ${curDateTime}</h1> 
					<h1>Version ${version}</h1>
				</div>
				
			</div>
		</div>
	</div>
	
	<!-- Ticket panel -->
	<div class="panel panel-info">
		<div class="panel-heading">
			<spring:message code="home.ticket.title" />
		</div>
		<div class="panel-body">
			<c:if test="${not empty tickets}">
				<table class="table table-hover" id="tbl_vphErrors">
	                <thead>
                        <tr>
                        	<th><spring:message code="home.ticket.id" /></th>
                            <th><spring:message code="home.ticket.no" /></th>
                            <th><spring:message code="home.ticket.ent" /></th>
                            <th><spring:message code="home.ticket.fileName" /></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${tickets}" var="ticket" varStatus="ticketLoop">
                        	 <tr>   
                        	 	<td class="col-md-3">
                        	 		${ticket.ticketID}
                                </td>                          
                                <td class="col-md-3">
                                	${ticket.ticketNO}
	                            </td>
	                            <td class="col-md-3 wordbreak">
	                            	<javatime:format value="${ticket.enteredDTM}" pattern="${VPHDisplayDateWithTime}"/>
	                            </td>
	                            <td class="col-md-3 wordbreak">
                                	${ticket.fileName}
                                </td>
                                
                        	</tr>
                        </c:forEach>
                     </tbody>
                </table>
			</c:if>				
		</div>
	</div>
	
</div>


