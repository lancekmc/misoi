<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Climate DB</title>
</head>
<body BGCOLOR="#FFFFFF">
	<div align="center">
		<h1>Search Results</h1>
<!-- Search display section -->
		
		<table border="1">
			<th>Data Source Name</th>
			<th>URL</th>
			<th>Date accessed</th>
			<th>Regions covered</th>
			<th>Other regions</th>
			<th>Spatial scale</th>
			<th>Other spatial</th>
			<th>Sampling units</th>
			<th>Data available</th>
			<th>Other Individual/Aggregate</th>
			<th>Individual characteristics</th>
			<th>Other individual char</th>
			<th>Population characteristics</th>
			<th>Other population char</th>
			<th>Health data</th>
			<th>Other health data</th>
			<th>Climate data</th>
			<th>Other climate data</th>
			<th>Socio Econ</th>
			<th>Other socio economic</th>
			<th>Eco data</th>
			<th>Other eco data</th>
			<th>Other data</th>
			<th>Time period</th>
			<th>Frequency data collection</th>
			<th>Other freq data</th>
			<th>Open source</th>
			<th>tasks involved</th>
			<th>Obvious limitations</th>
			<th>Sample research question</th>
			<th>Comments</th>
			<c:forEach var="climate" items="${searchClimate}">
				<tr>

					<td>${climate.data_source_name}</td>
					<td><a href="#">${climate.url}</a></td>
					<td>${climate.date_accessed}</td>
					<td>${climate.regions_covered}</td>
					<td>${climate.other_region}</td>
					<td>${climate.spatial_scale}</td>
					<td>${climate.other_spatial}</td>
					<td>${climate.sampling_units}</td>
					<td>${climate.data_available}</td>
					<td>${climate.other_indiv_aggre}</td>
					<td>${climate.individual_characteristics}</td>
					<td>${climate.other_individual_char}</td>
					<td>${climate.population_characteristics}</td>
					<td>${climate.other_population_char}</td>
					<td>${climate.health_data}</td>
					<td>${climate.other_health_data}</td>
					<td>${climate.climate_data}</td>
					<td>${climate.other_climate_data}</td>
					<td>${climate.socio_eco}</td>
					<td>${climate.other_socio_data}</td>
					<td>${climate.eco_data}</td>
					<td>${climate.other_eco_data}</td>
					<td>${climate.other_data}</td>
					<td>${climate.time_period_avail_data}</td>
					<td>${climate.ferquency_data_coll}</td>
					<td>${climate.other_freq_data}</td>
					<td>${climate.open_source}</td>
					<td>${climate.tasks_involved}</td>
					<td>${climate.obvious_limitations}</td>
					<td>${climate.sample_research_question}</td>
					<td>${climate.comments}</td>

					<td><a href="editClimate?id=${climate.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteClimate?id=${climate.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Climate Data <a href="newClimate">here</a>
		</h4>
	</div>
</body>
</html>