package com.sellopy.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.sellopy.model.Product;

public interface FileService {
	
	public Boolean uploadFile(MultipartFile file) throws IOException;
	
	public byte[] downloadFile(String file) throws Exception;
	
	public Boolean saveProduct(Product product);

	String uploadFileWithData(MultipartFile file) throws IOException;
}
