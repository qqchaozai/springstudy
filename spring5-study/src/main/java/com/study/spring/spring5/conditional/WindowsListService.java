package com.study.spring.spring5.conditional;
/**
 * 
 * @author chaozai
 * @date 2018年9月7日
 *
 */
public class WindowsListService implements ListService{

    @Override
    public String showListCmd() {
	return "dir";
    }

}