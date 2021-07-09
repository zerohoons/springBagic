package com.ict.VO;

import org.springframework.web.multipart.MultipartFile;

public class VO {
	//f_name은 DB에 저장할 이름
	private String name, f_name;
	
	// 업로드할 때, vo로 받아 사용할 이름. 즉<input type="file" name = "file_name">
	private MultipartFile file_name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public MultipartFile getFile_name() {
		return file_name;
	}

	public void setFile_name(MultipartFile file_name) {
		this.file_name = file_name;
	}

	
}
