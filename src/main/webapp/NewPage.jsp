<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>

<%@page import="Data.SendRec"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%--     <%@ page import="com.google.gson.Gson"%> --%>
<%-- <%@ page import="com.google.gson.JsonObject"%> --%>
<!DOCTYPE html>
<html>
<head>
<link href="CSS.css"  type="text/css" rel="stylesheet"   /> 
<!-- The Above is code CSS  -->
	<%
	SendRec view = new SendRec();
	
	int count = view.getCount();
	int Words = view.getWord();
	int space = view.getSpace();
	int line = view.getLine();
	
	LinkedHashMap<String, Integer> wordcount =
    new LinkedHashMap<String, Integer>();

try { 
BufferedReader in = new BufferedReader(
                          new FileReader("E:\\College\\4th Year\\KmeanGit\\Group-project-4th-tgpcet\\sampledataset.txt"));
String str;

while ((str = in.readLine()) != null) { 
    str = str.toLowerCase(); // convert to lower case 
    String[] words = str.split("\\s+"); //split the line on whitespace, would return an array of words

    for( String word : words ) {
      if( word.length() == 0 ) {
        continue; 
      }

      Integer occurences = wordcount.get(word);

      if( occurences == null) {
        occurences = 1;
      } else {
        occurences++;
      }

      wordcount.put(word, occurences);
    }
 } 
} 
catch(Exception e){
e.printStackTrace();
}

ArrayList<Integer> values = new ArrayList<Integer>();
values.addAll(wordcount.values());
Collections.sort(values, Collections.reverseOrder());
int last_i = -1;

ArrayList<String> myStrings = new ArrayList<String>();
int[] number = new int[10];
int increment=0 ;


for (Integer i : values.subList(0, 9)) { 
    if (last_i == i) // without duplicates
        continue;
    last_i = i;

        for (String s : wordcount.keySet()) { 
        	if (wordcount.get(s) == i) // which have this value  
        		{  
        		myStrings.add(s);
        		//int abc=i;
        	//	String abd=s;       	
        	
        	int in=0;
        	number[increment]=i;
        	increment++;
        			
        			//System.out.println(s+ " " + i);
        		
        			}	
    	    }
   
	}
	%>
	
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
	<u>We Will Preview the All Data </u> <br><br><br>
	<label >The Total Words Are <b> <%=Words %></b></label> <br> <br> 
	<label >The Total Character are<b> <%=count %> </b></label> <br> <br>
	<label >The Total Line are <b><%=line%> </b></label> <br> <br>
	<label >The Total Space are <b> <%= space%> </b></label> <br> <br>
	<div>
	
	</div>
	</form>	
<!-- 	====================================================================== -->
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Age', 'Repeat'],
          [ '<%=myStrings.get(0)%>' , <%=values.get(0)%>], 
          [ '<%=myStrings.get(1)%>',  <%=values.get(1)%>],
          [ '<%=myStrings.get(2)%>',     <%=values.get(2)%>],
          [ '<%=myStrings.get(3)%>',  <%=values.get(3)%>],
          [ '<%=myStrings.get(4)%>', <%=values.get(4)%>],
          [ '<%=myStrings.get(5)%>',    <%=values.get(5)%>],
          [ '<%=myStrings.get(6)%>',    <%=values.get(6)%>],
          [ '<%=myStrings.get(7)%>',    <%=values.get(7)%>],
          [ '<%=myStrings.get(8)%>',    <%=values.get(8)%>],       
          [ '<%=myStrings.get(9)%>',    <%=values.get(9)%>]
          ]       
        );

        var options = {
          title: 'Clustring',
          hAxis: {title: 'Item Name'},
          vAxis: {title: 'Repeat'},
          legend: 'none'
        };

        var chart = new google.visualization.ScatterChart(document.getElementById('chart_div'));

        chart.draw(data, options);
      }
    </script>
<!-- 	=============================================================================================================== 	-->
	
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	 <script type="text/javascript">
       google.charts.load('current', {'packages':['corechart']});
       google.charts.setOnLoadCallback(drawChart);


       function drawChart() {
		
     	var name= document.getElementById('count');
        var data = google.visualization.arrayToDataTable([
           ['Task', 'Hours per Day'],
           ['Word',    <%=Words %>],
           ['Line',    <%=line%>],
           ['Space',  <%= space%>],
           ['Character', <%=count %>],
        //   ['Sleep',    7]
      ]);

       var options = {
           title: 'Analysis '
        };

         var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }  </script> 
		
	<div class="parent" >
	<div id="piechart" style="width: 900px; height: 500px;"></div>
	<div id="chart_div" style="width: 900px; height: 500px;"></div>
	</div>
	
</body>
</html>