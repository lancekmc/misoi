<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Climate Data</title>
</head>
<body BGCOLOR="#FFFFFF">
    <div align="left">
        <h1>Add/Edit Climate Data</h1>
        <form:form action="saveClimate" method="post" modelAttribute="climate" style="background-color:#FFFFFF">   <!-- #E6F6FA -->   
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name of data source:
                <form:input path="data_source_name" /></td>
            </tr>
            <tr>
                <td>URL:
                <a href="#"><form:input path="url" /></td>
            </tr>
            <tr>
                <td>Date accessed:(Format YYYY-MM-DD)<form:input path="date_accessed" /></td>
                <tr><td></td></tr>
            </tr>
            <tr>
        		<td>
        			<label>Countries or regions covered:</label><form:select path="regions_covered">
                			<form:option value="">Choose region...</form:option>
                			<form:option value="global">Global</form:option>
                			<form:option value="north america">North America</form:option>
                			<form:option value="africa">Africa</form:option>
                			<form:option value="asia">Asia</form:option>
                			<form:option value="europe">Europe</form:option>
                			<form:option value="australia">Australia</form:option>
                			<form:option value="antarctica">Antarctica</form:option>
                			<form:option value="other">Other</form:option>
            			</form:select>
            			<label>Other region:</label><form:input path="other_region" /></td>
        			</ul>
        		          	
            </tr>
            <tr>
       		<td>
        		<label>Spatial scale:</label><form:select path="spatial_scale">
                			<form:option value="">Choose Scale...</form:option>
                			<form:option value="international">International</form:option>
                			<form:option value="national">National</form:option>
                			<form:option value="sub-national">Sub-national</form:option>
                			<form:option value="other">Other</form:option>
            			</form:select>
            			<label>Other spatial:</label><form:input path="other_spatial" /></td>
        			</ul>     	
            </td>
            </tr>
            <tr>
            	<td>Sampling Units (if available) e.g. households, weather sampling stations, satellite captures:<form:input path="sampling_units" /></td>
                <tr></tr>
            </tr>
            <tr>
       		<td>
        		<label>Individual or Aggregate data available:</label><form:select path="data_available">
                			<form:option value="">Choose...</form:option>
                			<form:option value="individual">Individual</form:option>
                			<form:option value="geo-spatial">Geo spatial</form:option>
                			<form:option value="na">N/A</form:option>
            			</form:select><label>Other Individual:</label><form:select path="other_indiv_aggre">
                			<form:option value="">Choose...</form:option>
                			<form:option value="both">Both</form:option>
                			<form:option value="neither">Neither</form:option></form:select><label>Specify other Aggregate:</label><form:input path="other_individual_char" /></td><ul></ul></td><ul>
            			
                			
                			
        			</ul>     	
            
            </tr>
            <tr>
       		<td>
        		<label>Individual characteristics:</label><form:select path="individual_characteristics">
                			<form:option value="">Choose...</form:option>
                			<form:option value="gender">Gender</form:option>
                			<form:option value="dob">DOB</form:option>
                			<form:option value="na">NA</form:option>
                			<form:option value="other">Other</form:option>
            			</form:select>
            			    <label>Other individual character:</label><form:input path="other_individual_char" /></td>
        			</ul>     	
            </td>
            </tr>                     
            <tr>
       		<td>
        		<label>Population characteristics:</label><form:select path="population_characteristics">
                			<form:option value="">Choose...</form:option>
                			<form:option value="rural">Rural</form:option>
                			<form:option value="urban">Urban</form:option>
                			<form:option value="na">NA</form:option>
                			<form:option value="other">Other</form:option>
                			</form:select>
            			<label>Other population character:</label><form:input path="other_population_char" /></td>
        			</ul>
            	
            </td>
            </tr>  
            <tr>
       		<td>
        		<label>Health data available?:</label><form:select path="health_data">
                			<form:option value="">Choose...</form:option>
                			<form:option value="n">No</form:option>
                			<form:option value="y">Yes</form:option>
            			</form:select>
            			<label>Type of Health data:</label><form:input path="other_health_data" /></td>
        			</ul>
            </td>
            </tr>  
            <tr>
       		<td>
        		<label>Climate data available?:</label><form:select path="climate_data">
                			<form:option value="">Choose...</form:option>
                			<form:option value="n">No</form:option>
                			<form:option value="y">Yes</form:option>
            			</form:select>
            			   <label>Type of Climate data:</label><form:input path="other_climate_data" /></td>
        			</ul>     	
            </td>
            </tr>      
            <tr>
       		<td>
        		<label>Social and/or economic data available?:</label><form:select path="socio_eco">
                			<form:option value="">Choose...</form:option>
                			<form:option value="n">No</form:option>
                			<form:option value="y">Yes</form:option>
            			</form:select>
            			<label>Type of Social and Economic data:</label><form:input path="other_socio_data" /></td>
        			</ul>     	
            </td>
            </tr>
                        <tr>
       		<td>
        		<label>Ecological data available?:</label><form:select path="eco_data">
                			<form:option value="">Choose...</form:option>
                			<form:option value="n">No</form:option>
                			<form:option value="y">Yes</form:option>
            			</form:select>
            			<label>Type of Ecological data:</label><form:input path="other_eco_data" /></td>
        			</ul>     	
            </td>
            </tr>
            <tr>
            	<td>Other kinds of data (e.g. vegetation):<form:input path="other_data" /></td>
                <tr><td></td></tr>
            </tr>
            <tr>
            	<td>Time periods or dates for available data:<form:input path="time_period_avail_data" /></td>
                <tr><td></td></tr>
            </tr>          
            <tr>
       		<td>
        		<label>Frequency of data collection:</label><form:select path="ferquency_data_coll">
                			<form:option value="">Choose Freq...</form:option>
                			<form:option value="yearly">Yearly</form:option>
                			<form:option value="monthly">Monthly</form:option>
                			<form:option value="weekly">Weekly</form:option>
                			<form:option value="daily">Daily</form:option>
                			<form:option value="other">Other</form:option>
            			</form:select>
            			<label>Other Frequency data collection:</label><form:input path="other_freq_data" /></td>
        			</ul>     	
            </td>
            </tr>               
            <tr>
       		<td>
        		<label>Open Source:</label><form:select path="open_source">
                			<form:option value="">Choose...</form:option>
                			<form:option value="n">No</form:option>
                			<form:option value="y">Yes</form:option>     	
                			</form:select>
            </td>
            </tr>
            
            <tr>
            	<td>Tasks involved in accessing the data:<form:input path="tasks_involved" /></td>
                <tr></tr>
            </tr>
            <tr>
            	<td>Obvious limitations or deficits:<form:input path="obvious_limitations" /></td>
                <tr></tr>
            </tr>
            <tr>
            	<td>Sample research question(s) linking data within and/or across datasets:<form:input path="sample_research_question" /></td>
                <tr></tr>
            </tr>
            <tr>
            	<td>Comments/other:<form:input path="comments" /></td>
                <tr></tr>
            </tr>
                <td colspan="4" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>