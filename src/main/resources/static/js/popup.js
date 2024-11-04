/* 공통 팝업창 모달 생성 */
window.onload = function(){
    //div 태그 생성 (모달창 + 백그라운드)
    const modal = document.createElement("div");
    modal.setAttribute("class", "modal");
    document.body.appendChild(modal);

    //모달창 생성
    const modalIframe = document.createElement("iframe");
    modalIframe.setAttribute("id", "modalIframe");
    modal.appendChild(modalIframe);

}

/* 공통 팝업창 모달 오픈함수*/
function gfn_openPopup(url, fileName, option, callBack){
   let lv_url = url;

   if(url == null || url == ""){
    alert("url 넣어라 임마.");
   }

    //모달 iframe
    var iframe = document.getElementById("modalIframe");
    iframe.src = lv_url;
    iframe.onload = function() {
        _lfn_openPopup(fileName, option, callBack);
    };


}

function _fn_close(callBack, fileName){
    // Get the modal
    var modal = document.getElementsByClassName("modal")[0];
    modal.style.display = "none";

    if(callBack){
        callBack(fileName);
    }
}

function _lfn_openPopup(fileName, option, callBack){
   let lv_fileName = fileName;
   let lv_popupTitle = option.title;
   let lv_width = option.width;
   let lv_height = option.height;

   var iframe = document.getElementById("modalIframe");

   const modal = document.getElementsByClassName("modal")[0];

    //모달 바디
    const modalHttpBody = iframe.contentDocument.getElementsByClassName("modal-http-body")[0];
    modalHttpBody.style.width = lv_height;
    modalHttpBody.style.width = lv_width;

    //모달 헤더
    const modalHeaderText = iframe.contentDocument.getElementById("popup-title");
    modalHeaderText.innerText = lv_popupTitle;

    //모달 헤더 - X버튼
    const closeBtn = iframe.contentDocument.getElementsByClassName("modal-close")[0];
    closeBtn.addEventListener("click", function(){ _fn_close(callBack, lv_fileName);}, {once: true});

    // 모달의 div 를 body 태그에 append 하여 생성
    modal.style.display = "block";
}