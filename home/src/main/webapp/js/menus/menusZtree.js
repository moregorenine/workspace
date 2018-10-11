var addCount = 1;
var rMenu;
var zTree; 

$(document).ready(function() {
	$.fn.zTree.init($("#zTree"), setting, zNodes);
	zTree = $.fn.zTree.getZTreeObj("zTree");
	//우클릭 Event
	rMenu = $("#rMenu");
	//Drag Event
	setCheck();
});

var setting = {
		edit: {
			enable: true,
			showRemoveBtn: true,
			showRenameBtn: true
		},
		data: {
			simpleData: {
				enable: true
			}
		},
		view: {
			dblClickExpand: false
		},
		callback: {
			onRightClick: onRightClick,
			beforeDrag: beforeDrag,
			beforeDrop: beforeDrop
		}
	};

/*var zNodes =[
	{ id:1, pId:0, name:"pNode 1", open:true},
	{ id:11, pId:1, name:"pNode 11"},
	{ id:111, pId:11, name:"leaf node 111"},
	{ id:112, pId:11, name:"leaf node 112"},
	{ id:113, pId:11, name:"leaf node 113"},
	{ id:114, pId:11, name:"leaf node 114"},
	{ id:12, pId:1, name:"pNode 12"},
	{ id:121, pId:12, name:"leaf node 121"},
	{ id:122, pId:12, name:"leaf node 122"},
	{ id:123, pId:12, name:"leaf node 123"},
	{ id:124, pId:12, name:"leaf node 124"},
	{ id:13, pId:1, name:"pNode 13 - no child", isParent:true},
	{ id:2, pId:0, name:"pNode 2"},
	{ id:21, pId:2, name:"pNode 21", open:true},
	{ id:211, pId:21, name:"leaf node 211"},
	{ id:212, pId:21, name:"leaf node 212"},
	{ id:213, pId:21, name:"leaf node 213"},
	{ id:214, pId:21, name:"leaf node 214"},
	{ id:22, pId:2, name:"pNode 22"},
	{ id:221, pId:22, name:"leaf node 221"},
	{ id:222, pId:22, name:"leaf node 222"},
	{ id:223, pId:22, name:"leaf node 223"},
	{ id:224, pId:22, name:"leaf node 224"},
	{ id:23, pId:2, name:"pNode 23"},
	{ id:231, pId:23, name:"leaf node 231"},
	{ id:232, pId:23, name:"leaf node 232"},
	{ id:233, pId:23, name:"leaf node 233"},
	{ id:234, pId:23, name:"leaf node 234"},
	{ id:3, pId:0, name:"pNode 3 - no child", isParent:true}
];*/

/**
 * 우클릭후 Add Node 클릭 event
 * @returns
 */
function addTreeNode() {
	hideRMenu();
	var newNode = { name:"newNode " + (addCount++)};
	if (zTree.getSelectedNodes()[0]) {
		zTree.addNodes(zTree.getSelectedNodes()[0], newNode);
	} else {
		zTree.addNodes(null, newNode);
	}
}

function beforeDrag(treeId, treeNodes) {
	for (var i=0,l=treeNodes.length; i<l; i++) {
		if (treeNodes[i].drag === false) {
			return false;
		}
	}
	return true;
}

function beforeDrop(treeId, treeNodes, targetNode, moveType) {
	return targetNode ? targetNode.drop !== false : true;
}

/**
 * 우클릭 display layer hide 처리
 * @returns
 */
function hideRMenu() {
	if (rMenu) rMenu.css({"visibility": "hidden"});
	/*$("body").unbind("mousedown", onBodyMouseDown);*/
}

/**
 * 우클릭 display layer 버튼 클릭 이벤트 설정
 * @param event
 * @returns
 */
function onBodyMouseDown(event){
	if (!(event.target.id == "rMenu" || $(event.target).parents("#rMenu").length>0)) {
		rMenu.css({"visibility" : "hidden"});
	}
}

/**
 * 우클릭 event 설정
 * @param event
 * @param treeId
 * @param treeNode
 * @returns
 */
function onRightClick(event, treeId, treeNode) {
	if (!treeNode && event.target.tagName.toLowerCase() != "button" && $(event.target).parents("a").length == 0) {
		zTree.cancelSelectedNode();
		showRMenu("root", event.clientX, event.clientY);
	} else if (treeNode && !treeNode.noR) {
		zTree.selectNode(treeNode);
		showRMenu("node", event.clientX, event.clientY);
	}
}

/**
 * 우클릭후 Delete Node 클릭 event
 * @returns
 */
function removeTreeNode() {
	hideRMenu();
	var nodes = zTree.getSelectedNodes();
	if (nodes && nodes.length>0) {
		if (nodes[0].children && nodes[0].children.length > 0) {
			var msg = "If you delete this node will be deleted along with sub-nodes. \n\nPlease confirm!";
			if (confirm(msg)==true){
				zTree.removeNode(nodes[0]);
			}
		} else {
			zTree.removeNode(nodes[0]);
		}
	}
}

/**
 * 우클릭후 Resume zTree 클릭 event
 * @returns
 */
function resetTree() {
	hideRMenu();
	$.fn.zTree.init($("#zTree"), setting, zNodes);
}

/**
 * 환결 설정
 * @returns
 */
function setCheck() {
	zTree.setting.edit.drag.isCopy = true;
	zTree.setting.edit.drag.isMove = true;
	zTree.setting.edit.drag.prev = true;
	zTree.setting.edit.drag.inner = true;
	zTree.setting.edit.drag.next = true;
}

/**
 * 우클릭시 layer display
 * @param type
 * @param x
 * @param y
 * @returns
 */
function showRMenu(type, x, y) {
	$("#rMenu ul").show();
	if (type=="root") {
		$("#m_del").hide();
	} else {
		$("#m_del").show();
	}

    y += document.body.scrollTop;
    x += document.body.scrollLeft;
    rMenu.css({"top":y+"px", "left":x+"px", "visibility":"visible"});

	$("body").bind("mousedown", onBodyMouseDown);
}