package com.cong.entity;

public class Role extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.id
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.name
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.p_id
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    private String pId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.id
     *
     * @return the value of t_role.id
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.id
     *
     * @param id the value for t_role.id
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.name
     *
     * @return the value of t_role.name
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.name
     *
     * @param name the value for t_role.name
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.p_id
     *
     * @return the value of t_role.p_id
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    public String getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.p_id
     *
     * @param pId the value for t_role.p_id
     *
     * @mbg.generated Sat Sep 23 10:27:35 CST 2017
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }
}