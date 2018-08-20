package com.uiFramework.companyName.ProjectName.helper.resource;

/**
 * 
 *
 */
public class ResourceHelper {

	public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        System.out.println(basePath +"/"+ path);
		return basePath +"/"+ path;
	}
	
	public static void main(String[] args) {
		String path = ResourceHelper.getResourcePath("src/main/java/com/uiFramework/companyName/ProjectName/helper/logger/LoggerHelper.java");
		System.out.println(path);
	}
}
