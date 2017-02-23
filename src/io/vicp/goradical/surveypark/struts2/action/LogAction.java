package io.vicp.goradical.surveypark.struts2.action;

import io.vicp.goradical.surveypark.model.Log;
import io.vicp.goradical.surveypark.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Scope("prototype")
public class LogAction extends BaseAction<Log> {
	private static final long serialVersionUID = -6215784774217971893L;

	@Autowired
	private LogService logService;

	private List<Log> logs;

	/**
	 * 查询全部日志
	 * @return
	 */
	public String findAllLogs() {
		logs = logService.findAllEntities();
		return "logListPage";
	}

	public List<Log> getLogs() {
		return logs;
	}

	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}
}
