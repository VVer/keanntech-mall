package com.keanntech.mall.mbg.model;

import java.io.Serializable;

public class SysRoleAdmin extends SysRoleAdminKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_admin.admin_id
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    private Long adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_admin.role_id
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role_admin
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_admin.admin_id
     *
     * @return the value of sys_role_admin.admin_id
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_admin.admin_id
     *
     * @param adminId the value for sys_role_admin.admin_id
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_admin.role_id
     *
     * @return the value of sys_role_admin.role_id
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_admin.role_id
     *
     * @param roleId the value for sys_role_admin.role_id
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_admin
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
