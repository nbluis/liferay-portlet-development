<%
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<script type="text/javascript" src="javascript.js"></script>

<p>This is the <b>Demo Portlet</b> portlet in View mode.</p>

<!-- Render URL-->
<p><a href="<portlet:renderURL/>">Click to invoke Render Phase</a></p>

<!-- Action URL -->
<p><a href="<portlet:actionURL/>">Click to invoke Action Phase</a></p>


<!-- Resource URL -->
<p><a href="" onclick="loadXMLDoc('<portlet:resourceURL/>'); return false">Click to invoke Resource Serving Phase</a></p>
 
<div style="font: 16pt courier" id="myDiv"></div>
