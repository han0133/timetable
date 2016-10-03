/**
 * 
 */

//과목을 추가합니다
function ajaxFn() {
	$.ajax({
	     url:'/addSubject'
	     ,type: 'POST'
	     ,dataType:'json'
	     ,data: { code : subjectCode}
	     ,success:function(result){
	        console.log('성공');
	    	var result = result[0];
	    	
	    		//1~2학점은  주 2시간의 수업을 진행. 3학점은 주2시간x2회 총4시간 수업 진행
	    		//선택한 강의을 시간표에 출력
	    	 	for(var i = 0; i<result.time.length; i++){
	    	 	//	console.log('for문실행');
	    	 		console.log(result.time[i]);
	    	 		
	    	 		//같은 시간에 선택한 강의가 있으면 강의 추가 불가
	    	 		if($('#'+result.time[i]).html() != ""){
	    	 			/////////////////////////////////////경고창 두번 출력되는 부분 수정할것////////////////////////////////
	    	 			alert('추가 불가');
	    	 		}else{
	    	 			//강의를 추가합니다
	        	 		$('#'+result.time[i]).html(result.name+'('+result.professor+')<br>'+result.classroom+'<div class="codeClassTable" style="display: none;">'+result.code+'</div>');
	    	 		}
	    		} 
	     }
	 })
}