package org.activiti.engine;

/**
 * <p>  </p>
 *
 * @author LiuXianglin
 * @version 1.0
 * @date 2020/12/2 10:34
 */
public interface AssigneeType {
    /**
     * 按人员
     */
    String ROLE_ASSIGNEE = "1";
    /**
     * 按人员组
     */
    String ROLE_ASSIGNEE_GROUP = "2";
    /**
     * 按照流程发起人
     */
    String ROLE_INITIATOR = "3";
}
