package com.dhcc.dic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.dic.entity.TTablespace;
import com.dhcc.dic.service.TableService;
import com.dhcc.dic.service.TablespaceService;

@Controller
@RequestMapping("/tablespace")
public class TablespaceController {
	@Autowired
	private TablespaceService tablespaceService;
	
	@RequestMapping("/getOptionList")
	@ResponseBody
	public List<TTablespace> getOptionList(String projectId,String datasourceId) throws Exception{
		return this.tablespaceService.getOptionList(projectId, datasourceId);
	}
}
